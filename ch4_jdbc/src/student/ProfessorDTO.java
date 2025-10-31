package student;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ProfessorDTO {
    private String profId;
    private String profName;
    private String deptId;

    // public ProfessorDTO(String profId, String profName, String deptId) {
    // this.profId = profId;
    // this.profName = profName;
    // this.deptId = deptId;
    // }

    // public String getProfId() {
    // return profId;
    // }

    // public void setProfId(String profId) {
    // this.profId = profId;
    // }

    // public String getProfName() {
    // return profName;
    // }

    // public void setProfName(String profName) {
    // this.profName = profName;
    // }

    // public String getDeptId() {
    // return deptId;
    // }

    // public void setDeptId(String deptId) {
    // this.deptId = deptId;
    // }

    // @Override
    // public String toString() {
    // return "ProfessorDTO [profId=" + profId + ", profName=" + profName + ",
    // deptId=" + deptId + "]";
    // }
}
