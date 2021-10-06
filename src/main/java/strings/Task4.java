package strings;

import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
        //12.  Из текста удалить все слова заданной длины, начинающиеся на согласную букву.
        String text = ("One Two Three. " + "four Five. " + "six Seven. " + "Eight Nine. " + "Ten Eleven. ");
        int stringLength = 3;
        Pattern findedWords = Pattern.compile
                (new StringBuilder().append("(?i)\\b[BCDFGHJKLMNPQRSTVWXZ]\\w{").append(stringLength - 1).append("}\\b").toString());
        text = text.replaceAll(findedWords.pattern(), "");
        System.out.println(text);
    }
}