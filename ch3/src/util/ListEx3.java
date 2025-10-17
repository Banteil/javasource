package util;

import java.util.ArrayList;
import java.util.List;

public class ListEx3 {
    public static void main(String[] args) {
        List<Member> list1 = new ArrayList<>();
        list1.add(new Member("hong12", "hong12", "홍길동1"));
        list1.add(new Member("hong13", "hong13", "홍길동2"));
        list1.add(new Member("hong14", "hong14", "홍길동3"));
        list1.add(new Member("hong15", "hong15", "홍길동4"));

        Member mem = list1.get(1);
        System.out.println("이름 : " + mem.getName());

        for (Member member : list1) {
            System.out.printf("%s\t%s\t%s\n", member.getId(), member.getPassword(), member.getName());
        }

        for (int i = 0; i < list1.size(); i++) {
            System.out.printf("%s\t%s\t%s\n", list1.get(i).getId(), list1.get(i).getPassword(), list1.get(i).getName());
        }
    }
}
