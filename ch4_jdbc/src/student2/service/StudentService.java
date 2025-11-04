package student2.service;

import static student2.JDBCUtil.*;

import java.util.ArrayList;
import java.util.List;

import student2.JDBCUtil.DB_TYPE;
import student2.dto.StudentDTO;
import student2.repository.StudentDAO;

public class StudentService {
    public boolean addStudent(StudentDTO dto) {
        boolean isAdd = false;
        try {
            connection(DB_TYPE.ORACLE);
            StudentDAO dao = new StudentDAO();
            int result = dao.insert(dto);

            if (result > 0) {
                commit(con);
                isAdd = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            rollback(con);
        }
        return isAdd;
    }

    public boolean updateStudent(StudentDTO dto) {
        boolean isUpdate = false;
        try {
            connection(DB_TYPE.ORACLE);
            StudentDAO dao = new StudentDAO();
            int result = dao.update(dto);
            if (result > 0) {
                commit(con);
                isUpdate = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            rollback(con);
        }
        return isUpdate;
    }

    public boolean removeStudent(StudentDTO dto) {
        boolean isRemove = false;
        try {
            connection(DB_TYPE.ORACLE);
            StudentDAO dao = new StudentDAO();
            int result = dao.delete(dto.getStudentId());
            if (result > 0) {
                commit(con);
                isRemove = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            rollback(con);
        }
        return isRemove;
    }

    public StudentDTO getStudent(String profName) {
        StudentDTO dto = new StudentDTO();
        try {
            connection(DB_TYPE.ORACLE);
            StudentDAO dao = new StudentDAO();
            dto = dao.getRow(profName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dto;
    }

    public List<StudentDTO> getStudents() {
        List<StudentDTO> dtoList = new ArrayList<>();
        try {
            connection(DB_TYPE.ORACLE);
            StudentDAO dao = new StudentDAO();
            dtoList = dao.getRows();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dtoList;
    }
}
