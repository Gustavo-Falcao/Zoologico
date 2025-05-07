package Zoologico;

import Zoologico.service.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AnimalManager gerenciadorAnimais = new AnimalManager();
        Scanner ler = new Scanner(System.in);
        InputHelper pegarInput = new InputHelper();

        System.out.println("Animais");
        System.out.println("[1]Animal terrestre");
        System.out.println("[2]Animal aereo");
        System.out.println("[3]Animal aquatico");
        int opcaoAnimal = pegarInput.pegarInteiro("Escolha uma opcao: ");

        if(opcaoAnimal == 2) {
            System.out.println("Animais aereos");
            System.out.println("[1]Falcão");
            System.out.println("[2]Papagaio");
            System.out.println("[3]Aguia");
            int opcaoTipoAnimal = pegarInput.pegarInteiro("Escolha uma opcao: ");

            if(opcaoTipoAnimal == 3) {
                gerenciadorAnimais.adicionarAguia();
            }
        }

        gerenciadorAnimais.listarAnimais();


    }
}
