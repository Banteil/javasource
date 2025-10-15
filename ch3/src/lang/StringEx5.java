package lang;

public class StringEx5 {
    public static void main(String[] args) {
        System.out.println(count("12345AB12AB345AB", "AB"));
        System.out.println(count("12345BC", "AB"));
    }

    public static int count(String src, String target) {
        int count = 0;
        int fromIndex = 0;

        while ((fromIndex = src.indexOf(target, fromIndex)) != -1) {
            count++;
            fromIndex += target.length();
        }
        return count;
    }
}
