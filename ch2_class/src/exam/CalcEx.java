package exam;

import java.util.Scanner;

public class CalcEx {
    public static void main(String[] args) {
        Calc cal;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Num1 : ");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.print("Input Num2 : ");
        int num2 = Integer.parseInt(sc.nextLine());
        System.out.print("Input operator : ");
        String op = sc.nextLine();
        switch (op) {
            case "+":
                cal = new Add();
                break;
            case "-":
                cal = new Sub();
                break;
            case "*":
                cal = new Mul();
                break;
            case "/":
                cal = new Div();
                break;
            default:
                System.out.println("operator fail");
                sc.close();
                return;
        }
        cal.setValue(num1, num2);
        System.out.println(cal.calculate());
        sc.close();
    }
}
