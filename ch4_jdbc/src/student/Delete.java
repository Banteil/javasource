package student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Delete {
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

            String sql = "delete from student where student_id=?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, studentId);

            int rows = pstmt.executeUpdate();
            System.out.println(rows > 0 ? "삭제 성공" : "삭제 실패");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBConnectionManager.close(rs, pstmt, con);
            sc.close();
        }
    }
}
