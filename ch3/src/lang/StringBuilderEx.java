package lang;

public class StringBuilderEx {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        String str1 = "abc";
        String str2 = str1.concat("bcd");

        builder.append(str2);
        builder.delete(0, 2);
        System.out.println(builder);

        builder.deleteCharAt(0);
        System.out.println(builder);

        builder.insert(1, "홍길동");
        System.out.println(builder);

        builder = new StringBuilder("Hello");
        StringBuilder builder2 = new StringBuilder("Hello");
        System.out.println(builder.equals(builder2));

        str1 = builder.toString();
        str2 = new String(builder2);
        System.out.println(str1.equals(str2));

    }
}
