package lang;

import java.util.Scanner;

//모든 클래스의 부모 : Object
public class ObjectEx {
    public static void main(String[] args) {
        // String str = new String();
        Object object1 = new Object();
        Object object2 = new Object();
        System.out.println(object1.equals(object2) ? "같다" : "다르다");
        System.out.println(object1 == object2 ? "두 객체는 같다" : "두 객체는 다르다");

        Value value1 = new Value(10);
        Value value2 = new Value(10);
        System.out.println(value1.equals(value2) ? "같다" : "다르다");
        System.out.println(value1 == value2 ? "두 Value는 같다" : "두 Value는 다르다");
        System.out.println(value1.value == value2.value ? "두 Value의 값은 같다" : "두 Value의 값은 다르다");

        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println(str1.equals(str2) ? "같다" : "다르다");
        System.out.println(str1 == str2 ? "두 String은 같다" : "두 String은 다르다");

        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}
