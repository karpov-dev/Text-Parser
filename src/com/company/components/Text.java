package com.company.components;

import com.company.managers.TextManager;

import java.util.List;

public class Text {
    private String text;
    private List<Sentence> sentences;
    private List<Word> words;

    public Text(String text) {
        setText(text);
        setSentences(TextManager.toSentences(text));
        setWords(TextManager.toWords(text));
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    public void setSentences(List<Sentence> sentences) {
        this.sentences = sentences;
    }

    public List<Word> getWords() {
        return words;
    }

    public void setWords(List<Word> words) {
        this.words = words;
    }
}
