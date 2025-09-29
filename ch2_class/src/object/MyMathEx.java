package object;

public class MyMathEx {
    public static void main(String[] args) {
        MyMath math = new MyMath();

        System.out.println("덧셈 결과 : " + math.add(12, 23));
        System.out.println("뺄셈 결과 : " + math.sub(85, 23));
        System.out.println("곱셈 결과 : " + math.mul(85, 23));
        System.out.println("나눗셈 결과 : " + math.div(85, 23));
    }
}
