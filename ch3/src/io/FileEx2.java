package io;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEx2 {
    public static void main(String[] args) {
        File currDir = new File("c:\\temp");
        File[] files = currDir.listFiles();
        for (File file : files) {
            System.out.println(file.getName());
        }

        if (!currDir.exists()) {
            currDir.mkdir(); // 디렉토리(폵더 생성)
        }

        File dir = new File("c:\\temp\\dir");
        File file1 = new File("c:\\temp\\dir\\file1.txt");
        File file2 = new File("c:\\temp\\file1.txt");
        File file3 = new File("c:\\temp\\file2.txt");

        if (!dir.exists()) {
            dir.mkdirs();
        }

        if (!file1.exists()) {
            try {
                file1.createNewFile();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        if (!file2.exists()) {
            try {
                file2.createNewFile();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        if (!file3.exists()) {
            try {
                file3.createNewFile();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        files = currDir.listFiles();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
        System.out.println("\t날짜      시간    형태    크기    이름");
        System.out.println("=============================================");
        for (File file : files) {
            System.out.print(sdf.format((new Date(file.lastModified()))));
            if (file.isDirectory()) {
                System.out.print("\t<DIR>\t\t" + file.getName());
            } else {
                System.out.print("\t\t\t" + file.length() + "\t" + file.getName());
            }
            System.out.println();
        }
    }
}
