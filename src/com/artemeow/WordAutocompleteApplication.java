package com.artemeow;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

public class WordAutocompleteApplication {

    public static Word parseString(String str) {
        String[] strs = str.strip().split(" ");

        try {
            return new Word(strs[0], Integer.parseInt(strs[1]));
        }
        catch (Exception e) {          //throw MyException
            return new Word();
        }
    }
    public static void main(String[] args) {
        char[] buf = new char[1024];

        try (FileReader fileReader = new FileReader("./src/in.txt")) {
            int c;
            while ((c = fileReader.read(buf)) > 0) {
                buf = Arrays.copyOf(buf, c);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        String str = new String(buf);
        String[] strs = str.split("\r\n");
        int wordsCount = Integer.parseInt(strs[0]);

        WordBook wordBook = new WordBook();
        for(int i = 1; i <= wordsCount; i++) {
            wordBook.addWord(parseString(strs[i]));
        }
        System.out.println(wordBook);
        Search.search(wordBook, "mi");
    }
}
