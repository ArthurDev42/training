package strings;

import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        //11.  В каждом предложении текста исключить подстроку максимальной длины, начинающуюся и заканчивающуюся заданными символами.
        String text = ("One Two Three. " + "four Five. " + "six Seven. " + "Eight Nine. " + "Ten Eleven. ");
        char startSubline = 't';
        char endSubline = 'r';
        Pattern pattern = Pattern.compile
                (new StringBuilder().append("(?i)" + startSubline + "[^.!?]*" + endSubline).toString());
        text = text.replaceAll(pattern.pattern(), "");
        System.out.println(text);
    }
}
