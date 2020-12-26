package com.company.components;

import com.company.managers.TextManager;

import java.util.List;

public class Word {
    private String text;
    private List<Symbol> symbols;

    public Word(String text) {
        setText(text);
        setSymbols(TextManager.toSymbols(text));
    }

    public List<Symbol> getSymbols() {
        return symbols;
    }

    public void setSymbols(List<Symbol> symbols) {
        this.symbols = symbols;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
