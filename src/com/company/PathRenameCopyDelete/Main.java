package com.company.PathRenameCopyDelete;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class Main {
    public static void main(String[] args) {
        try{
//            TWORZENIE PLIKÓW
//            Path fileToCreate = FileSystems.getDefault().getPath("Example", "file1.txt");
//            Files.createFile(fileToCreate);


//            TWORZENIE FOLDERU
//            Path dirToCreate = FileSystems.getDefault().getPath("Example" , "Dir4");
//            Files.createDirectories(dirToCreate);


//            TWORZENIE GAŁĘZI FOLDERÓW
//            Path dirToCreate = FileSystems.getDefault().getPath("Example" , "Dir2/Dir3/Dir4/Dir5/Dir6");
//            Files.createDirectories(dirToCreate);


//            TWORZENIE GAŁĘZI FOLDERÓW - inny sposób
//            Path dirToCreate = FileSystems.getDefault().getPath("Example/Dir2/Dir3/Dir4/Dir5/Dir6/Dir7");
//            Files.createDirectories(dirToCreate);


//            DELETE
//            Path fileToDelete = FileSystems.getDefault().getPath("Example", "Dir1" , "file1copy.txt");
//            Files.delete(fileToDelete);
//            Files.deleteIfExists(fileToDelete);


//            RENAME
//            Path fileToMove = FileSystems.getDefault().getPath("Example", "file1.txt");
//            Path destination = FileSystems.getDefault().getPath("Example","file2.txt");
//            Files.move(fileToMove,destination);

//            COPY
//            Path fileToMove = FileSystems.getDefault().getPath("Example", "file1copy.txt");
//            Path destination = FileSystems.getDefault().getPath("Example", "Dir1", "file1copy.txt");
//            Files.move(fileToMove,destination);

//          COPY Z ZASTĘPOWANIEM ISTNIEJĄCEGO
//            Path sourceFile = FileSystems.getDefault().getPath("Example","file1.txt");
//            Path copyFile = FileSystems.getDefault().getPath("Example","file1copy.txt");
//            Files.copy(sourceFile,copyFile, StandardCopyOption.REPLACE_EXISTING);
//
////            kopiowanie folderu bez zawartości
//            sourceFile = FileSystems.getDefault().getPath("Example","Dir1");
//            copyFile = FileSystems.getDefault().getPath("Example" , "Dir4");
//            Files.copy(sourceFile,copyFile, StandardCopyOption.REPLACE_EXISTING);

//            WYŚWIETLANIE INNCY ATRYBUTÓW PLIKU
            Path filePath = FileSystems.getDefault().getPath("Example", "Dir1/file1.txt");
            long size = Files.size(filePath);
            System.out.println("Size = " + size);
            System.out.println("Last modified = " + Files.getLastModifiedTime(filePath));

//            INNE MOŻLIWOŚCI KLASY FILLE WYSZUKUJEMY GOOGLE : CLASS FILE

            BasicFileAttributes attrs = Files.readAttributes(filePath , BasicFileAttributes.class);
            System.out.println("Size = " + attrs.size());
            System.out.println("Last modification = " + attrs.lastModifiedTime());
            System.out.println("Created = " + attrs.creationTime());
            System.out.println("Is Directory = " + attrs.isDirectory());
            System.out.println("Is regular file = " + attrs.isRegularFile());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
