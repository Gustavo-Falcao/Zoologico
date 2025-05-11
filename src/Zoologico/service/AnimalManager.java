package Zoologico.service;

import Zoologico.model.*;
import java.util.ArrayList;
import java.util.List;


public class AnimalManager {

    private final List<Animal> animais = new ArrayList<>();
    private final InputHelper pegarInput = new InputHelper();

    // solicita informações e adiciona o objeto Aguia na lista de animais
    public void adicionarAguia() {
        int idAnimal = solicitarIdAnimal();
        String nome = solicitarNomeAnimal();
        String especie = solicitarEspecieAnimal();
        int idade = solicitarIdadeAnimal();
        double peso = solicitarPesoAnimal();
        double altura = solicitarAlturaAnimal();
        double comprimento = solicitarComprimentoAnimal();
        String cor = solicitarCorAnimal();
        double alcanceMaximoAltura = pegarInput.pegarDouble("Digite o alcance máximo de altura em metros: ");
        double tempoMaximoVoo = pegarInput.pegarDouble("Digite o tempo máximo de voo em minutos: ");
        double veloMax = pegarInput.pegarDouble("Digite a velocidade máxima em Km/h: ");

        animais.add(criarAguia(nome, especie, idade, peso, altura, comprimento, cor, idAnimal, alcanceMaximoAltura, tempoMaximoVoo, veloMax));
    }

    // retorna uma instância criada do objeto Aguia
    private Aguia criarAguia(String nome, String especie, int idade, double peso, double altura, double comprimento, String cor, int idAnimal, double alcanceMaxAltura, double tempoMaxVoo, double veloMax) {
        return new Aguia(nome, especie, idade, peso, altura, comprimento, cor, idAnimal, alcanceMaxAltura, tempoMaxVoo, veloMax);
    }

    // solicita informações e adiciona o objeto Capivara na lista de animais
    public void adicionarCapivara() {
        int idAnimal = solicitarIdAnimal();
        String nome = solicitarNomeAnimal();
        String especie = solicitarEspecieAnimal();
        int idade = solicitarIdadeAnimal();
        double peso = solicitarPesoAnimal();
        double altura = solicitarAlturaAnimal();
        double comprimento = solicitarComprimentoAnimal();
        String cor = solicitarCorAnimal();
        int numeroPatas = pegarInput.pegarInteiro("Digite o número de patas: ");
        String opcaoAlimentar = pegarInput.pegarString("Digite a opção alimentar: ");

        animais.add(criarCapivara(nome, especie, idade, peso, altura, comprimento, cor, idAnimal, numeroPatas, opcaoAlimentar));
        System.out.println("Capivara adicionada com sucesso!!");
    }

    // retorna uma instância criada do objeto Capivara
    private Capivara criarCapivara(String nome, String especie, int idade, double peso, double altura, double comprimento, String cor, int idAnimal, int numeroPata, String opcaoAlimentar){
        return new Capivara(nome, especie, idade, peso, altura, comprimento, cor, idAnimal, numeroPata, opcaoAlimentar);
    }

    // solicita informações e adiciona o objeto Elefante na lista de animais
    public void adicionarElefante() {
        int idAnimal = solicitarIdAnimal();
        String nome = solicitarNomeAnimal();
        String especie = solicitarEspecieAnimal();
        int idade = solicitarIdadeAnimal();
        double peso = solicitarPesoAnimal();
        double altura = solicitarAlturaAnimal();
        double comprimento = solicitarComprimentoAnimal();
        String cor = solicitarCorAnimal();
        int numeroPatas = pegarInput.pegarInteiro("Digite o número de patas: ");
        String opcaoAlimentar = pegarInput.pegarString("Digite a opção alimentar: ");

        animais.add(criarElefante(nome, especie, idade, peso, altura, comprimento, cor, idAnimal, numeroPatas, opcaoAlimentar));
    }

    // retorna uma instância criada do objeto Elefante
    private Elefante criarElefante(String nome, String especie, int idade, double peso, double altura, double comprimento, String cor, int idAnimal, int numeroPatas, String opcaoAlimentar) {
        return new Elefante(nome, especie, idade, peso, altura, comprimento, cor, idAnimal, numeroPatas, opcaoAlimentar);
    }

    private int solicitarIdAnimal(){
        return pegarInput.pegarInteiro("Digite o id: ");
    }

    private String solicitarNomeAnimal() {
        return pegarInput.pegarString("Digite o nome: ");
    }

    private String solicitarEspecieAnimal() {
        return pegarInput.pegarString("Digite a espécie: ");
    }

    private int solicitarIdadeAnimal() {
        return pegarInput.pegarInteiro("Digite a idade: ");
    }

    private double solicitarPesoAnimal() {
        return pegarInput.pegarDouble("Digite o peso em kilogramas: ");
    }

    private double solicitarAlturaAnimal() {
        return pegarInput.pegarDouble("Digite a altura em centimetros: ");
    }

    private double solicitarComprimentoAnimal() {
        return pegarInput.pegarDouble("Digite o comprimento em centimetros: ");
    }

    private String solicitarCorAnimal() {
        return pegarInput.pegarString("Digite a cor: ");
    }

    // retorna uma cópia da lista dos animais cadastrados
    public List<Animal> getAnimais() {
        return new ArrayList<>(this.animais);
    }

    // retorna o nome da classe do animal
    public String getNomeClasseAnimal(Animal animal) {
        return animal.getClass().getSimpleName();
    }

    // retorna uma lista somente com os animais herdeiros da classe AnimaisTerrestres
    public List<AnimalTerrestre> getAnimaisTerrestres() {
        List<AnimalTerrestre> animaisTerrestres = new ArrayList<>();
        for(Animal animal : this.animais) {
            if(animal instanceof AnimalTerrestre animalTerrestre) {
                animaisTerrestres.add(animalTerrestre);
            }
        }
        return animaisTerrestres;
    }

    // retorna uma lista somente com os animais herdeiros da classe AnimaisAereos
    public List<AnimalAereo> getAnimaisAereos() {
        List<AnimalAereo> animaisAereos = new ArrayList<>();
        for(Animal animal : this.animais) {
            if(animal instanceof AnimalAereo animalAereo) {
                animaisAereos.add(animalAereo);
            }
        }
        return animaisAereos;
    }


    public void listarAnimais() {
        for(Animal animal : animais) {
            System.out.println("Nome: " + animal.getNome());
            System.out.println("Especie: " + animal.getEspecie());
            System.out.println("Idade: " + animal.getIdade());
            System.out.println("Peso: " + animal.getPeso());
            System.out.println("Altura: " + animal.getAltura());
            System.out.println("Comprimento: " + animal.getComprimento());
            System.out.println("Cor: " + animal.getCor());
            if(animal instanceof Aguia aguia) {
                System.out.println("Alcance maximo de altura: " + aguia.getAlcanceMAxAltura());
                System.out.println("Tempo maximo de voo: " + aguia.getTempoMaxVoo());
                System.out.println("Velocidade maxima voo: " + aguia.getVelocidadeMaxVoo());
                System.out.println();
                aguia.descansar();
                aguia.acordar();
                aguia.movimentar();
                aguia.emitirSom();
            }

        }
    }

}



