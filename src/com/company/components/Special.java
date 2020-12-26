package com.company.components;

import java.util.ArrayList;
import java.util.List;

public class Special extends Symbol {
    public Special(String symbol){
        super(symbol);
    }

    public static List<String> getSymbols(){
        List<String> symbols = new ArrayList<>();
        symbols.add("`");
        symbols.add("~");
        symbols.add("@");
        symbols.add("#");
        symbols.add("$");
        symbols.add("%");
        symbols.add("^");
        symbols.add("&");
        symbols.add("*");
        symbols.add("(");
        symbols.add(")");
        symbols.add("-");
        symbols.add("_");
        symbols.add("=");
        symbols.add("+");
        symbols.add("{");
        symbols.add("}");
        symbols.add("[");
        symbols.add("]");
        symbols.add("/");
        symbols.add("\\");
        symbols.add("|");
        symbols.add(">");
        symbols.add("<");

        return symbols;
    }
    public static String getSymbolsAsString(){
        return "`~@#$%^&*()_-+=[]{}\\|<>/";
    }
}
