package stream;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx4 {
    public static void main(String[] args) {
        Stream<File> stream =
                Stream.of(new File("file1.txt"), new File("file2.txt"), new File("file3.txt"),
                        new File("file4.txt"));
        // 파일명만 추출해서 하나의 리스트로 반환
        List<String> nameList = new ArrayList<>();
        nameList = stream.map(File::getName).collect(Collectors.toList());
        // nameList = stream.map(File::getName).toList();
        System.out.println(nameList);
        // Stream<String> names = stream.map((f) -> f.getName());
        // Stream<String> names = stream.map(File::getName);
        // names.forEach(System.out::println);

        List<String> list2 = List.of("abc", "def", "apple", "melon", "text");
        for (String string : list2) {
            System.out.println(string.toUpperCase());
        }
        Stream<String> stream2 = Stream.of("abc", "def", "apple", "melon", "text");
        stream2.map(String::toUpperCase).forEach(System.out::println);

        // filter : 조건에 안 맞는 요소 제외
        List<String> list3 = List.of("바둑", "바나나", "포도", "딸기", "바질", "강아지");
        // for (String string : list3) {
        // if (string.startsWith("바")) {
        // System.out.println(string);
        // }
        // }
        list3.stream().filter(s -> s.startsWith("바")).forEach(System.out::println);
        Stream.of(new Student("홍길동", 98), new Student("김길동", 92), new Student("박길동", 88),
                new Student("이길동", 48)).filter(s -> s.getName().startsWith("이"))
                .forEach(System.out::println);
        // 이름이 "이"로 시작하는 학생 추출

        IntStream.rangeClosed(1, 20).filter(i -> i % 2 == 0).forEach(System.out::println);

        Stream<String> stream5 = Stream.of("바둑", "바나나", "포도", "바둑", "딸기", "바질", "강아지");
        stream5.distinct().forEach(System.out::println);

        Stream<File> stream6 =
                Stream.of(new File("file1.txt"), new File("file2.txt"), new File("Ex1"),
                        new File("Ex2.bak"), new File("Test.java"));
        File file = new File("Arr.java");
        int lastIndex = file.getName().lastIndexOf(".");
        String extension = file.getName().substring(lastIndex + 1);
        System.out.println(extension);

        stream6.map(File::getName)
                .peek(f -> System.out.printf("이름 %s\n", f))
                .filter(f -> f.lastIndexOf(".") > -1)
                .map(s -> s.substring(s.lastIndexOf(".") + 1))
                .distinct()
                .forEach(System.out::println);

        Stream<String> stream7 = Stream.of("바둑", "바나나", "포도", "바둑", "딸기", "바질", "강아지");
        stream7.skip(2).limit(3).forEach(System.out::println);

        Stream<Student> stream8 = Stream
                .of(new Student("홍길동", 98), new Student("김길동", 92), new Student("박길동", 88),
                        new Student("이길동", 48));

        List<Integer> jumsus = stream8.map(Student::getJumsu).collect(Collectors.toList());
        System.out.println(jumsus);

        IntStream.rangeClosed(1, 20).filter(i -> i % 2 == 0).count();
        IntStream.rangeClosed(1, 20).filter(i -> i % 2 == 0).average();
        IntStream.rangeClosed(1, 20).filter(i -> i % 2 == 0).sum();
        IntStream.rangeClosed(1, 20).filter(i -> i % 2 == 0).max();
        IntStream.rangeClosed(1, 20).filter(i -> i % 2 == 0).min();
    }
}
