package com.company.InputOutput.Paths;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) {
        Path path = FileSystems.getDefault().getPath("WorkingDirectoryFile.txt");
        printFile(path);
        Path filePath = FileSystems.getDefault().getPath("files","SubdirectoryFile.txt");
        printFile(filePath);
        filePath = Paths.get("C:\\Users\\PC\\IdeaProjects\\OutThere.txt");
        printFile(filePath);
    }

    public static void printFile(Path path){
        try(BufferedReader fileReader = Files.newBufferedReader(path)){
            String line;
            while((line = fileReader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
