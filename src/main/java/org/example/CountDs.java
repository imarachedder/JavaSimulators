package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountDs {
    // todo: Создайте функцию, которая подсчитывает, сколько букв Д в предложении.
    private final String text;
    Pattern pattern = Pattern.compile("[D,d]+");

    public CountDs(String text) {
        this.text = text;
    }

    public int length() {
        Matcher matcher = pattern.matcher(this.text);
        return (int) matcher.results().count();
    }
}
