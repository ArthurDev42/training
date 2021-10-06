package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task1 {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("src/main/resources/input.txt");
        FileWriter fileWriter = new FileWriter("src/main/resources/output.txt")) {
        fileWriter.write("java");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
