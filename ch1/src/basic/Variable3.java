package basic;

public class Variable3 {
    public static void main(String[] args) {
        // 실수형 : float, double(기본 타입)
        float score1 = 50.15f;
        double score2 = 45.125;

        var printVar = "score1 = %.2f \nscore2 = %.2f";
        System.out.printf(printVar, score1, score2);
    }
}
