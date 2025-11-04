package student2.ui;

import java.util.List;
import java.util.Scanner;

import student2.dto.DeptDTO;
import student2.dto.ProfessorDTO;
import student2.dto.StudentDTO;

public class ConsoleInfo {
    public DeptDTO setDept(Scanner sc) {
        DeptDTO deptDto = new DeptDTO();

        System.out.print("학과 코드 입력 >> ");
        deptDto.setDeptId(sc.nextLine());
        System.out.print("학과명 입력 >> ");
        deptDto.setDeptName(sc.nextLine());

        return deptDto;
    }

    public DeptDTO updateDept(Scanner sc) {
        DeptDTO deptDto = new DeptDTO();

        System.out.print("학과 코드 입력 >> ");
        deptDto.setDeptId(sc.nextLine());
        System.out.print("수정할 학과명 입력 >> ");
        deptDto.setDeptName(sc.nextLine());

        return deptDto;
    }

    public DeptDTO deleteDept(Scanner sc) {
        DeptDTO deptDto = new DeptDTO();

        System.out.print("학과 코드 입력 >> ");
        deptDto.setDeptId(sc.nextLine());

        return deptDto;
    }

    public String selectDept(Scanner sc) {
        System.out.print("학과명 입력 >> ");
        return sc.nextLine();
    }

    public void printALLDept(List<DeptDTO> deptList) {
        System.out.println("\n------전체 학과 정보------");
        System.out.println("학과번호\t학과명");
        System.out.println("--------------------------");
        for (DeptDTO deptDTO : deptList) {
            System.out.print(deptDTO.getDeptId() + "\t");
            System.out.println(deptDTO.getDeptName());
        }
    }

    public void print(DeptDTO dto) {
        if (dto == null) {
            System.out.println("입력한 정보의 학과는 존재하지 않습니다.");
            return;
        }

        System.out.println("\n------학과 정보------");
        System.out.println("학과번호\t학과명");
        System.out.println("--------------------------");
        System.out.print(dto.getDeptId() + "\t");
        System.out.println(dto.getDeptName());
    }

    public ProfessorDTO setProf(Scanner sc) {
        ProfessorDTO dto = new ProfessorDTO();

        System.out.print("교수 코드 입력 >> ");
        dto.setProfId(sc.nextLine());
        System.out.print("교수명 입력 >> ");
        dto.setProfName(sc.nextLine());
        System.out.print("학과 코드 입력 >> ");
        dto.setDeptId(sc.nextLine());

        return dto;
    }

    public ProfessorDTO updateProf(Scanner sc) {
        ProfessorDTO dto = new ProfessorDTO();

        System.out.print("교수 코드 입력 >> ");
        dto.setProfId(sc.nextLine());
        System.out.print("수정할 교수명 입력 >> ");
        dto.setProfName(sc.nextLine());

        return dto;
    }

    public ProfessorDTO deleteProf(Scanner sc) {
        ProfessorDTO dto = new ProfessorDTO();

        System.out.print("교수 코드 입력 >> ");
        dto.setProfId(sc.nextLine());

        return dto;
    }

    public String selectProf(Scanner sc) {
        System.out.print("교수명 입력 >> ");
        return sc.nextLine();
    }

    public void printALLProf(List<ProfessorDTO> profList) {
        System.out.println("\n------전체 교수 정보------");
        System.out.println("교수번호\t교수명\t학과번호");
        System.out.println("--------------------------");
        for (ProfessorDTO profDto : profList) {
            System.out.print(profDto.getProfId() + "\t");
            System.out.print(profDto.getProfName() + "\t");
            System.out.println(profDto.getDeptId());
        }
    }

    public void print(ProfessorDTO dto) {
        if (dto == null) {
            System.out.println("입력한 이름의 교수는 존재하지 않습니다.");
            return;
        }
        System.out.println("\n------교수 정보------");
        System.out.println("교수번호\t교수명\t학과번호");
        System.out.println("--------------------------");
        System.out.print(dto.getProfId() + "\t");
        System.out.print(dto.getProfName() + "\t");
        System.out.println(dto.getDeptId());
    }

    public StudentDTO setStudent(Scanner sc) {
        StudentDTO dto = new StudentDTO();

        System.out.print("학생 코드 입력 >> ");
        dto.setStudentId(sc.nextLine());
        System.out.print("이름 입력 >> ");
        dto.setName(sc.nextLine());
        System.out.print("키 입력 >> ");
        dto.setHeight(Double.parseDouble(sc.nextLine()));
        System.out.print("학과 코드 입력 >> ");
        dto.setDeptId(sc.nextLine());

        return dto;
    }

    public StudentDTO updateStudent(Scanner sc) {
        StudentDTO dto = new StudentDTO();

        System.out.print("학생 코드 입력 >> ");
        dto.setStudentId(sc.nextLine());
        System.out.print("수정할 키 입력 >> ");
        dto.setHeight(Double.parseDouble(sc.nextLine()));

        return dto;
    }

    public StudentDTO deleteStudent(Scanner sc) {
        StudentDTO dto = new StudentDTO();

        System.out.print("학생 코드 입력 >> ");
        dto.setStudentId(sc.nextLine());

        return dto;
    }

    public String selectStudent(Scanner sc) {
        System.out.print("학생 코드 입력 >> ");
        return sc.nextLine();
    }

    public void printALLStudent(List<StudentDTO> studentList) {
        System.out.println("\n------전체 학생 정보------");
        System.out.println("학생번호\t학생명\t키\t학과번호");
        System.out.println("--------------------------");
        for (StudentDTO dto : studentList) {
            System.out.print(dto.getStudentId() + "\t");
            System.out.print(dto.getName() + "\t");
            System.out.print(dto.getHeight() + "\t");
            System.out.println(dto.getDeptId());
        }
    }

    public void print(StudentDTO dto) {
        if (dto == null) {
            System.out.println("입력한 코드의 학생은 존재하지 않습니다.");
            return;
        }
        System.out.println("\n------학생 정보------");
        System.out.println("학생번호\t학생명\t키\t학과번호");
        System.out.println("--------------------------");
        System.out.print(dto.getStudentId() + "\t");
        System.out.print(dto.getName() + "\t");
        System.out.print(dto.getHeight() + "\t");
        System.out.println(dto.getDeptId());
    }
}
