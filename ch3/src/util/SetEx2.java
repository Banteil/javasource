package util;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SetEx2 {
    public static void main(String[] args) {
        // 1~45 => 6개 무작위 추출 (중복 X)
        // List, Set
        Set<Integer> set = new HashSet<>();

        long startTime = System.currentTimeMillis();
        while (set.size() < 6) {
            int num = (int) (Math.random() * 45) + 1;
            set.add(num);
        }
        long endTime = System.currentTimeMillis();

        System.out.println(set);
        System.out.println("숫자 추출 걸린 시간 : " + (endTime - startTime) + " ms");

        // Set => List 변환
        List<Integer> list = new LinkedList<>(set);
        // 정렬
        Collections.sort(list);
        System.out.println(list);

        Collections.sort(null);

        // List => Set 변환
        Set<Integer> set2 = new HashSet<>(list);
        System.out.println(set2);
    }
}
