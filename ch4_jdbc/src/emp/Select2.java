package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Select2 {
    public static void main(String[] args) {
        // db서버 연결
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            // 1. 드라이버 로드
            Class.forName("oracle.jdbc.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "scott";
            String password = "TIGER";

            // 2. DB 연결
            con = DriverManager.getConnection(url, user, password);
            System.out.println("연결되었습니다.");

            String sql = "select * from emp where empno=7499";
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt("empno") + "\t");
                System.out.println(rs.getString("ename") + "\t");
                System.out.println(rs.getString("job") + "\t");
                System.out.println(rs.getInt("mgr") + "\t");
                System.out.println(rs.getDate("hiredate") + "\t");
                System.out.println(rs.getDouble("sal") + "\t");
                System.out.println(rs.getDouble("comm") + "\t");
                System.out.println(rs.getInt("deptno") + "\t");
                System.out.println("=======================================");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                pstmt.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
