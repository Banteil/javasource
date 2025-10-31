package emp;

import java.sql.DriverManager;

public class Connect {
    public static void main(String[] args) {
        // db서버 연결
        try {
            // 1. 드라이버 로드
            Class.forName("oracle.jdbc.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "scott";
            String password = "TIGER";

            // 2. DB 연결
            DriverManager.getConnection(url, user, password);
            System.out.println("연결되었습니다.");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
