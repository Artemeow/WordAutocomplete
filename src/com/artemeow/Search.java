package com.artemeow;

public class Search {

    private static final int MAX_WORDS_COUNT = 10;

    public static void search(WordBook wordBook, String prefix) {
        wordBook.getWordBook().stream()
                .filter(word -> word.getWord()
                .startsWith(prefix.toLowerCase()))
                .limit(MAX_WORDS_COUNT)
                .forEach(word -> System.out.print(word));
    }
}
