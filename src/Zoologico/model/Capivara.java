package Zoologico.model;

public class Capivara extends AnimalTerrestre{


    public Capivara(String nome, String especie, int idade, double peso, double altura, double comprimento, String cor, int idAnimal, int numeroPatas, String opcaoAlimentar) {
        super(nome, especie, idade, peso, altura, comprimento, cor, idAnimal, numeroPatas, opcaoAlimentar);
    }

    @Override
    public void descansar() {
        System.out.println("Capivara descansando");
    }

    @Override
    public void acordar() {
        System.out.println("Capivara acordando");
    }

    @Override
    public void movimentar() {
        System.out.println("Capivara movimentando");
    }
}
