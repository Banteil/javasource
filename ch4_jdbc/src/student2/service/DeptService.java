package student2.service;

import static student2.JDBCUtil.*;

import java.util.ArrayList;
import java.util.List;

import student2.JDBCUtil.DB_TYPE;
import student2.dto.DeptDTO;
import student2.repository.DeptDAO;

public class DeptService {
    public boolean addDept(DeptDTO dto) {
        boolean isAdd = false;
        try {
            connection(DB_TYPE.ORACLE);
            DeptDAO dao = new DeptDAO();
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

    public boolean updateDept(DeptDTO dto) {
        boolean isUpdate = false;
        try {
            connection(DB_TYPE.ORACLE);
            DeptDAO dao = new DeptDAO();
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

    public boolean removeDept(DeptDTO dto) {
        boolean isRemove = false;
        try {
            connection(DB_TYPE.ORACLE);
            DeptDAO dao = new DeptDAO();
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

    public DeptDTO getDept(String deptName) {
        DeptDTO dto = new DeptDTO();
        try {
            connection(DB_TYPE.ORACLE);
            DeptDAO dao = new DeptDAO();
            dto = dao.getRow(deptName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dto;
    }

    public List<DeptDTO> getDepts() {
        List<DeptDTO> deptList = new ArrayList<>();
        try {
            connection(DB_TYPE.ORACLE);
            DeptDAO dao = new DeptDAO();
            deptList = dao.getRows();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return deptList;
    }
}
