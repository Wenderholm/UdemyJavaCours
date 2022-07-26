package com.company.fileTreeExercise;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // USTAWIENIE FILTRA NA USUWANIE FOLDERÓW
//        DirectoryStream.Filter<Path> filter = new DirectoryStream.Filter<Path>() {
//            public boolean accept(Path path) throws IOException{
//                return Files.isRegularFile(path);
//            }
//        }

//        TO SAMO CO WYŻEJ ALE ZA POMOCĄ LAMBDA
        DirectoryStream.Filter<Path> filter = p -> Files.isRegularFile(p);

        Path directory = FileSystems.getDefault().getPath("FileTree" + File.separator +"Dir2");
//        Path directory = FileSystems.getDefault().getPath("FileTree/Dir2");
        try(DirectoryStream<Path> contents = Files.newDirectoryStream(directory,filter)) {
            for(Path file : contents){
                System.out.println(file.getFileName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String separator = File.separator;
        System.out.println(separator);
        separator = FileSystems.getDefault().getSeparator();
        System.out.println(separator);

        try{
            Path tempFile = Files.createTempFile("myapp", ".appext");
            System.out.println("Temporary file path = " + tempFile.toAbsolutePath());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        Iterable<FileStore> stores = FileSystems.getDefault().getFileStores();
        for(FileStore store : stores){
            System.out.println(store.name());
            System.out.println("Volume Name"+store);
        }

        System.out.println("*******************");
        Iterable<Path> rootPath = FileSystems.getDefault().getRootDirectories();
        for(Path path : rootPath){
            System.out.println(path);
        }

        System.out.println("-----walking tree for DIR 2-----");
        Path dir2Path = FileSystems.getDefault().getPath("FileTree" + File.separator + "Dir2");
        try{
            Files.walkFileTree(dir2Path, new PrintNames());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
