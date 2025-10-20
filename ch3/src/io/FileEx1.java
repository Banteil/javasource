package io;

import java.io.File;

public class FileEx1 {
    public static void main(String[] args) {
        // 경로 지정 : / or \
        // \n, \t <= 이런게 있어서 경로지정하는거랑 구별하려면 \\ < 두번 씀
        // File file = new File("c:/temp/file1.txt");
        // File file = new File("c:\\temp\\file1.txt");
        // File file = new File("c:\\temp", "file1.txt");
        File parent = new File("c:\\temp");
        File file = new File(parent, "file1.txt");
        String name = file.getName();
        System.out.println("파일명 : " + name.substring(0, name.indexOf(".")));
        // 확장자를 제외한 이름 추출
        System.out.println("확장자 : " + name.substring(name.indexOf(".") + 1));
        System.out.println("경로를 포함한 이름 : " + file.getPath());
        System.out.println("파일이 속한 디렉토리 : " + file.getParent());
        System.out.println("파일 pathSeparator : " + file.pathSeparator);
        System.out.println("파일 pathSeparatorChar : " + file.pathSeparatorChar);
        System.out.println("파일 separator : " + file.separator);
        System.out.println("파일 separatorChar : " + file.separatorChar);
    }
}
