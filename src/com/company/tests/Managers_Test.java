package com.company.tests;

import com.company.components.Sentence;
import com.company.components.Text;
import com.company.components.Word;
import com.company.managers.TextManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Managers_Test {
    private String text;
    private String words;
    private String vowelsWords;

    @Before
    public void setup() {
        text = "ASFD aaaaccfdcc, dfs aqfdsfaq sdf dsfsd.sdf. Afdsf abfsdfdsfcbcb? Adaf.sdf sdf sdf sdfgs! AAAA.";
        words = "xczczx@gmail.com   36.5  cxzc ggxzczxgtgt zxc";
        vowelsWords = "aabbbb  aaacccc eeebbbb ecccc azzzz  aaaa oooddddd oooooob ozbbb azzbbbb eeebzzz";
    }

    @Test
    public void ParseOnSentence_Test() {
        Assert.assertEquals(TextManager.toSentences(text).size(), 4);
    }

    @Test
    public void ParseOnWords_Test() {
        List<Word> wordsList = TextManager.toWords(words);
        Assert.assertEquals(wordsList.size(),5 );
    }

    @Test
    public void SortByVowelsStarByConsonant_Test() {
        List<Word> correct = new ArrayList<>();
        correct.add(new Word("aaaa"));
        correct.add(new Word("aabbbb"));
        correct.add(new Word("eeebbbb"));
        correct.add(new Word("oooooob"));
        correct.add(new Word("eeebzzz"));
        correct.add(new Word("aaacccc"));
        correct.add(new Word("ecccc"));
        correct.add(new Word("oooddddd"));
        correct.add(new Word("azzzz"));
        correct.add(new Word("ozbbb"));
        correct.add(new Word("azzbbbb"));

        List<Word> actual = TextManager.toWords(vowelsWords);
        TextManager.sortWordsByFirstConsonant(actual);

        Assert.assertEquals(actual.get(3).getText(), correct.get(3).getText());
    }

    @Test
    public void CheckForEndMark_Test() {
        Sentence sentence = new Sentence("ASFD aaaaccfdcc, dfs aqfdsfaq sdf dsfsd.sdf.");
        List<Sentence> sentences = TextManager.toSentences(text);

        Assert.assertEquals(sentence.getText(), TextManager.getWithEndMark(sentences.get(0), new Text(text)));
    }
}
