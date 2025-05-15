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
            //Menu principal
            mostrarOutput.mostrarMenuPrincipal();
            opcaoMenuMain = pegarInput.pegarInteiro(frase);

            switch (opcaoMenuMain) {
                case 1:
                    //Menu de Habitates
                    mostrarOutput.mostrarOpcaoHabitatAnimais();
                    int opcaoMenuHabitat = pegarInput.pegarInteiro(frase);

                    switch (opcaoMenuHabitat) {
                        case 1:
                            //Menu Animais Terrestres
                            mostrarOutput.mostrarOpcaoAnimaisTerrestres();
                            int opcaoAnimalTerrestre = pegarInput.pegarInteiro(frase);

                            //Criando Animais Terrestres
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
                            //Menu Animais Aereos
                            mostrarOutput.mostrarOpcaoAnimaisAereos();
                            int opcaoAnimalAereo = pegarInput.pegarInteiro(frase);

                            switch (opcaoAnimalAereo) {
                                case 5:
                                    gerenciadorAnimais.adicionarAguia(numeroChave++);
                                break;
                                case 0:
                                    System.out.println("Saindo...");
                                break;
                                default:
                                    System.out.println("Escolha uma opção válida!!");
                                break;
                            }
                            break;
                        case 3:
                            //Menu Animais Aquaticos
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
                    //Menu Listagem animais
                    mostrarOutput.mostrarOpcaoListarAnimais();
                    int opcaoListarAnimal = pegarInput.pegarInteiro(frase);

                    switch (opcaoListarAnimal) {
                        case 1:
                            //Listagem por Habitates
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
                        case 2:
                            //Listagem de todos Animais cadastrados por Animal
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
                    //Buscar animal
                    mostrarOutput.mostrarMenuBuscarAnimal();
                    int opcaSabeIDOuNao = pegarInput.pegarInteiro(frase);
                    boolean animalEncontrado = true;
                    if(opcaSabeIDOuNao == 1) {
                        String chaveBusca = pegarInput.pegarString("Digite o ID do animal desejado: ");
                        if(gerenciadorAnimais.buscarAnimal(chaveBusca, gerenciadorAnimais) == null) {
                            int opcaoSegundaChance;
                            while(gerenciadorAnimais.buscarAnimal(chaveBusca, gerenciadorAnimais) == null) {
                                System.out.println("\nAnimal não foi encontrado!!!");
                                System.out.println(" #>> [1] Voltar ao menu");
                                System.out.println(" #>> [2] Tentar novamente");
                                opcaoSegundaChance = pegarInput.pegarInteiro(frase);
                                if(opcaoSegundaChance == 1) {
                                    System.out.println("Voltando...");
                                    animalEncontrado = false;
                                    break;
                                }
                                else if(opcaoSegundaChance == 2) {
                                    chaveBusca = pegarInput.pegarString("Digite o ID do animal desejado: ");
                                }
                                else {
                                    System.out.println("Escolha uma opção válida!!");
                                }
                            }
                        }
                        if(animalEncontrado){
                            System.out.println("Animal encontrado !!!");
                            mostrarOutput.mostrarAnimalDetalhado(gerenciadorAnimais.buscarAnimal(chaveBusca, gerenciadorAnimais), gerenciadorAnimais);
                        }
                    }
                    else if(opcaSabeIDOuNao == 2) {
                        mostrarOutput.mostrarInfoParaDescobrirIDAnimal();
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
