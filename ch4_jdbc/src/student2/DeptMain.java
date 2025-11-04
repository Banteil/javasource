package student2;

import java.util.Scanner;

import student2.service.DeptService;
import student2.service.ProfessorService;
import student2.service.StudentService;
import student2.ui.ConsoleInfo;

public class DeptMain {
    private static final int DEPT_INSERT = 1;
    private static final int DEPT_UPDATE = 2;
    private static final int DEPT_DELETE = 3;
    private static final int DEPT_SELECT = 4;
    private static final int DEPT_ALL_SELECT = 5;

    private static final int PROF_INSERT = 6;
    private static final int PROF_UPDATE = 7;
    private static final int PROF_DELETE = 8;
    private static final int PROF_SELECT = 9;
    private static final int PROF_ALL_SELECT = 10;

    private static final int STUDENT_INSERT = 11;
    private static final int STUDENT_UPDATE = 12;
    private static final int STUDENT_DELETE = 13;
    private static final int STUDENT_SELECT = 14;
    private static final int STUDENT_ALL_SELECT = 15;

    private static final int EXIT = 16;

    public static void main(String[] args) throws Exception {
        JDBCUtil.connection(JDBCUtil.DB_TYPE.ORACLE);
        Scanner sc = new Scanner(System.in);

        DeptService deptService = new DeptService();
        ProfessorService profService = new ProfessorService();
        StudentService studentService = new StudentService();
        ConsoleInfo info = new ConsoleInfo();

        while (true) {
            System.out.println("===================================");
            System.out.print("1. 학과등록 | ");
            System.out.print("2. 학과수정 | ");
            System.out.print("3. 학과삭제 | ");
            System.out.print("4. 학과조회 | ");
            System.out.print("5. 전체학과조회 | ");
            System.out.println();
            System.out.print("6. 교수정보 입력 | ");
            System.out.print("7. 교수정보 수정 | ");
            System.out.print("8. 교수정보 삭제 | ");
            System.out.print("9. 교수정보 조회 | ");
            System.out.print("10. 전체 교수정보 조회 | ");
            System.out.println();
            System.out.print("11. 학생정보 입력 | ");
            System.out.print("12. 학생정보 수정 | ");
            System.out.print("13. 학생정보 삭제 | ");
            System.out.print("14. 학생정보 조회 | ");
            System.out.print("15. 전체 학생정보 조회 | ");
            System.out.println("16. 프로그램 종료");
            System.out.println("===================================");
            System.out.print("선택 >> ");

            try {
                int menu = Integer.parseInt(sc.nextLine());
                boolean result = false;
                switch (menu) {
                    case DEPT_INSERT:
                        result = deptService.addDept(info.setDept(sc));
                        System.out.println(result ? "등록 성공" : "등록 실패");
                        break;
                    case DEPT_UPDATE:
                        result = deptService.updateDept(info.updateDept(sc));
                        System.out.println(result ? "수정 성공" : "수정 실패");
                        break;
                    case DEPT_DELETE:
                        result = deptService.removeDept(info.deleteDept(sc));
                        System.out.println(result ? "삭제 성공" : "삭제 실패");
                        break;
                    case DEPT_SELECT:
                        info.print(deptService.getDept(info.selectDept(sc)));
                        break;
                    case DEPT_ALL_SELECT:
                        info.printALLDept(deptService.getDepts());
                        break;
                    case PROF_INSERT:
                        result = profService.addProf(info.setProf(sc));
                        System.out.println(result ? "등록 성공" : "등록 실패");
                        break;
                    case PROF_UPDATE:
                        result = profService.updateProf(info.updateProf(sc));
                        System.out.println(result ? "수정 성공" : "수정 실패");
                        break;
                    case PROF_DELETE:
                        result = profService.removeProf(info.deleteProf(sc));
                        System.out.println(result ? "삭제 성공" : "삭제 실패");
                        break;
                    case PROF_SELECT:
                        info.print(profService.getProf(info.selectProf(sc)));
                        break;
                    case PROF_ALL_SELECT:
                        info.printALLProf(profService.getProfs());
                        break;
                    case STUDENT_INSERT:
                        result = studentService.addStudent(info.setStudent(sc));
                        System.out.println(result ? "등록 성공" : "등록 실패");
                        break;
                    case STUDENT_UPDATE:
                        result = studentService.updateStudent(info.updateStudent(sc));
                        System.out.println(result ? "수정 성공" : "수정 실패");
                        break;
                    case STUDENT_DELETE:
                        result = studentService.removeStudent(info.deleteStudent(sc));
                        System.out.println(result ? "삭제 성공" : "삭제 실패");
                        break;
                    case STUDENT_SELECT:
                        info.print(studentService.getStudent(info.selectStudent(sc)));
                        break;
                    case STUDENT_ALL_SELECT:
                        info.printALLStudent(studentService.getStudents());
                        break;
                    case EXIT:
                        JDBCUtil.disconnect();
                        sc.close();
                        return;
                    default:
                        continue;
                }
            } catch (Exception e) {
                e.printStackTrace();
                continue;
            }
        }
    }
}
