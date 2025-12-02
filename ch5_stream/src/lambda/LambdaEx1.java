package lambda;

public class LambdaEx1 {
    public static void main(String[] args) {
        // Lambda lambda = new Lambda() {
        // @Override
        // public void method() {

        // }
        // };
        // lambda.method();

        Lambda lambda = () -> System.out.println("함수형 인터페이스");
        lambda.method();
        lambda = () -> {
            int i = 10;
            System.out.println("함형 " + i);
        };
        lambda.method();

        Lambda2 lambda2 = (x) -> System.out.println(x);
        lambda2.method(15);

        Lambda3 lambda3 = (a, b) -> a > b ? a : b;
        System.out.println(lambda3.max(20, 15));
    }
}
