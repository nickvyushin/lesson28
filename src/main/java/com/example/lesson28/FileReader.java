package com.example.lesson28;

import java.io.File;
import java.util.Arrays;

public class FileReader {
    public static void main(String[] args) {

        File file = new File("/Users/nickvyushin/Downloads/test.txt");
        if (file.exists()) {
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getParent());
            var parentPath = file.getParent();
            File parent = new File(parentPath);
            if (parent.listFiles() != null) {
                Arrays.stream(parent.listFiles()).forEach(f -> System.out.println(f.getName()));
            } else {
                System.out.println("В папке пусто!");
            }
        } else {
            System.out.println("Файла не существует!");
        }
    }
}
