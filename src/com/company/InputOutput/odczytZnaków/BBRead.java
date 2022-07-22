package com.company.InputOutput.odczytZnaków;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BBRead {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Wpisz znaki, wpisanie 'q' powoduje zakończenie programu");

        do{
            c = (char) br.read();
            System.out.println(c);
        } while (c!='q');
    }
}
