package lang;

public class ExceptionEx5 {
    public static void main(String[] args) {
        try {
            String data1 = args[0];
            String data2 = "a100";
            int val = Integer.parseInt(data1);
            System.out.println(val);

        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("ArrayIndexOutOfBoundsException or NumberFormatException");
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
