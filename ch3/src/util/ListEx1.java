package util;

import java.util.ArrayList;
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
public class ListEx1 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("사과");
        list1.add("귤");
        list1.add("수박");
        list1.add("멜론");
        list1.add("키위");
        list1.add("배");
        list1.add("감");
        list1.add("망고");

        System.out.println(list1);
        System.out.println(list1.get(3));
        System.out.println(list1.size());

        list1.remove("수박");
        System.out.println(list1);

        list1.set(0, "포도");
        System.out.println(list1);

        list1.add(2, "딸기");
        System.out.println(list1);

        list1.sort(Comparator.reverseOrder());
        System.out.println(list1);
    }
}
