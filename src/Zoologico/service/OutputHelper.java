package Zoologico.service;
import Zoologico.model.*;

import java.util.*;

public class OutputHelper {

    // mostra todos os animais e todos os seus atributos
    public void mostrarAnimaisDetalhados(AnimalManager animalManager) {
        Map<String, Animal> animais = animalManager.getAnimaisCadastrados();
        System.out.println("\n\n-----------------------------------");
        System.out.println("|  <<-- Animais Cadastrados -->>  |");
        System.out.println("-----------------------------------");
        for(String chave : animais.keySet()) {
            animais.get(chave).getInfoDetalhadaAnimais();
            if(animais.get(chave) instanceof Aguia aguia) {
                aguia.getInfoAguia();
            }
            else if(animais.get(chave) instanceof Capivara capivara) {
                capivara.getInfoCapivara();
            }
            else if(animais.get(chave) instanceof Elefante elefante) {
                elefante.getInfoElefante();
            }
            System.out.println("-----------------------------------");
        }
    }

    public void mostrarAnimalDetalhado(Animal animal, AnimalManager animalManager) {
        System.out.println("|  <<-- " + animalManager.getNomeClasseAnimal(animal) + " -->>  |");

        switch (animal) {
            case Aguia aguia -> aguia.getInfoAguia();
            case Capivara capivara -> capivara.getInfoCapivara();
            case Elefante elefante -> elefante.getInfoElefante();
            default -> System.out.println("ERRO -> Animal passado não se encaixa em nenhum perfil");
        }

    }

    // mostra todos os animais terrestres
    public void mostrarAnimaisTerrestres(AnimalManager animalManager) {
        if(!animalManager.getAnimaisTerrestres().isEmpty()) {
            Map<String, AnimalTerrestre> mapTerrestres = animalManager.getAnimaisTerrestres();
            System.out.println("----------------------------------");
            System.out.println("|  <<-- Animais Terrestres -->>  |");
            System.out.println("----------------------------------");
            for(String chave : mapTerrestres.keySet()) {
                System.out.println("\n| ##--->>>> " + animalManager.getNomeClasseAnimal(mapTerrestres.get(chave)));
                mapTerrestres.get(chave).getInfoAnimalTerrestre();
            }
            System.out.println("----------------------------------");
        } else {
            System.out.println("Nenhum animal terrestre cadastrado ainda!!");
        }
    }

    // mostra todos os animais Aereos
    public void mostrarAnimaisAereos(AnimalManager animalManager) {
        if(!animalManager.getAnimaisAereos().isEmpty()) {
            Map<String, AnimalAereo> mapAereos = animalManager.getAnimaisAereos();
            System.out.println("----------------------------------");
            System.out.println("|  <<-- Animais Aereos -->>  |");
            System.out.println("----------------------------------");
            for(String chave : mapAereos.keySet()) {
                System.out.println("\n| ##--->>>> " + animalManager.getNomeClasseAnimal(mapAereos.get(chave)));
                mapAereos.get(chave).getInfoAnimaisAereos();
            }
            System.out.println("----------------------------------");
        } else {
            System.out.println("Nenhum animal aereo cadastrado ainda!!");
        }
    }


    public void mostrarMenuPrincipal() {
        System.out.println("\n\n+ ----------------------------------------------------- +");
        System.out.println("|  << --  Gerenciamento de Animais no Zoologico  -- >>  |");
        System.out.println("+ ----------------------------------------------------- +");
        System.out.println("|                 ##-[1] Cadastrar animal               |");
        System.out.println("|                 ##-[2] Listar animais                 |");
        System.out.println("|                 ##-[3] Buscar animal                  |");
        System.out.println("|                 ##-[4] Acessar animal                 |");
        System.out.println("|                 ##-[5] Excluir animal                 |");
        System.out.println("|                 ##-[0] Sair                           |");
        System.out.println("+ ----------------------------------------------------- +");
    }

    public void mostrarOpcaoHabitatAnimais() {
        System.out.println("\n\n+ ----------------------------- +");
        System.out.println("|  << -- Habitat animais -- >>  |");
        System.out.println("---------------------------------");
        System.out.println("|       ##-[1] Terrestre        |");
        System.out.println("|       ##-[2] Aereo            |");
        System.out.println("|       ##-[3] Aquatico         |");
        System.out.println("|       ##-[0] Sair             |");
        System.out.println("+ ----------------------------- +");
    }

