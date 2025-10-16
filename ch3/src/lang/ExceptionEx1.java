package lang;

public class ExceptionEx1 {
    public static void main(String[] args) {
        try {
            System.out.println(4 / 0);
        } catch (Exception e) {
            System.out.println("예외처리 : " + e.getMessage());
        }

        try {
            // Class.forName("null");
            findClass();
        } catch (ClassNotFoundException e1) {
            System.out.println("예외처리 : " + e1.getMessage());
            e1.printStackTrace();
        }
    }

    public static void findClass() throws ClassNotFoundException {
        Class.forName("null");
    }
}
