package util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//컬렉션 프레임워크 - 데이터를 담아서 처리하는 방법
// - Collection 인터페이스
//  - List 인터페이스
//      - ArrayList, Vector, LinkedList, Stack, Queue ...
//  - Set 인터페이스
//      - HashSet, TreeSet..
//  - Map 인터페이스
//      - HashMap, TreeMap..
public class ListEx2 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(30);
        ArrayList<String> list2 = new ArrayList<>(30);
        List<String> list3 = List.of("사과", "딸기", "포도");
        List<String> list6 = new ArrayList<>(List.of("사과", "딸기", "포도"));
        // 배열로 리스트 생성하기
        String[] fruits = { "사과", "딸기", "포도" };
        List<String> list4 = Arrays.asList(fruits);

        list1.add("사과");
        list2.add("사과");
        // list3.add("바나나");
        // list4.add("바나나"); // UnsupportedOperationException (배열이었기에)
        // list4.remove(0);

        String[] fruits2 = { "사과", "딸기", "포도" };
        List<String> list5 = new ArrayList<>(Arrays.asList(fruits2));
        list5.add("바나나");
        System.out.println(list5);
        list6.add("망고");
        System.out.println(list6);
    }
}
