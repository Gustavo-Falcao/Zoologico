package Zoologico;

import Zoologico.service.*;;

public class Main {

    public static void main(String[] args) {
        AnimalManager gerenciadorAnimais = new AnimalManager();
        InputHelper pegarInput = new InputHelper();
        OutputHelper mostrarOutput = new OutputHelper();
        int opcaoMenuMain;

        do {
            mostrarOutput.mostrarMenuPrincipal();
            opcaoMenuMain = pegarInput.pegarInteiro("Escolha uma opção: ");

            switch (opcaoMenuMain) {
                case 1:
                    mostrarOutput.mostrarOpcaoHabitatAnimais();
                    int opcaoMenuHabitat = pegarInput.pegarInteiro("Escolha uma opção: ");

                    switch (opcaoMenuHabitat) {
                        case 1:
                            mostrarOutput.mostrarOpcaoAnimaisTerrestres();
                            int opcaoAnimalTerrestre = pegarInput.pegarInteiro("Escolha uma opção: ");

                            switch (opcaoAnimalTerrestre) {
                                case 1:
                                    gerenciadorAnimais.adicionarCapivara();
                                    break;
                                case 2:

                            }
                            break;
                        case 2:
                            mostrarOutput.mostrarOpcaoAnimaisAereos();
                            int opcaoAnimalAereo = pegarInput.pegarInteiro("Escolha uma opção: ");
                            break;
                        case 3:
                            mostrarOutput.mostrarOpcaoAnimaisAquaticos();
                            int opcaoAnimalAquatico = pegarInput.pegarInteiro("Escolha uma opção: ");
                            break;
                        case 0:
                            System.out.println("Saindo...");
                            break;
                        default:
                            System.out.println("Escolha uma opção válida!!");
                            break;
                    }
                    break;
                case 2:
                    mostrarOutput.mostrarOpcaoListarAnimais();
                    int opcaoListarAnimal = pegarInput.pegarInteiro("Escolha uma opção: ");
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Escolha uma opção válida!!");
                    break;
            }
        }while(opcaoMenuMain != 0);
        pegarInput.fecharLeitor();
    }
}
