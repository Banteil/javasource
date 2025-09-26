package array;

import java.util.Arrays;

public class ArrayEx7 {
    public static void main(String[] args) {
        String[] strArr = { "Kim", "Park", "Yi" };

        // char 배열과 String 배열
        // String : char 배열 + 기능
        String[] strArr2 = new String[3];
        strArr2[0] = "Kim";
        strArr2[1] = "Park";
        strArr2[2] = "Yi";

        System.out.println(Arrays.toString((strArr)));
        System.out.println(strArr[0].length());
        System.out.println(strArr[0].charAt(0));

        for (int i = 0; i < strArr2[0].length(); i++) {
            System.out.println(strArr2[0].charAt(i) + ", ");
        }
        char[] chArr = strArr[0].toCharArray();
        System.out.println("char 배열 : " + chArr);

        System.out.println(Arrays.toString((strArr2)));
        System.out.println(strArr2[0].length());
    }
}
