package array;

import java.util.Arrays;

public class ArrayEx6 {
    public static void main(String[] args) {
        int[] numbers = new int[45];
        Arrays.setAll(numbers, i -> i + 1);

        System.out.println("스왑 전 : " + Arrays.toString(numbers));

        for (int i = 0; i < 6; i++) {
            int index = (int) (Math.random() * (numbers.length - 1));
            if (i == index)
                continue;
            int temp = numbers[i];
            numbers[i] = numbers[index];
            numbers[index] = temp;
        }

        System.out.println("스왑 후 : " + Arrays.toString(numbers));
    }
}
