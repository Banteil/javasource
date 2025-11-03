package student2.service;

import static student2.JDBCUtil.*;

import java.util.ArrayList;
import java.util.List;

import student2.JDBCUtil.DB_TYPE;
import student2.dto.ProfessorDTO;
import student2.repository.ProfessorDAO;

public class ProfessorService {
    public boolean addProf(ProfessorDTO dto) {
        boolean isAdd = false;
        try {
            connection(DB_TYPE.ORACLE);
            ProfessorDAO dao = new ProfessorDAO();
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

    public boolean updateProf(ProfessorDTO dto) {
        boolean isUpdate = false;
        try {
            connection(DB_TYPE.ORACLE);
            ProfessorDAO dao = new ProfessorDAO();
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

    public boolean removeProf(ProfessorDTO dto) {
        boolean isRemove = false;
        try {
            connection(DB_TYPE.ORACLE);
            ProfessorDAO dao = new ProfessorDAO();
            int result = dao.delete(dto.getDeptId());
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

    public ProfessorDTO getProf(String profName) {
        ProfessorDTO dto = new ProfessorDTO();
        try {
            connection(DB_TYPE.ORACLE);
            ProfessorDAO dao = new ProfessorDAO();
            dto = dao.getRow(profName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dto;
    }

    public List<ProfessorDTO> getProfs() {
        List<ProfessorDTO> dtoList = new ArrayList<>();
        try {
            connection(DB_TYPE.ORACLE);
            ProfessorDAO dao = new ProfessorDAO();
            dtoList = dao.getRows();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dtoList;
    }
}
