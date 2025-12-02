package lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaEx3 {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> (int) (Math.random() * 100) + 1;
        System.out.println(supplier.get());

        Consumer<Integer> consumer = (t) -> System.out.println(t);
        consumer.accept(10);

        Predicate<Integer> predicate = (t) -> t % 2 == 0;
        System.out.println(predicate.test(15) ? "짝" : "홀");

        Runnable runnable = () -> System.out.println("Run");
        runnable.run();

        Function<Integer, Integer> function = (x) -> x * x;
        System.out.println(function.apply(10));

        Function<String, Integer> function2 = (x) -> Integer.parseInt(x) + 10;
        System.out.println(function2.apply("35"));

        Predicate<String> checkSizeStr = (x) -> x.length() == 0;
        System.out.println(checkSizeStr.test("") ? "빈문자열입니다" : "str");

        BiConsumer<Integer, Integer> biConsumer = (x, y) -> System.out.println(x + y);
        biConsumer.accept(10, 5);

        BiFunction<String, String, Boolean> biFunction = (s1, s2) -> s1.equals(s2);
        System.out.println(biFunction.apply("null", "null") ? "같다" : "다르다");
    }
}
