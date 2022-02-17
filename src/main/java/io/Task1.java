package io;

package io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    // not completed
    // class has one issue
    public static void main(String[] args) {
        String targetDirectory = "src/main/resources/";
        String targetFile = "src/main/resources/output.txt";
        File directory = new File(targetDirectory);
        if(directory.isDirectory()) {
            try(FileWriter fileWriter = new FileWriter(targetDirectory.concat("/output.txt"))) {
                directoryResearch(directory);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if(directory.isFile()) {
            fileResearch(directory);
        }
    }

    public static void directoryResearch(File dir){
        int con = 0;

        try(FileWriter fileWriter = new FileWriter(dir.getPath().concat("/output.txt"))) {
            fileWriter.write(dir.getName() + "\n");
            File files[] = dir.listFiles();
            List<File> dirList = new ArrayList<>();
            List<File> fileList = new ArrayList<>();
            for (File f: files) {
                if (f.isDirectory()) {
                    dirList.add(f);
                } else if (f.isFile()) {
                    fileList.add(f);
                }
            }
            dirRir(dirList, con, fileWriter);
            for (File file : fileList) {
                fileWriter.write("|-" + file.getName() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void dirRir(List<File> list, int nesting, FileWriter fileWriter) throws IOException {
        for (File dirss:list) {
            if(dirss.isDirectory()) {
                nesting++;
                fileWriter.write("|" + "  |".repeat(nesting) + "- " + dirss.getName() + "\n");
                dirRir(new ArrayList<File>(List.of(dirss.listFiles())), nesting, fileWriter);
                nesting--;
            } else if (dirss.isFile()) {
                fileWriter.write("|" + "  |".repeat(nesting) + "---- " + dirss.getName() + "\n");
            }
        }
    }
    public static void fileResearch(File file) {
        System.out.println("This is file.");
    }
}

