package strings;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main (String[] args) throws java.lang.Exception {
        //4.     Во всех вопросительных предложениях текста найти и напечатать без повторений слова заданной длины.
        String text = ("One One Two Three? " + "Four Five. " + "Six Seven. " + "Eight Nine? " + "Ten Eleven. ");
        int wordLength = 3;
        Set<String> findedWords = new HashSet<>();
        Pattern pattern = Pattern.compile
                (new StringBuilder().append("\\b\\w{" + wordLength + "}\\b").toString());
        Matcher interrogativeSentences = Pattern.compile
                (new StringBuilder().append("[A-zА-я0-9\\,\\s\\-\\:]*\\?").toString()).matcher(text);
        Matcher wordsNeededLength;
        while (interrogativeSentences.find()) {
            wordsNeededLength = pattern.matcher(interrogativeSentences.group());
            while (wordsNeededLength.find()) {
                findedWords.add(wordsNeededLength.group());
            }
        }
        for (String s:findedWords) {
            System.out.println(s);
        }
    }
}
