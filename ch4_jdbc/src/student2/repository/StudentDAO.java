package student2.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import student2.JDBCUtil;
import student2.dto.StudentDTO;

// ~~DAO(Data Access Object)
public class StudentDAO {
    private PreparedStatement pstmt;
    private ResultSet rs;

    public int insert(StudentDTO dto) {
        int result = 0;
        try {
            String sql = "insert into student values(?,?,?,?)";
            pstmt = JDBCUtil.con.prepareStatement(sql);
            pstmt.setString(1, dto.getStudentId());
            pstmt.setString(2, dto.getName());
            pstmt.setDouble(3, dto.getHeight());
            pstmt.setString(4, dto.getDeptId());
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
            String sql = "delete from student where student_id=?";
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

    // height 수정
    public int update(StudentDTO dto) {
        int result = 0;
        try {
            String sql = "update student set height=? where student_id=?";
            pstmt = JDBCUtil.con.prepareStatement(sql);
            pstmt.setDouble(1, dto.getHeight());
            pstmt.setString(2, dto.getStudentId());
            result = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(rs, pstmt);
        }

        return result;
    }

    public StudentDTO getRow(String input) {
        StudentDTO dto = null;
        try {
            String sql = "select * from student where student_id = ?";
            pstmt = JDBCUtil.con.prepareStatement(sql);
            pstmt.setString(1, input);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                String studentId = rs.getString("student_id");
                String name = rs.getString("name");
                double height = rs.getDouble("height");
                String deptId = rs.getString("dept_id");
                dto = new StudentDTO(studentId, name, height, deptId);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(rs, pstmt);
        }
        return dto;
    }

    public List<StudentDTO> getRows() {
        List<StudentDTO> list = new ArrayList<>();
        try {
            String sql = "select * from student order by student_id";
            pstmt = JDBCUtil.con.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                String studentId = rs.getString("student_id");
                String name = rs.getString("name");
                double height = rs.getDouble("height");
                String deptId = rs.getString("dept_id");

                StudentDTO dto = new StudentDTO(studentId, name, height, deptId);
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
