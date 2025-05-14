package Zoologico;

import Zoologico.service.*;;

public class Main {

    public static void main(String[] args) {
        AnimalManager gerenciadorAnimais = new AnimalManager();
        InputHelper pegarInput = new InputHelper();
        OutputHelper mostrarOutput = new OutputHelper();
        int opcaoMenuMain;
        String frase = "  #->> Escolha uma opção: ";
        int numeroChave = 1;

        do {
            mostrarOutput.mostrarMenuPrincipal();
            opcaoMenuMain = pegarInput.pegarInteiro(frase);

            switch (opcaoMenuMain) {
                case 1:
                    mostrarOutput.mostrarOpcaoHabitatAnimais();
                    int opcaoMenuHabitat = pegarInput.pegarInteiro(frase);

                    switch (opcaoMenuHabitat) {
                        case 1:
                            mostrarOutput.mostrarOpcaoAnimaisTerrestres();
                            int opcaoAnimalTerrestre = pegarInput.pegarInteiro(frase);

                            switch (opcaoAnimalTerrestre) {
                                case 1:
                                    gerenciadorAnimais.adicionarCapivara(numeroChave++);
                                    break;
                                case 2:
                                    gerenciadorAnimais.adicionarElefante(numeroChave++);
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
                            mostrarOutput.mostrarOpcaoAnimaisAereos();
                            int opcaoAnimalAereo = pegarInput.pegarInteiro(frase);
                            break;
                        case 3:
                            mostrarOutput.mostrarOpcaoAnimaisAquaticos();
                            int opcaoAnimalAquatico = pegarInput.pegarInteiro(frase);
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
                    int opcaoListarAnimal = pegarInput.pegarInteiro(frase);

                    switch (opcaoListarAnimal) {
                        case 1:
                            mostrarOutput.mostrarOpcaoHabitatAnimais();
                            int opcaoListPorHabitat = pegarInput.pegarInteiro(frase);

                            if(opcaoListPorHabitat == 1) {
                                mostrarOutput.mostrarAnimaisTerrestres(gerenciadorAnimais);
                            }
                            else if(opcaoListPorHabitat == 2) {
                                mostrarOutput.mostrarAnimaisAereos(gerenciadorAnimais);
                            }
                            else if(opcaoListPorHabitat == 0) {
                                System.out.println("Saindo...");
                            }
                            else {
                                System.out.println("Escolha uma opção válida!!");
                            }
                            break;
                        case 3:
                            mostrarOutput.mostrarOpcaoTodosAnimaisCadastrados(gerenciadorAnimais);
                        case 0:
                            System.out.println("Saindo...");
                            break;
                        default:
                            System.out.println("Escolha uma opção válida!!");
                            break;
                    }
                    break;
                case 3:
                    mostrarOutput.mostrarMenuBuscarAnimal();
                    String chaveBusca = pegarInput.pegarString("#>> Digite o ID ou 0(para sair): ");

                    if(gerenciadorAnimais.buscarAnimal(chaveBusca, gerenciadorAnimais) != null) {
                        System.out.println("Animal encontrado!!!!!");
                    } else {
                        System.out.println("Animal não foi encontrado!!!");
                    }

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
