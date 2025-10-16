package lang;

public class ExceptionEx2 {
    public static void main(String[] args) throws Exception {
        int[] arr = new int[10];
        System.out.println("총합 : " + getTotal(arr));
        System.out.println("평균 : " + getAverage(arr));
    }

    public static double getAverage(int[] arr) throws Exception {
        if (arr.length == 0)
            throw new Exception("비어 있는 배열입니다.");
        return getTotal(arr) / arr.length;
    }

    public static int getTotal(int[] arr) {
        int sum = 0;
        for (int val : arr) {
            sum += val;
        }
        return sum;
    }
}
