package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Edabit {
    private final String text;
    Pattern pattern;
    Matcher matcher;

    // TODO: Создайте функцию, которая принимает строку и изменяет слово amazing на not amazing.
    //  Верните строку без каких-либо изменений, если слово edabit является частью строки.
    public Edabit (String text) {
        this.text = text;
    }

    public String replacement() {
        if (!this.text.toLowerCase().contains("edabit")) {

            return "ццццц";
        }
        return this.text;
    }

}
