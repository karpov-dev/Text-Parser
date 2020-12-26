package com.company.managers;

import com.company.components.*;
import com.company.components.Number;
import com.company.constants.RegexConstants;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class TextManager {
    static Logger logger = Logger.getLogger(TextManager.class.getName());

    public static List<Sentence> toSentences(String text) {
        List<Sentence> sentences = new ArrayList<>();
        logger.info("Check text for null");
        if (text.isEmpty()) return null;

        logger.info("Split text");
        String[] strs = text.split("[.?!]\\s+");

        logger.info("Add sentence to list");
        for (String sent : strs
        ) {
            sentences.add(new Sentence(sent));
        }

        return sentences;
    }

    public static List<Word> toWords(String text) {
        List<Word> words = new ArrayList<>();

        logger.info("Check sented text for null");
        if (text.isEmpty()) return null;

        Pattern pattern = Pattern.compile(RegexConstants.WORD_REGEX);
        Matcher matcher = pattern.matcher(text);


        logger.info("Add words to list");
        while (matcher.find()) {
            words.add(new Word(matcher.group()));
        }

        return words;
    }

    public static List<Symbol> toSymbols(String text) {
        List<Symbol> symbols = new ArrayList<>();

        Pattern pattern = Pattern.compile(RegexConstants.SYMBOL_REGEX);
        Matcher matcher = pattern.matcher(text);

        logger.info("Add with while cycle Symbols of child classes");
        while (matcher.find()) {
            if (Special.getSymbolsAsString().contains(matcher.group()))
                symbols.add(new Special(matcher.group()));
            else if (Punctuation.getMarksAsString().contains(matcher.group()))
                symbols.add(new Punctuation(matcher.group()));
            else if (matcher.group().matches("\\d"))
                symbols.add(new Number(matcher.group()));
            else symbols.add(new Letter(matcher.group()));
        }

        return symbols;
    }

    public static String getWithEndMark(Sentence sentence, Text text) {
        Pattern pattern = Pattern.compile(sentence.getText());
        Matcher matcher = pattern.matcher(text.getText());

        if (matcher.find()) {
            return sentence.getText() + String.valueOf(text.getText().charAt(matcher.end()));
        }

        return null;
    }

    public static List<Word> getStartWithVowel(List<Word> words) {
        logger.info("Return words that starts with vowel using stream API");
        return words.stream()
                .filter(WordManager::isStartsWithVowel)
                .collect(Collectors.toList());
    }

    public static void sortWordsByFirstConsonant(List<Word> words) {
        logger.info("Sorting List<Word> with created comparator");
        words.sort(new Comparator<Word>() {
            @Override
            public int compare(Word o1, Word o2) {
                return WordManager.getFirsConsonant(o1).compareToIgnoreCase(WordManager.getFirsConsonant(o2));
            }
        });
    }
}
