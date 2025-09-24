package control;

import java.util.Scanner;

public class SwitchEx1 {
    public static void main(String[] args) {
        // 현재 월 입력받기
        // 3,4,5 봄, 6,7,8 여름 9,10,11 가을, 12,1,2 겨울

        Scanner sc = new Scanner(System.in);
        System.out.print("현재 월 입력 : ");
        int month = Integer.parseInt(sc.nextLine());
        String season;
        if (month < 1 || month > 12) {
            System.out.println("잘못된 입력입니다.");
        } else {
            int result = month / 3;
            // if (month >= 3 && month < 6) {
            // season = "봄";
            // } else if (month >= 6 && month < 9) {
            // season = "여름";
            // } else if (month >= 9 && month < 12) {
            // season = "가을";
            // } else {
            // season = "겨울";
            // }
            switch (result) {
                case 1:
                    season = "봄";
                    break;
                case 2:
                    season = "여름";
                    break;
                case 3:
                    season = "가을";
                    break;
                default:
                    season = "겨울";
                    break;
            }
            System.out.printf("%s", season);
        }

        sc.close();
    }
}
