package com.artemeow;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class WordBook {

    private SortedSet<Word> wordBook;

    private class WordComparator implements Comparator<Word>{
        @Override
        public int compare(Word o1, Word o2) {
            int resultWord = o1.getWord().compareTo(o2.getWord());
            int resultFrequency = Integer.valueOf(o2.getFrequency()).compareTo(o1.getFrequency());
            if (resultFrequency != 0 && resultWord != 0){
                return resultFrequency;
            } else {
                return resultWord;
            }
        }
    }
    public WordBook() {
        WordComparator wordComparator = new WordComparator();
        this.wordBook = new TreeSet<>(wordComparator);
    }

    public boolean addWord(@NotNull Word word) {
        word.setWord(word.getWord().toLowerCase());
        if(!WordBookValidator.itsTrueWord(word))
            return false;

        return wordBook.add(word);
    }

    public Set<Word> getWordBook() {
        return wordBook;
    }

    @Override
    public String toString() {
        return "WordBook{" +
                "wordBook=" + wordBook +
                '}';
    }
}
