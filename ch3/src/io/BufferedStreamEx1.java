package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamEx1 {
    public static void main(String[] args) {
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("c:\\temp\\img1.jpg"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("c:\\temp\\copy2.jpg"));

            int input = 0;
            byte[] bytes = new byte[10024];
            while ((input = bis.read(bytes)) != -1) {
                System.out.println(input);
                bos.write(bytes);
            }

            for (byte b : bytes) {
                System.out.print((char) b);
            }

            bos.flush(); // 버퍼 비우기
            bis.close();
            bos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
