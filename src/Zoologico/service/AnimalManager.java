package Zoologico.service;

import java.util.Map;
import java.util.LinkedHashMap;
import Zoologico.model.*;


public class AnimalManager {

    private final LinkedHashMap<String, Animal> animaisMap = new LinkedHashMap<>();
    private final InputHelper pegarInput = new InputHelper();

    // solicita informações e adiciona o objeto Aguia na lista de animais
    public void adicionarAguia(int valorChave) {
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

        animaisMap.put("K" + valorChave, criarAguia(nome, especie, idade, peso, altura, comprimento, cor, alcanceMaximoAltura, tempoMaximoVoo, veloMax));
        System.out.println("Aguia adicionada com sucesso!!");
    }

    // retorna uma instância criada do objeto Aguia
    private Aguia criarAguia(String nome, String especie, int idade, double peso, double altura, double comprimento, String cor, double alcanceMaxAltura, double tempoMaxVoo, double veloMax) {
        return new Aguia(nome, especie, idade, peso, altura, comprimento, cor, alcanceMaxAltura, tempoMaxVoo, veloMax);
    }

    // solicita informações e adiciona o objeto Capivara na lista de animais
    public void adicionarCapivara(int valorChave) {
        String nome = solicitarNomeAnimal();
        String especie = solicitarEspecieAnimal();
        int idade = solicitarIdadeAnimal();
        double peso = solicitarPesoAnimal();
        double altura = solicitarAlturaAnimal();
        double comprimento = solicitarComprimentoAnimal();
        String cor = solicitarCorAnimal();
        int numeroPatas = pegarInput.pegarInteiro("Digite o número de patas: ");
        String opcaoAlimentar = pegarInput.pegarString("Digite a opção alimentar: ");

        animaisMap.put("K" + valorChave, criarCapivara(nome, especie, idade, peso, altura, comprimento, cor , numeroPatas, opcaoAlimentar));
        System.out.println("Capivara adicionada com sucesso!!");
    }

    // retorna uma instância criada do objeto Capivara
    private Capivara criarCapivara(String nome, String especie, int idade, double peso, double altura, double comprimento, String cor, int numeroPata, String opcaoAlimentar){
        return new Capivara(nome, especie, idade, peso, altura, comprimento, cor, numeroPata, opcaoAlimentar);
    }

    // solicita informações e adiciona o objeto Elefante na lista de animais
    public void adicionarElefante(int valorChave) {
        String nome = solicitarNomeAnimal();
        String especie = solicitarEspecieAnimal();
        int idade = solicitarIdadeAnimal();
        double peso = solicitarPesoAnimal();
        double altura = solicitarAlturaAnimal();
        double comprimento = solicitarComprimentoAnimal();
        String cor = solicitarCorAnimal();
        int numeroPatas = pegarInput.pegarInteiro("Digite o número de patas: ");
        String opcaoAlimentar = pegarInput.pegarString("Digite a opção alimentar: ");

        animaisMap.put("K" + valorChave, criarElefante(nome, especie, idade, peso, altura, comprimento, cor, numeroPatas, opcaoAlimentar));
        System.out.println("Elefante adicionado com sucesso!!");
    }

    // retorna uma instância criada do objeto Elefante
    private Elefante criarElefante(String nome, String especie, int idade, double peso, double altura, double comprimento, String cor, int numeroPatas, String opcaoAlimentar) {
        return new Elefante(nome, especie, idade, peso, altura, comprimento, cor, numeroPatas, opcaoAlimentar);
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

    // retorna o nome da classe do animal
    public String getNomeClasseAnimal(Animal animal) {
        return animal.getClass().getSimpleName();
    }

    public Map<String, Animal> getAnimaisCadastrados() {
        return new LinkedHashMap<>(this.animaisMap);
    }

    // retorna uma lista somente com os animais herdeiros da classe AnimaisTerrestres
    public Map<String, AnimalTerrestre> getAnimaisTerrestres() {
            Map<String, AnimalTerrestre> animaisTerrestres = new LinkedHashMap<>();
            for(String chave : this.animaisMap.keySet()) {
                if(animaisMap.get(chave) instanceof AnimalTerrestre animalTerrestre) {
                    animaisTerrestres.put(chave, animalTerrestre);
                }
            }
        return animaisTerrestres;
    }

    // retorna uma lista somente com os animais herdeiros da classe AnimaisAereos
    public Map<String, AnimalAereo> getAnimaisAereos() {
            Map<String, AnimalAereo> animaisAereos = new LinkedHashMap<>();
            for(String chave : this.animaisMap.keySet()) {
                if(animaisMap.get(chave) instanceof AnimalAereo animalAereo) {
                    animaisAereos.put(chave, animalAereo);
                }
            }
        return animaisAereos;
    }

    public Animal buscarAnimal(String chaveBusca, AnimalManager animalManager) {
        Map<String, Animal> animais = animalManager.getAnimaisCadastrados();
        return animais.getOrDefault(chaveBusca, null);// se for verdadeiro será retornado o valor relacionado á chave caso contrário será retornado null.
    }


//    public void listarAnimais() {
//        for(Animal animal : animais) {
//            System.out.println("Nome: " + animal.getNome());
//            System.out.println("Especie: " + animal.getEspecie());
//            System.out.println("Idade: " + animal.getIdade());
//            System.out.println("Peso: " + animal.getPeso());
//            System.out.println("Altura: " + animal.getAltura());
//            System.out.println("Comprimento: " + animal.getComprimento());
//            System.out.println("Cor: " + animal.getCor());
//            if(animal instanceof Aguia aguia) {
//                System.out.println("Alcance maximo de altura: " + aguia.getAlcanceMAxAltura());
//                System.out.println("Tempo maximo de voo: " + aguia.getTempoMaxVoo());
//                System.out.println("Velocidade maxima voo: " + aguia.getVelocidadeMaxVoo());
//                System.out.println();
//                aguia.descansar();
//                aguia.acordar();
//                aguia.movimentar();
//                aguia.emitirSom();
//            }
//
//        }
//    }

}