    public void mostrarOpcaoAnimaisTerrestres() {
        System.out.println("\n\n+ -------------------------------- +");
        System.out.println("|  << -- Animais Terrestres -- >>  |");
        System.out.println("+ -------------------------------- +");
        System.out.println("|       ##-[1] Capivara            |");
        System.out.println("|       ##-[2] Elefante            |");
        System.out.println("|       ##-[3] Galinha D'angola    |");
        System.out.println("|       ##-[4] Girafa              |");
        System.out.println("|       ##-[5] Gorila              |");
        System.out.println("|       ##-[6] Leao                |");
        System.out.println("|       ##-[7] Macaco              |");
        System.out.println("|       ##-[8] Onça                |");
        System.out.println("|       ##-[9] Serpente            |");
        System.out.println("|       ##-[10] Tigre              |");
        System.out.println("|       ##-[11] Avestruz           |");
        System.out.println("|       ##-[0] Sair                |");
        System.out.println("+ -------------------------------- +");
    }

    public void mostrarOpcaoAnimaisAereos() {
        System.out.println("\n\n+ ---------------------------- +");
        System.out.println("|  << -- Animais Aereos -- >>  |");
        System.out.println("+ ---------------------------- +");
        System.out.println("|        ##-[1] Arara          |");
        System.out.println("|        ##-[2] Coruja         |");
        System.out.println("|        ##-[3] Falcão         |");
        System.out.println("|        ##-[4] Papagaio       |");
        System.out.println("|        ##-[5] Águia          |");
        System.out.println("|        ##-[0] Sair           |");
        System.out.println("+ ---------------------------- +");
    }

    public void mostrarOpcaoAnimaisAquaticos() {
        System.out.println("\n\n+ ------------------------------- +");
        System.out.println("|  << -- Animais Aquaticos -- >>  |");
        System.out.println("+ ------------------------------- +");
        System.out.println("|        ##-[1] Cisne             |");
        System.out.println("|        ##-[2] Flamingo          |");
        System.out.println("|        ##-[3] Hipopotamo        |");
        System.out.println("|        ##-[4] Jacare            |");
        System.out.println("|        ##-[5] Leao Marinho      |");
        System.out.println("|        ##-[6] Pato              |");
        System.out.println("|        ##-[7] Tartaruga         |");
        System.out.println("|        ##-[0] Sair              |");
        System.out.println("+ ------------------------------- +");
    }

    public void mostrarOpcaoListarAnimais() {
        System.out.println("\n\n+ ---------------------------- +");
        System.out.println("|  << -- Listar Animais -- >>  |");
        System.out.println("+ ---------------------------- +");
        System.out.println("|    ##-[1] Por Habitat        |");
        System.out.println("|    ##-[2] Por animal         |");
        System.out.println("|    ##-[3] Todos cadastrados  |");
        System.out.println("|    ##-[0] Sair               |");
        System.out.println("+ ---------------------------- +");
    }

    public void mostrarMenuBuscarAnimal() {
        System.out.println("+ --------------------------- +");
        System.out.println("|  << -- Buscar animal -- >>  |");
        System.out.println("+ --------------------------- +");
        System.out.println("|      #-[1] Sei o ID         |");
        System.out.println("|      #-[2] Esqueci o ID     |");
        System.out.println("+ --------------------------- +");
    }

    public void mostrarInfoParaDescobrirIDAnimal() {
        System.out.println("+ ----------------------------------- +");
        System.out.println("|  << -- Encontrando ID Animal -- >>  |");
        System.out.println("+ ----------------------------------- +");
        System.out.println("Para encontrar o ID siga os passos abaixo: ");
        System.out.println(" - Volte ao menu principal");
        System.out.println(" - Escolha a opção [Listar Animais]");
        System.out.println(" - Escolha a opção [Todos cadastrados]");
        System.out.println(" - Encontre o ID do animal que está procurando!!");
    }

    public void mostrarOpcaoTodosAnimaisCadastrados(AnimalManager animalManager) {
        Map<String,Animal> animaisMap = animalManager.getAnimaisCadastrados();
        System.out.println("+ --------------------------------- +");
        System.out.println("|  << -- Animais Disponiveis -- >>  |");
        System.out.println("+ --------------------------------- +");
        for(String chave : animaisMap.keySet()) {
            System.out.println("|    [" + chave + "] # >> " + animalManager.getNomeClasseAnimal(animaisMap.get(chave)));
        }
        System.out.println("+ ---------------------------------");
    }
}
