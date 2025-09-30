package object;

public class SubcriberInfo {
    // 가입자 정보
    // 이름 아이디(영어, 숫자) 비밀번호(영,숫, 특), 전화번호(111-1111-1111)
    // name, id, password, phone

    // 기능 : 비번 변경(changePassword), 전번 변경(changePhone)
    private String id, password, phone;

    public SubcriberInfo() {
    }

    public SubcriberInfo(String id, String password, String phone) {
        this.id = id;
        this.password = password;
        this.phone = phone;
    }

    public void changePassword(String newPassword) {
        this.password = newPassword;
    }

    public void changePhone(String newPhone) {
        this.phone = newPhone;
    }

    public String getId() {
        return id;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "SubcriberInfo [id = " + id + ", password = " + password + ", phone = " + phone + "]";
    }
}
