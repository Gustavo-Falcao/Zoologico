package Zoologico.service;
import Zoologico.model.*;
import java.util.ArrayList;
import java.util.List;

public class OutputHelper {

    public void mostrarAnimaisDetalhados(AnimalManager animalManager) {
        List<Animal> animais = animalManager.getAnimais();
        System.out.println("\n\n-----------------------------------");
        System.out.println("|  <<-- Animais Cadastrados -->>  |");
        System.out.println("-----------------------------------");
        for(Animal animal : animais) {
            animal.getInfoDetalhadaAnimais();
            if(animal instanceof Aguia aguia) {
                aguia.getInfoAguia();
            }
            System.out.println("-----------------------------------");
        }
    }

    public void mostrarMenuPrincipal() {
        System.out.println("\n\n---------------------------------------------------------");
        System.out.println("|  << --  Gerenciamento de Animais no Zoologico  -- >>  |");
        System.out.println("---------------------------------------------------------");
        System.out.println("|               ##-[1] Cadastrar animal                 |");
        System.out.println("|               ##-[2] Listar animais                   |");
        System.out.println("|               ##-[3] Buscar animal                    |");
        System.out.println("|               ##-[4] Acessar animal                   |");
        System.out.println("|               ##-[5] Excluir animal                   |");
        System.out.println("|               ##-[0] Sair                             |");
        System.out.println("---------------------------------------------------------");
    }

    public void mostrarOpcaoHabitatAnimais() {
        System.out.println("\n\n---------------------------------");
        System.out.println("|  << -- Habitat animais -- >>  |");
        System.out.println("---------------------------------");
        System.out.println("|       ##-[1] Terrestre        |");
        System.out.println("|       ##-[2] Aereo            |");
        System.out.println("|       ##-[3] Aquatico         |");
        System.out.println("|       ##-[0] Sair             |");
        System.out.println("---------------------------------");
    }

    public void mostrarOpcaoAnimaisTerrestres() {
        System.out.println("\n\n------------------------------------");
        System.out.println("|  << -- Animais Terrestres -- >>  |");
        System.out.println("------------------------------------");
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
        System.out.println("------------------------------------");
    }

    public void mostrarOpcaoAnimaisAereos() {
        System.out.println("\n\n--------------------------------");
        System.out.println("|  << -- Animais Aereos -- >>  |");
        System.out.println("--------------------------------");
        System.out.println("|        ##-[1] Arara          |");
        System.out.println("|        ##-[2] Coruja         |");
        System.out.println("|        ##-[3] Falcão         |");
        System.out.println("|        ##-[4] Papagaio       |");
        System.out.println("|        ##-[5] Águia          |");
        System.out.println("|        ##-[0] Sair           |");
        System.out.println("--------------------------------");
    }

    public void mostrarOpcaoAnimaisAquaticos() {
        System.out.println("\n\n-----------------------------------");
        System.out.println("|  << -- Animais Aquaticos -- >>  |");
        System.out.println("-----------------------------------");
        System.out.println("|        ##-[1] Cisne             |");
        System.out.println("|        ##-[2] Flamingo          |");
        System.out.println("|        ##-[3] Hipopotamo        |");
        System.out.println("|        ##-[4] Jacare            |");
        System.out.println("|        ##-[5] Leao Marinho      |");
        System.out.println("|        ##-[6] Pato              |");
        System.out.println("|        ##-[7] Tartaruga         |");
        System.out.println("|        ##-[0] Sair              |");
        System.out.println("-----------------------------------");
    }

    public void mostrarOpcaoListarAnimais() {
        System.out.println("\n\n--------------------------------");
        System.out.println("|  << -- Listar Animais -- >>  |");
        System.out.println("--------------------------------");
        System.out.println("|    ##-[1] Por Habitat        |");
        System.out.println("|    ##-[2] Por animal         |");
        System.out.println("|    ##-[3] Todos cadastrados  |");
        System.out.println("|    ##-[0] Sair               |");
        System.out.println("--------------------------------");
    }
}
