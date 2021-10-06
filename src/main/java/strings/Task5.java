package strings;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args) {
        // 3.     Найти такое  слово  в  первом  предложении,  которого  нет  ни  в  одном из остальных предложений
        String text = ("One Two FindIt Three? " + "Four Five. " + "Six Two One Three Seven. " +
                "Eight Three Nine? " + "Ten Eleven. ");
        String[] firstMesssageAndOtherText = new StringBuilder(text).toString().split("[.!?]", 2);
        Matcher firstSentenceWordsMatch = Pattern.compile(new StringBuilder("\\b\\w+\\b").toString()).matcher(firstMesssageAndOtherText[0]);
        Set<String> firstSentence = new HashSet() {{
            while (firstSentenceWordsMatch.find()) add(firstSentenceWordsMatch.group());
        }};
        Matcher matchWordText;
        for (String s: firstSentence) {
            matchWordText = Pattern.compile(new StringBuilder(s).toString()).matcher(firstMesssageAndOtherText[1]);
            if(matchWordText.find()) {
                continue;
            }
            System.out.println(s);
        }
    }
}
