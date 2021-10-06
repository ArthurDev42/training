package strings;

public class Task1 {

    public static void main(String[] args) {
        // 2. Вывести все предложения заданного текста в порядке возрастания количества слов в каждом из них.
        String text = ("One." +
                "Four Four Four Four." +
                "Three Three Three?" +
                "Five Five Five Five Five." +
                "Two Two?" +
                "Six Six Six Six Six Six...");
        StringBuilder builder = new StringBuilder(text);
        String[] messages = builder.toString().split("[.!?]+");
        String temp;
        for (int i = 0; i < messages.length - 1; i++) {
            for (int j = i + 1; j < messages.length; j++) {
                if (messages[i].trim().split("\\s+").length > messages[j].trim().split("\\s+").length) {
                    temp = messages[i];
                    messages[i] = messages[j];
                    messages[j] = temp;
                }
            }
        }
        for (String f: messages) {
            System.out.println(f);
        }
    }
}
