package com.company.InputOutput.odczytLancuchow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TinyEdit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = new String[100];
        System.out.println("Wpisz wiersze tekstu");
        System.out.println("wspisz 'stop' aby ");
        for (int i = 0; i < 100; i++) {
            str[i] = br.readLine();
                if(str[i].equals("stop")) break;
        }

        System.out.println("\n Oto wpisane dane");
        for (String s : str) {
            if (s.equals("stop")) break;
            System.out.println(s);
        }
    }
}
