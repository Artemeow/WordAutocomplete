package com.artemeow;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Dictionary;

public class Main {

    public static void main(String[] args) {

        try (FileReader fileReader = new FileReader("./src/in.txt")) {
            char[] buf = new char[1024];
            int c;
            while ((c = fileReader.read(buf)) > 0) {
                buf = Arrays.copyOf(buf, c);
            }

            String str = new String(buf);
            String[] strs = str.split("\r\n");
            int wordsCount = Integer.parseInt(strs[0]);

            Arrays.stream(strs).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
