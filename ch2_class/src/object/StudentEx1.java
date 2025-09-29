package object;

public class StudentEx1 {
    public static void main(String[] args) {
        Student obj = new Student(); // 인스턴스
        obj.name = "홍길동";
        obj.tel = "010-1234-5678";
        obj.address = "서울시 종로구 15";

        obj.changeName("성천사");
        // 메서드 호출
        // 1) 결과 반환 : 변수에 담거나 print
        // 2) 결과 반환 X
        System.out.println(obj);

        Student student = new Student(); // 인스턴스
        student.name = "성춘향";
        student.tel = "010-5678-8596";
        student.address = "경기도 수원시";
        System.out.println(student);

    }
}
