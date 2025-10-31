package student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Insert {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        Scanner sc = new Scanner(System.in);
        try {
            con = DBConnectionManager.getConnection(DBConnectionManager.DB_TYPE.ORACLE);

            System.out.print("아이디 입력 >> ");
            String studentId = sc.nextLine();

            System.out.print("이름 입력 >> ");
            String name = sc.nextLine();

            System.out.print("키 입력 >> ");
            double height = Double.parseDouble(sc.nextLine());

            System.out.print("학과 코드 입력 >> ");
            String deptId = sc.nextLine();

            String sql = "insert into student(student_id, name, height, dept_id) values(?,?,?,?)";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, studentId);
            pstmt.setString(2, name);
            pstmt.setDouble(3, height);
            pstmt.setString(4, deptId);

            int rows = pstmt.executeUpdate();
            System.out.println(rows > 0 ? "삽입 성공" : "삽입 실패");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBConnectionManager.close(rs, pstmt, con);
            sc.close();
        }
    }
}
