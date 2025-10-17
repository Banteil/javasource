package util;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx1 {
    public static void main(String[] args) {
        List<String> list1 = new LinkedList<>();
        list1.add("사과");
        list1.add("귤");
        list1.add("수박");
        list1.add("멜론");
        list1.add("키위");
        list1.add("배");
        list1.add("감");
        list1.add("망고");

        System.out.println(list1);

        list1.remove(2);
        System.out.println(list1);

        list1.set(0, "포도");
        System.out.println(list1);

        System.out.println(list1.get(3));

        for (String string : list1) {
            System.out.println(string);
        }
    }
}
