package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insert {
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

            String sql = "INSERT INTO EXAM_EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES((SELECT MAX(EMPNO) + 1 FROM EXAM_EMP), 'ORACLE5', 'SALESMAN', NULL, SYSDATE, 1000, NULL, 20)";
            PreparedStatement pstmt = con.prepareStatement(sql);
            int result = pstmt.executeUpdate();
            System.out.println("Result : " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
