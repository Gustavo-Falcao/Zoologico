package Zoologico.service;

import Zoologico.model.Aguia;
import Zoologico.model.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class AnimalManeger {

    private final List<Animal> animais;

    public AnimalManeger() {
        this.animais = new ArrayList<>();
    }

    public void adicionarAnimal(String tipoAnimal, String nomeAnimal) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = ler.nextLine();

        System.out.print("Digite a espécie: ");
        String especie = ler.nextLine();

        System.out.print("Digite a idade: ");
        int idade = Integer.parseInt(ler.nextLine());

        System.out.print("Digite o peso em kilogramas: ");
        double peso = Double.parseDouble(ler.nextLine());

        System.out.print("Digite a altura em centímetros: ");
        double altura = Double.parseDouble(ler.nextLine());

        System.out.print("Digite o comprimento em centímetros: ");
        double comprimento = Double.parseDouble(ler.nextLine());

        System.out.print("Digite a cor: ");
        String cor = ler.nextLine();

        if(tipoAnimal.equalsIgnoreCase("aereo")) {
            System.out.print("Digite o alcance máximo de altura em metros: ");
            double alcanceMaximoAltura = Double.parseDouble(ler.nextLine());

            System.out.print("Digite o tempo máximo de voo em minutos: ");
            double tempoMaximoVoo = Double.parseDouble(ler.nextLine());

            System.out.print("Digite a velocidade máxima em Km/h: ");
            double veloMax = Double.parseDouble(ler.nextLine());

            if(nomeAnimal.equalsIgnoreCase("aguia")) {
                animais.add(new Aguia(nome, especie, idade, peso, altura, comprimento, cor,alcanceMaximoAltura, tempoMaximoVoo, veloMax));
            }
        }
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
