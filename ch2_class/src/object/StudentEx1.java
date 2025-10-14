package object;

public class StudentEx1 {
    public static void main(String[] args) {
        // 객체 생성 == 인스턴스 생성
        Student obj = new Student();

        // 인스턴스 초기화
        obj.name = "홍길동";
        obj.tel = "010-1234-5678";
        obj.address = "서울시 종로구 15";

        // obj.changeName();
        System.out.println(obj);

        // 메서드 호출
        // 1) 결과 반환 : 변수에 담거나 혹은 print구문
        // 2) 결과 반환 X : 호출만 하기 (void)
        // System.out.println(obj.getAddress());

        Student student = new Student();
        // 멤버변수 값 변경
        student.setName("성춘향");
        student.setTel("010-5678-8596");
        student.setAddress("경기도 수원시");
        // System.out.println(student);
        // 멤버변수 값 가져오기
        System.out.println(student.getName());

        student.changeName("성천사");
        System.out.println(student);

    }
}
