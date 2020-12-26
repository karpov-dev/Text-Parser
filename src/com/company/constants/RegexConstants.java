package com.company.constants;

import com.company.components.Punctuation;
import com.company.components.Special;

public class RegexConstants {
    public static final String WORD_REGEX = "\\b[\\w+\\.?\\@?\\'?\\w+]+\\b";
    public static final String SYMBOL_REGEX = "[^\\s]";
    public static final String SENTENCE_REGEX = "\\s*[A-Za-z"
            + Punctuation.getInSentenceMarksAsString()
            + Special.getSymbolsAsString()
            + "\\s]+["
            + Punctuation.getEndingMarksAsString()
            + "]\\s|";
}
