package Zoologico;

import Zoologico.service.AnimalManeger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AnimalManeger gerenciadorAnimais = new AnimalManeger();
        Scanner ler = new Scanner(System.in);

        System.out.println("Animais");
        System.out.println("[1]Animal terrestre");
        System.out.println("[2]Animal aereo");
        System.out.println("[3]Animal aquatico");
        System.out.print("Escolha uma opcao: ");
        int opcaoAnimal = Integer.parseInt(ler.nextLine());

        if(opcaoAnimal == 2) {
            String tipoAnimal = "aereo";
            System.out.println("Animais aereos");
            System.out.println("[1]Falcão");
            System.out.println("[2]Papagaio");
            System.out.println("[3]Aguia");
            System.out.print("Escolha uma opcao: ");
            int opcaoTipoAnimal = Integer.parseInt(ler.nextLine());

            if(opcaoTipoAnimal == 3) {
                String nomeAnimal = "aguia";
                gerenciadorAnimais.adicionarAnimal(tipoAnimal, nomeAnimal);
            }
        }

        gerenciadorAnimais.listarAnimais();


    }
}
