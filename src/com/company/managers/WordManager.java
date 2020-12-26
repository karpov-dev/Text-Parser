package com.company.managers;

import com.company.components.Letter;
import com.company.components.Word;

import java.util.logging.Logger;

public class WordManager {
    static Logger logger = Logger.getLogger(TextManager.class.getName());

    public static boolean isStartsWithVowel(Word word) {
        logger.info("Check word on vowel first letter");
        return Letter.isVowel(String.valueOf(word.getText().charAt(0)));
    }

    public static String getFirsConsonant(Word word) {
        logger.info("Search word for first consonant");
        for (Character letter : word.getText().toCharArray()) {
            if (Letter.isConsonant(String.valueOf(letter))) return String.valueOf(letter);
        }

        return "";
    }
}
