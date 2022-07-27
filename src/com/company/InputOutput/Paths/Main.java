package com.company.InputOutput.Paths;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) {
//        scieżka do pliku w ustawieniu domyślnym
        Path path = FileSystems.getDefault().getPath("WorkingDirectoryFile.txt");
        printFile(path);

//        scieżka do pliku w ustwaieniu z dodatkowym folderem
//        Path filePath = FileSystems.getDefault().getPath("files","SubdirectoryFile.txt");
//        powyższy zapis inaczej
        Path filePath = Paths.get(".","files","SubdirectoryFile.txt");

        printFile(filePath);
//        sciezka do pliku w ustawieniu z sciezka bezwzgledna
        filePath = Paths.get("C:\\Users\\pwend\\IdeaProjects\\OutThere.txt");
        printFile(filePath);


        filePath = Paths.get(".");
        System.out.println(filePath.toAbsolutePath());
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
