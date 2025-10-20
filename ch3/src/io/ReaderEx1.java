package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ReaderEx1 {
    public static void main(String[] args) {
        try {
            Reader in = new FileReader("c:\\temp\\file1.txt");
            Writer out = new FileWriter("c:\\temp\\output2.txt");

            int input = 0;
            char[] cbuf = new char[1024];
            while ((input = in.read(cbuf)) != -1) {
                System.out.println(input);
                // out.write(cbuf);
                out.write(new String(cbuf));
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
