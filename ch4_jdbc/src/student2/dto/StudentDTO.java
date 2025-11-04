package student2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// @Data == @ToString, @Getter, @Setter, @RequiredArgsConstructor, @EqualsAndHashCode

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentDTO {
    private String studentId;
    private String name;
    private double height;
    private String deptId;
}
