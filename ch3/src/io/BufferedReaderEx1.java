package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderEx1 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("c:\\temp\\file1.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\temp\\output5.txt"));

            String input = null;
            while ((input = br.readLine()) != null) {
                bw.write(input);
                bw.newLine();
            }

            br.close();
            bw.flush(); // 버퍼 비우기
            bw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
