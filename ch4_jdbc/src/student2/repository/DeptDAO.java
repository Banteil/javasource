package student2.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import student2.JDBCUtil;
import student2.dto.DeptDTO;

// ~~DAO(Data Access Object)
public class DeptDAO {
    private PreparedStatement pstmt;
    private ResultSet rs;

    public int insert(DeptDTO dto) {
        int result = 0;
        try {
            String sql = "insert into department values(?,?)";
            pstmt = JDBCUtil.con.prepareStatement(sql);
            pstmt.setString(1, dto.getDeptId());
            pstmt.setString(2, dto.getDeptName());
            result = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(rs, pstmt);
        }
        return result;
    }

    public int delete(String input) {
        int result = 0;
        try {
            String sql = "delete from department where dept_id=?";
            pstmt = JDBCUtil.con.prepareStatement(sql);
            pstmt.setString(1, input);
            result = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(rs, pstmt);
        }
        return result;
    }

    public int update(DeptDTO dto) {
        int result = 0;
        try {
            String sql = "update department set dept_name = ? where dept_id=?";
            pstmt = JDBCUtil.con.prepareStatement(sql);
            pstmt.setString(1, dto.getDeptName());
            pstmt.setString(2, dto.getDeptId());
            result = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(rs, pstmt);
        }

        return result;
    }

    public DeptDTO getRow(String input) {
        DeptDTO dto = null;
        try {
            String sql = "select * from department where dept_name = ?";
            pstmt = JDBCUtil.con.prepareStatement(sql);
            pstmt.setString(1, input);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                String deptId = rs.getString("dept_id");
                String deptName = rs.getString("dept_name");
                dto = new DeptDTO(deptId, deptName);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(rs, pstmt);
        }
        return dto;
    }

    public List<DeptDTO> getRows() {
        List<DeptDTO> list = new ArrayList<>();
        try {
            String sql = "select * from department order by dept_id";
            pstmt = JDBCUtil.con.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                String deptId = rs.getString("dept_id");
                String deptName = rs.getString("dept_name");

                DeptDTO dto = new DeptDTO(deptId, deptName);
                list.add(dto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(rs, pstmt);
        }
        return list;
    }
}
