package lombok2;

import lombok.*;

@EqualsAndHashCode // equals(), hashCode()
@AllArgsConstructor // 전체 멤버변수 이용한 생성자
@NoArgsConstructor // 기본 생성자
@Setter
@Getter
@ToString
@Builder
public class Account {
    private String name;
    private String accNo;
    private int balance;

    // 생성자, getter, setter, toString() => 어노테이션 처리
    // equals, hashCode, Builder
}
