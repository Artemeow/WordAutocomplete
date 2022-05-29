package com.artemeow;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class WordAutocompleteApplication {


    public static Word parseString(String str) {
        String[] strs = str.strip().split(" ");

        try {
            return new Word(strs[0], Integer.parseInt(strs[1]));
        }
        catch (Exception e) {
            return new Word();
        }
    }
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

            WordBook wordBook = new WordBook();
            for(int i = 1; i <= wordsCount; i++) {
                wordBook.addWord(parseString(strs[i]));
            }
            System.out.println(wordBook);
            //Arrays.stream(strs).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
