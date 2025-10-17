package util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx1 {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("사과");
        set1.add("귤");
        set1.add("수박");
        set1.add("멜론");
        set1.add("키위");
        set1.add("배");
        set1.add("감");
        set1.add("감");

        System.out.println(set1);

        // 삭제
        set1.remove("수박");
        System.out.println(set1);

        // 수정:x, 중간삽입:x (set구조 특성상 안됨)

        // 전체 조회
        for (String str : set1) {
            System.out.println(str);
        }
        // set은 중복 요소를 저장하지 않음
        // 특정 조회 (못함)

        Iterator<String> iterator = set1.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.println(str);
        }
    }
}
