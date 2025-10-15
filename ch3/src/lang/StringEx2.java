package lang;

import java.util.Arrays;

public class StringEx2 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + str2;
        System.out.println(str3);

        str1.concat(str2);

        boolean result = str3.contains(str1);
        System.out.println(result);

        str1 = "aaa";
        str2 = "bbb";
        System.out.println(str1.compareTo(str2));

        String fileName = "file.txt";
        fileName.endsWith(fileName);

        str1 = "java.lang.Object";
        System.out.println(str1.lastIndexOf('.'));
        System.out.println(str1.indexOf('.'));

        int arr[] = { 3, 4, 5, 6 };
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i);
        }

        System.out.println(str1.length());
        System.out.println(str1.replace('j', 'b'));

        str1 = "Hello";
        System.out.println("Hellolo".replace('l', 'b'));

        String animals = "dog,cat,bear";
        String[] arr2 = animals.split(",");
        System.out.println(Arrays.toString(arr2));
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        String[] arr3 = animals.split(",", 2);
        System.out.println(Arrays.toString(arr3));

        str1 = "java.lang.Object";
        System.out.println(str1.startsWith("java"));
        System.out.println(str1.startsWith("lang"));

        System.out.println("ABCDEFG".toLowerCase());

        System.out.println("    Hello World".trim());
        System.out.println("    Hello World    ".trim());
        System.out.println("    Hello       World".trim());

        String str4 = String.valueOf(154);

    }
}
