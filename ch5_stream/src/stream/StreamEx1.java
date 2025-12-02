package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("사과");
        list.add("감");
        list.add("포도");
        list.add("바나나");

        // for (String string : list) {
        // System.out.println(string);
        // }

        String[] strArr = {"사과", "배", "감"};
        // List<String> list2 = Arrays.asList(strArr);
        Stream<String> stream1 = list.stream();
        Stream<String> stream2 = Arrays.stream(strArr);

        // Consumer<? super String> action
        stream1.sorted(Comparator.reverseOrder()).forEach((x) -> System.out.println(x));
        // stream2.sorted().forEach((x) -> System.out.println(x));
    }
}
