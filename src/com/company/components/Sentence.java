package com.company.components;

import com.company.managers.TextManager;

import java.util.List;

public class Sentence {
    private String text;
    private List<Word> words;

    public Sentence(String text) {
        setText(text);
        setWords(TextManager.toWords(text));
    }

    public List<Word> getWords() {
        return words;
    }

    public void setWords(List<Word> words) {
        this.words = words;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return getText() + "\n";
    }
}
