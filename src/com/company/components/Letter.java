package com.company.components;

public class Letter extends Symbol {
    public static final String VOWELS_EN = "AEIOYU";
    public static final String CONSONANT_EN = "QWRTYPSDFGHJKLZXCVBNM";

    public Letter(String letter) {
        super(letter);
    }

    public static boolean isVowel(String letter) {
        return (VOWELS_EN.contains(letter.toUpperCase()));
    }

    public static boolean isConsonant(String letter) {
        return (CONSONANT_EN.contains(letter.toUpperCase()));
    }
}
