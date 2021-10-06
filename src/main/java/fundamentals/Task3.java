package fundamentals;

import java.util.Random;

public class Task3 {
    // Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
    public static void main(String[] args) {

        int amountOfNumber = 5;
        int[] arrayOfNumbers= fillArray(amountOfNumber);

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            System.out.println(arrayOfNumbers[i]);
        }

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            System.out.print(arrayOfNumbers[i] + " ");
        }
    }

    public static int[] fillArray(int amountOfNumber) {
        int[] arrayOfNumbers = new int[amountOfNumber];
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = new Random().nextInt();
        }
        return arrayOfNumbers;
    }
}
