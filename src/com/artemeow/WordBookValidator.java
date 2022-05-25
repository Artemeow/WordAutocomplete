package com.artemeow;

import org.jetbrains.annotations.NotNull;

public class WordBookValidator {

    private static final int MIN_WORD_LENGTH = 1;
    private static final int MAX_WORD_LENGTH = 15;
    private static final int MIN_WORD_FREQUENCY = 1;
    private static final int MAX_WORD_FREQUENCY = 1_000_000;

    public static boolean itsTrueWord(@NotNull Word word) {
        String _word = word.getWord().strip();
        int _frequency = word.getFrequency();
        if(_word.isBlank() || _word.length() < MIN_WORD_LENGTH || _word.length() > MAX_WORD_LENGTH)
            return false;
        if(_frequency < MIN_WORD_FREQUENCY || _frequency > MAX_WORD_FREQUENCY)
            return false;

        return true;
    }
}
