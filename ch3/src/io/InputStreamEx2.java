package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamEx2 {
    public static void main(String[] args) {
        try {
            // InputStream in = new FileInputStream(new File(""));
            InputStream in = new FileInputStream("c:\\temp\\img1.jpg");
            OutputStream out = new FileOutputStream("c:\\temp\\copy2.jpg");

            int input = 0;
            byte[] bytes = new byte[1024];
            while ((input = in.read(bytes)) != -1) {
                System.out.print((char) input);
                out.write(input);
            }

            in.close();
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
