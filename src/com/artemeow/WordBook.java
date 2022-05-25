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
        word.setWord(word.getWord().toLowerCase());

        return wordBook.add(word);
    }
}
