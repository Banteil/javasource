package object;

public class MethodCall {
    int iv = 10;
    static int cv = 20;
    int iv2 = cv;

    static void staticMethod1() {
        MethodCall obj = new MethodCall();
        System.out.println(obj.iv);
        System.out.println(cv);
    }

    void instanceMethod1() {
        // static 변수 호출
        System.out.println(cv);
        // 인스턴스변수호출
        System.out.println(iv);
    }

    static void staticMethod2() {
        // 클래스 메소드 호출
        staticMethod1();
        // 인스턴스 메소드 호출
        MethodCall obj = new MethodCall();
        obj.instanceMethod1();
    }

    void instanceMethod2() {
        // 클래스 메소드 호출
        staticMethod1();
        // 인스턴스 메소드 호출
        instanceMethod1();
    }
}
