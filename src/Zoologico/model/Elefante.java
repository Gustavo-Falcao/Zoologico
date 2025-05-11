package Zoologico.model;

public class Elefante extends AnimalTerrestre{
    public Elefante(String nome, String especie, int idade, double peso, double altura, double comprimento, String cor, int idAnimal, int numeroPatas, String opcaoAlimentar) {
        super(nome, especie, idade, peso, altura, comprimento, cor, idAnimal, numeroPatas, opcaoAlimentar);
    }

    @Override
    public void descansar() {
        System.out.println("Elefante descansando");
    }

    @Override
    public void acordar() {
        System.out.println("Elefante acordando");
    }

    @Override
    public void movimentar() {
        System.out.println("Elefante movimentando");
    }
}
