package student2.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import student2.JDBCUtil;
import student2.dto.ProfessorDTO;

// ~~DAO(Data Access Object)
public class ProfessorDAO {
    private PreparedStatement pstmt;
    private ResultSet rs;

    public int insert(ProfessorDTO dto) {
        int result = 0;
        try {
            String sql = "insert into professor values(?,?,?)";
            pstmt = JDBCUtil.con.prepareStatement(sql);
            pstmt.setString(1, dto.getProfId());
            pstmt.setString(2, dto.getProfName());
            pstmt.setString(3, dto.getDeptId());
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
            String sql = "delete from professor where prof_id=?";
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

    public int update(ProfessorDTO dto) {
        int result = 0;
        try {
            String sql = "update professor set prof_name=? where prof_id=?";
            pstmt = JDBCUtil.con.prepareStatement(sql);
            pstmt.setString(1, dto.getProfName());
            pstmt.setString(2, dto.getProfId());
            result = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(rs, pstmt);
        }

        return result;
    }

    public ProfessorDTO getRow(String input) {
        ProfessorDTO dto = null;
        try {
            String sql = "select * from professor where prof_name = ?";
            pstmt = JDBCUtil.con.prepareStatement(sql);
            pstmt.setString(1, input);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                String profId = rs.getString("prof_id");
                String profName = rs.getString("prof_name");
                String deptId = rs.getString("dept_id");
                dto = new ProfessorDTO(profId, profName, deptId);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(rs, pstmt);
        }
        return dto;
    }

    public List<ProfessorDTO> getRows() {
        List<ProfessorDTO> list = new ArrayList<>();
        try {
            String sql = "select * from professor order by prof_id";
            pstmt = JDBCUtil.con.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                String profId = rs.getString("prof_id");
                String profName = rs.getString("prof_name");
                String deptId = rs.getString("dept_id");

                ProfessorDTO dto = new ProfessorDTO(profId, profName, deptId);
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
