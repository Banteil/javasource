package lang;

public class WrapperEx1 {
    public static void main(String[] args) {
        boolean b = true;
        Boolean boolean1 = new Boolean(b);
        Boolean boolean2 = false;

        // Byte byte = 1;
        Byte byte2 = Byte.valueOf((byte) 1);
        // boolean => Boolean
        // byte => Byte
        // char => Character
        // int => Integer
        // long => Long
        // float => Float
        // double => Double
    }
}
