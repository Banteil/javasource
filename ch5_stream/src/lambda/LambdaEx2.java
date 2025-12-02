package lambda;

public class LambdaEx2 {
    public static void main(String[] args) {
        Lambda4 lambda4 = () -> System.out.println("람다식");
        lambda4.run();

        System.out.println("-----------------------------");
        execute(getRun());
    }

    public static Lambda4 getRun() {
        Lambda4 lambda4 = () -> System.out.println("getRun");
        return lambda4;
    }

    public static void execute(Lambda4 lambda4) {
        lambda4.run();
    }
}
