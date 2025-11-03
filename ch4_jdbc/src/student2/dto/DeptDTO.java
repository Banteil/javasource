package student2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// @Data == @ToString, @Getter, @Setter, @RequiredArgsConstructor, @EqualsAndHashCode

@NoArgsConstructor
@AllArgsConstructor
@Data
public class DeptDTO {
    private String deptId;
    private String deptName;
}
