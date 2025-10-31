package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Delete {
    public static void main(String[] args) {
        // db서버 연결
        try {
            // 1. 드라이버 로드
            Class.forName("oracle.jdbc.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "scott";
            String password = "TIGER";

            // 2. DB 연결
            Connection con = DriverManager.getConnection(url, user, password);

            String sql = "delete from emp where empno = 7499";
            PreparedStatement pstmt = con.prepareStatement(sql);
            int result = pstmt.executeUpdate();
            System.out.println("Result : " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
