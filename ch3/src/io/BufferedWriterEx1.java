package io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class BufferedWriterEx1 {
    public static void main(String[] args) {
        // 키보드에서 입력을 받아 파일에 출력하는 프로그램
        // q 입력 시 입력받던걸 중지
        try {
            FileOutputStream fos = new FileOutputStream("c:\\temp\\writer1.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos, "EUC-KR");
            BufferedWriter bw = new BufferedWriter(osw);

            Scanner sc = new Scanner(System.in, "EUC-KR");
            do {
                String input = sc.nextLine();
                if (input.equals("q"))
                    break;

                System.out.println(input);
                bw.write(input);
                bw.newLine();
            } while (true);

            bw.flush(); // 버퍼 비우기
            bw.close();
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
