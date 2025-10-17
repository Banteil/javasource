package util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//ArrayList : 순차적인 추가 삭제는 빠름, 중간에 추가 삭제는 느림, 검색은 빠름
//LinkedList : 순차적인 추가 삭제는 느림, 중간에 추가 삭제는 빠름, 검색은 느림

public class LinkedListEx2 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list1.add(0, String.valueOf(i));
        }
        long endTime = System.currentTimeMillis();
        System.out.println("ArrayList 걸린 시간 : " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list2.add(0, String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList 걸린 시간 : " + (endTime - startTime) + " ms");
    }
}
