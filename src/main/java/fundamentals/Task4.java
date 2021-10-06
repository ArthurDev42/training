package fundamentals;

public class Task4 {
    // Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение)
    // и вывести результат на консоль.
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < args.length; i++) {
            count =+ Integer.parseInt(args[i]);
        }
        System.out.println(count);
    }
}
