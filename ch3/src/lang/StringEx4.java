package lang;

public class StringEx4 {
    public static void main(String[] args) {
        String[] names = { "Queen", "Tod", "Kim", "Park", "Hong" };
        String result = findKim(names);
        System.out.println(result);
    }

    public static String findKim(String[] names) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].compareTo("Kim") == 0) {
                return "Kim은 " + (i + 1) + "번째에 있다.";
            }
        }
        return "Kim은 없다.";
    }
}
