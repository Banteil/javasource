package object;

//1.인스턴스 (멤버) 메서트 : 클래스 영역 => 인스턴스 생성 후
//2. 클래스 메서드 : 클래스 영역(static) => 클래스가 메모리에 올라갈때

public class MethodCall {
    int iv = 10;
    static int cv = 20;
    int iv2 = cv;

    static void staticMethod1() {
        MethodCall obj = new MethodCall();
        System.out.println(obj.iv);
        System.out.println(cv);
    }

    static void staticMethod2() {
        // 클래스 메서드 호출
        staticMethod1();
        // instanceMethod1();
    }

    void instanceMethod1() {
        System.out.println(iv);
        System.out.println(cv);
    }

    void instanceMethod2() {
        staticMethod1();
        instanceMethod1();
    }
}
