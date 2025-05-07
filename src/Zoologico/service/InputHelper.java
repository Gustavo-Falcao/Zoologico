package Zoologico.service;

import java.util.Scanner;

public class InputHelper {

    private final Scanner ler = new Scanner(System.in);

    public int pegarInteiro(String frase) {
        System.out.print(frase);
        return Integer.parseInt(ler.nextLine());
    }

    public double pegarDouble(String frase) {
        System.out.print(frase);
        return Double.parseDouble(ler.nextLine());
    }

    public String pegarString(String frase) {
        System.out.print(frase);
        return ler.nextLine();
    }
}
