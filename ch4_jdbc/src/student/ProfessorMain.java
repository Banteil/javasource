package student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ProfessorMain {
    private static final int INSERT = 1;
    private static final int UPDATE = 2;
    private static final int DELETE = 3;
    private static final int SELECT = 4;
    private static final int EXIT = 5;

    private static Scanner sc = new Scanner(System.in);
    private static Connection con = null;
    private static PreparedStatement pstmt = null;
    private static ResultSet rs = null;

    public static void main(String[] args) {
        try {
            con = DBConnectionManager.getConnection(DBConnectionManager.DB_TYPE.ORACLE);

            while (true) {
                System.out.println("================================");
                System.out.println("1. 교수정보 입력");
                System.out.println("2. 교수정보 수정");
                System.out.println("3. 교수정보 삭제");
                System.out.println("4. 교수정보 조회");
                System.out.println("5. 종료");
                System.out.println("================================");
                System.out.print("선택 >> ");

                int menu = -1;
                try {
                    menu = Integer.parseInt(sc.nextLine());
                    switch (menu) {
                        case INSERT:
                            ProfessorDTO dto = insert();
                            String sql = "insert into professor(prof_id, prof_name, dept_id) values(?,?,?)";
                            pstmt = con.prepareStatement(sql);
                            pstmt.setString(1, dto.getProfId());
                            pstmt.setString(2, dto.getProfName());
                            pstmt.setString(3, dto.getDeptId());

                            int rows = pstmt.executeUpdate();
                            System.out.println(rows > 0 ? "삽입 성공" : "삽입 실패");
                            break;
                        case UPDATE:
                            update();
                            break;
                        case DELETE:
                            delete();
                            break;
                        case SELECT:
                            select();
                            break;
                        case EXIT:
                            return;
                        default:
                            continue;
                    }
                } catch (Exception e) {
                    continue;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBConnectionManager.close(rs, pstmt, con);
            sc.close();
        }
    }

    public static ProfessorDTO insert() {
        ProfessorDTO dto = new ProfessorDTO();

        System.out.print("교수 코드 입력 >> ");
        dto.setProfId(sc.nextLine());
        System.out.print("이름 입력 >> ");
        dto.setProfName(sc.nextLine());
        System.out.print("학과 코드 입력 >> ");
        dto.setDeptId(sc.nextLine());

        return dto;
    }

    public static void update() {
        System.out.print("교수 코드 입력 >> ");
        String id = sc.nextLine();
        System.out.print("컬럼명 입력 >> ");
        String column = sc.nextLine();
        System.out.print("변경할 값 입력 >> ");
        String value = sc.nextLine();

        String sqlTemplate = "update professor set %s = ? where prof_id=?";
        String sql = String.format(sqlTemplate, column);
        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, value);
            pstmt.setString(2, id);

            int rows = pstmt.executeUpdate();
            System.out.println(rows > 0 ? "업데이트 성공" : "업데이트 실패");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void delete() {
        System.out.print("교수 코드 입력 >> ");
        String id = sc.nextLine();

        String sql = "delete from professor where prof_id=?";
        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, id);

            int rows = pstmt.executeUpdate();
            System.out.println(rows > 0 ? "삭제 성공" : "삭제 실패");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void select() {
        System.out.print("교수 코드 입력 >> ");
        String inputId = sc.nextLine();

        try {
            if (inputId.equals("ALL")) {
                String sql = "select * from professor";
                pstmt = con.prepareStatement(sql);
                rs = pstmt.executeQuery();

                while (rs.next()) {
                    String id = rs.getString("prof_id");
                    String name = rs.getString("prof_name");
                    String deptId = rs.getString("dept_id");
                    System.out.printf("%s\t%s\t%s\n", id, name, deptId);
                }
            } else {

                String sql = "select * from professor where prof_id=?";
                pstmt = con.prepareStatement(sql);
                pstmt.setString(1, inputId);
                rs = pstmt.executeQuery();

                if (rs.next()) {
                    String id = rs.getString("prof_id");
                    String name = rs.getString("prof_name");
                    String deptId = rs.getString("dept_id");
                    System.out.printf("%s\t%s\t%s\n", id, name, deptId);
                } else {
                    System.out.println("해당 코드의 데이터가 존재하지 않습니다.");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
