package Zoologico.model;

public abstract class AnimalAereo extends Animal {

    protected double alcanceMAxAltura;
    protected double tempoMaxVoo;
    protected double velocidadeMaxVoo;

    public AnimalAereo(String nome, String especie, int idade, double peso, double altura, double comprimento, String cor, double alcanceMAxAltura, double tempoMaxVoo, double velocidadeMaxVoo) {
        super(nome, especie, idade, peso, altura, comprimento, cor);
        this.alcanceMAxAltura = alcanceMAxAltura;
        this.tempoMaxVoo = tempoMaxVoo;
        this.velocidadeMaxVoo = velocidadeMaxVoo;
    }

}
