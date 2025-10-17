package util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorEx {
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

        Set<String> set1 = new HashSet<>();
        set1.add("사과");
        set1.add("귤");
        set1.add("수박");
        set1.add("멜론");
        set1.add("키위");
        set1.add("배");
        set1.add("감");

        // 전체 조회
        // 1. foreach (*)
        // 2. 표준화된 방법 => iterator

        Iterator<String> iter1 = list1.iterator();
        Iterator<String> iter2 = set1.iterator();

        while (iter1.hasNext()) {
            String str = iter1.next();
            System.out.println("list : " + str);
        }

        while (iter2.hasNext()) {
            String str = iter2.next();
            System.out.println("set : " + str);
        }
    }
}
