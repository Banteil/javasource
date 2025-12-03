package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx3 {
    public static void main(String[] args) {
        String[] strArr = {"사과", "바나나", "딸기", "포도", "메론"};

        // java.util.Arrays : 배열과 관련된 기능 제공
        // Arrays.toString(strArr);
        // Arrays.asList(strArr);
        // Arrays.sort(strArr);
        // Stream<String> stream = Arrays.stream(strArr);
        // stream.forEach((x) -> System.out.println(x));
        // stream.forEach(System.out::println);

        List<String> list = Arrays.asList("사과", "바나나", "딸기", "포도", "메론"); // 크기 고정 생성
        // java.lang.UnsupportedOperationException
        // list.add("수박");
        Stream<String> stream2 = list.stream();
        stream2.forEach(System.out::println);
        List<String> list2 = List.of("사과", "바나나", "딸기", "포도", "메론");
        // java.lang.UnsupportedOperationException
        // list2.add("두리안");

        Stream<String> stream3 = Stream.of("사과", "바나나", "딸기", "포도", "메론");
        IntStream.range(1, 10).forEach(System.out::println);
        IntStream.rangeClosed(1, 10).forEach(System.out::println);
    }
}
