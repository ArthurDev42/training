package io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        String targetDirectoryPath = "src/main/resources/";
        String outputFileName = "output.txt";

        File directory = new File(targetDirectoryPath);
        directoryResearch(directory, outputFileName);
    }

    public static void directoryResearch(File directory,String outputFile){
        int currentPathDepth = 0;

        try(FileWriter fileWriter = new FileWriter(directory.getPath().concat("/" + outputFile))) {
            fileWriter.write(directory.getName() + "\n");
            File files[] = directory.listFiles();
            List<File> directoryList = new ArrayList<>();
            List<File> fileList = new ArrayList<>();
            for (File f: files) {
                if (f.isDirectory()) {
                    directoryList.add(f);
                } else if (f.isFile()) {
                    fileList.add(f);
                }
            }
            writeToFile(directoryList, currentPathDepth, fileWriter);
            for (File file : fileList) {
                fileWriter.write("|-" + file.getName() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeToFile(List<File> list, int currentPathDepth, FileWriter fileWriter) throws IOException {
        for (File dirss:list) {
            if(dirss.isDirectory()) {
                currentPathDepth++;
                fileWriter.write("|" + "  |".repeat(currentPathDepth - 1) + "- " + dirss.getName() + "\n");
                writeToFile(new ArrayList<File>(List.of(dirss.listFiles())), currentPathDepth, fileWriter);
                currentPathDepth--;
            } else if (dirss.isFile()) {
                fileWriter.write("|" + "  |".repeat(currentPathDepth) + "-- " + dirss.getName() + "\n");
            }
        }
    }
}

