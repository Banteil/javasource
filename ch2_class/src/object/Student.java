package object;

public class Student {
    // 멤버변수, 멤버메소드, 생성자

    // 멤버변수 (속성)
    // 이름(홍길동), 전화번호(010-1234-5678), 주소(서울시 종로구 25)
    String name;
    String tel;
    String address;

    // 생성자
    public Student() {
    }

    // 커스텀 메소드
    String changeName(String name) {
        this.name = name;
        return this.name;
    }

    // 메소드
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getTel() {
        return tel;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Student [name = " + name + ", tel = " + tel + ", address = " + address + "]";
    }
}
