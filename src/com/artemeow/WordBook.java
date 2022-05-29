package com.artemeow;

import java.util.HashSet;
import java.util.Set;

public class WordBook {

    private Set<Word> wordBook;

    public WordBook() {
        this.wordBook = new HashSet<>();
    }

    public boolean addWord(Word word) {
        if(!WordBookValidator.itsTrueWord(word))
            return false;

        return wordBook.add(word);
    }

    @Override
    public String toString() {
        return "WordBook{" +
                "wordBook=" + wordBook +
                '}';
    }
}
