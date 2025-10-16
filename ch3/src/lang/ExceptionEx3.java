package lang;

public class ExceptionEx3 {
    public static void main(String[] args) {
        // 1. NullPointerException
        // String str = null;
        // System.out.println(str.length()); // NullPointerException

        // 2. ArrayIndexOutOfBoundsException
        // String data1 = args[0];
        // System.out.println(data1);

        // 3. NumberFormatException
        // String data2 = "a100";
        // int value1 = Integer.parseInt(data2);
        // System.out.println(value1);

        try {
            String data2 = "a100";
            int value1 = Integer.parseInt(data2);
            System.out.println(value1);
        } catch (Exception e) {
            System.out.println("NumberFormatException!");
        }

        // 4. ClassCastException
        // Dog dog = new Dog();
        // changeDog(dog);
        // Cat cat = new Cat();
        // changeDog(cat);
    }

    public static void changeDog(Animal animal) {
        Dog dog = (Dog) animal;
    }
}
