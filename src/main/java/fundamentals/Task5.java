package fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {
    // Ввести число от 1 до 12.
    // Вывести на консоль название месяца, соответствующего данному числу.
    // Осуществить проверку корректности ввода чисел.
    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        System.out.println("Enter number of month");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int monthNumber = 0;
        do {
            try {
                monthNumber = Integer.parseInt(reader.readLine());
            } catch (IOException | NumberFormatException e) {
                System.out.println("Incorrect input");
                continue;
            }
            if ((monthNumber > 0) && (monthNumber <= 12)) {
                break;
            } else if ((monthNumber <= 0) || (monthNumber > 12)) {
                System.out.println("This month has not exist");
            }
        } while (true);

        System.out.println(months[monthNumber - 1]);

    }
}
