package util;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SetEx3 {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<>();
        set.add(new Member("hong12", "hong12", "홍길동1"));
        set.add(new Member("hong13", "hong13", "홍길동2"));
        set.add(new Member("hong14", "hong14", "홍길동3"));
        set.add(new Member("hong12", "hong12", "홍길동1"));

        for (Member member : set) {
            System.out.println(member);
        }
    }
}
