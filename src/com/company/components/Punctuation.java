package com.company.components;

import java.util.ArrayList;
import java.util.List;

public class Punctuation extends Symbol {
    public Punctuation(String mark) {
        super(mark);
    }

    public static List<String> getMarks() {
        List<String> marks = new ArrayList<>();
        marks.add("!");
        marks.add(",");
        marks.add(".");
        marks.add("?");
        marks.add(";");
        marks.add(":");
        marks.add("...");
        marks.add("\"");
        marks.add("'");

        return marks;
    }

    public static String getMarksAsString() {
        return "!,.;:\"'";
    }

    public static List<String> getEndingMarks() {
        List<String> marks = new ArrayList<>();
        marks.add("!");
        marks.add(".");
        marks.add("?");
        marks.add("...");

        return marks;
    }

    public static String getEndingMarksAsString() {
        return "!.?";
    }

    public static List<String> getInSentenceMarks() {
        List<String> marks = new ArrayList<>();

        marks.add(",");
        marks.add(";");
        marks.add(":");
        marks.add("\"");
        marks.add("'");

        return marks;
    }

    public static String getInSentenceMarksAsString() {
        return ",;:\"'";
    }

}
