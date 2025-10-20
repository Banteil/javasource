package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Writer;

public class ReaderEx2 {
    public static void main(String[] args) {
        try {
            InputStream in = new FileInputStream("c:\\temp\\file1.txt");
            InputStreamReader is = new InputStreamReader(in, "utf8");
            Writer out = new FileWriter("c:\\temp\\output3.txt");

            int input = 0;
            char[] cbuf = new char[1024];
            while ((input = is.read(cbuf)) != -1) {
                System.out.println(input);
                out.write(cbuf, 0, input);
            }
            System.out.println(cbuf);

            in.close();
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
