package student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Select2 {
    public static void main(String[] args) {
        // db서버 연결
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        Scanner sc = new Scanner(System.in);
        try {
            con = DBConnectionManager.getConnection(DBConnectionManager.DB_TYPE.ORACLE);

            System.out.print("아이디 입력 >> ");
            String studentId = sc.nextLine();

            String sql = "select * from student where student_id=?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, studentId);

            rs = pstmt.executeQuery();

            while (rs.next()) {
                String id = rs.getString("student_id");
                String name = rs.getString("name");
                double height = rs.getDouble("height");
                String deptId = rs.getString("dept_id");
                System.out.printf("%s\t%s\t%.1f\t%s\n", id, name, height, deptId);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBConnectionManager.close(rs, pstmt, con);
            sc.close();
        }
    }
}
