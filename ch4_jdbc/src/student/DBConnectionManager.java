package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConnectionManager {

    // 💡 연결 정보 기본값 관리 (변수로 설정)
    private static String DEFAULT_IP = "localhost";
    private static String DEFAULT_ORACLE_DB_NAME = "xe"; // Oracle Service ID (SID)
    private static String DEFAULT_MYSQL_DB_NAME = "db_name"; // MySQL Schema/DB Name

    private final static String USER = "javadb";
    private final static String PASSWORD = "12345";

    // 2. DB_TYPE Enum 정의 확장
    public enum DB_TYPE {
        // ORACLE은 SID를, MYSQL은 DB_NAME을 인자로 받도록 템플릿 URL 사용
        ORACLE("oracle.jdbc.OracleDriver", "jdbc:oracle:thin:@%s:1521:%s"),
        MYSQL("com.mysql.cj.jdbc.Driver", "jdbc:mysql://%s:3306/%s");

        private final String driver;
        private final String urlTemplate; // URL 템플릿을 저장

        private DB_TYPE(String driver, String urlTemplate) {
            this.driver = driver;
            this.urlTemplate = urlTemplate;
        }

        public String getDriver() {
            return driver;
        }

        // 템플릿에 실제 IP와 DB 이름을 넣어 완성된 URL을 반환하는 메서드
        public String getUrl(String ip, String dbName) {
            return String.format(urlTemplate, ip, dbName);
        }
    }

    // 3. getConnection 메서드 오버로드 (IP/DBName 기본값 사용)
    public static Connection getConnection(DB_TYPE dbType) throws Exception {
        String dbName = (dbType == DB_TYPE.ORACLE) ? DEFAULT_ORACLE_DB_NAME : DEFAULT_MYSQL_DB_NAME;
        return getConnection(dbType, DEFAULT_IP, dbName, USER, PASSWORD);
    }

    // 4. 새로운 getConnection 메서드 (IP/DBName 지정 가능)
    public static Connection getConnection(DB_TYPE dbType, String ip, String dbName, String user, String password)
            throws Exception {

        // 1. 드라이버 로딩
        Class.forName(dbType.getDriver());

        // 2. URL 생성
        String finalUrl = dbType.getUrl(ip, dbName);

        System.out.println("Connecting to: " + finalUrl); // 디버깅용

        // 3. 연결 반환
        return DriverManager.getConnection(finalUrl, user, password);
    }

    public static void close(ResultSet rs, PreparedStatement pstmt, Connection con) {
        try {
            if (rs != null)
                rs.close();
        } catch (Exception e) {
        }
        try {
            if (pstmt != null)
                pstmt.close();
        } catch (Exception e) {
        }
        try {
            if (con != null)
                con.close();
        } catch (Exception e) {
        }
    }
}
