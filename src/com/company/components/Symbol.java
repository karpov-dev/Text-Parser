package com.company.components;

public abstract class Symbol {
    private String symbol;

    public Symbol(String symbol) {
        setSymbol(symbol.length() == 1 ? symbol : "");
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }
}
