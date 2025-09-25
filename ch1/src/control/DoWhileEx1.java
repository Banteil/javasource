package control;

import java.util.Scanner;

public class DoWhileEx1 {
    public static void main(String[] args) {
        // 1 ~ 100 사이의 정수를 입력받기
        // 컴퓨터 임의의 수 : 1 ~ 100 사이의 정수
        // 컴퓨터가 생성한 임의의 수 맞추기

        Scanner sc = new Scanner(System.in);

        int randomNumber = (int) (Math.random() * 100) + 1;
        int num = 0;
        System.out.println("컴퓨터가 생각한 숫자를 입력하세요");
        do {
            System.out.print("1 ~ 100사이의 정수를 입력 : ");
            try {
                num = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("정확한 숫자를 입력해 주세요.");
                continue;
            }

            if (num < 1 || num > 100) {
                System.out.println("1 ~ 100 사이의 숫자를 입력해 주세요.");
                continue;
            } else {
                if (randomNumber > num) {
                    System.out.println("좀 더 큰 수로 시도해 보세요.");
                } else if (randomNumber < num) {
                    System.out.println("좀 더 작은 수로 시도해 보세요.");
                }
            }
        } while (randomNumber != num);

        System.out.printf("정답입니다! 컴퓨터가 생각한 숫자 : %d", randomNumber);

        sc.close();
    }
}
