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

    public double getAlcanceMAxAltura() {
        return alcanceMAxAltura;
    }

    public double getTempoMaxVoo() {
        return tempoMaxVoo;
    }

    public double getVelocidadeMaxVoo() {
        return velocidadeMaxVoo;
    }

    public void getInfoAnimaisAereos() {
        getInfoDetalhadaAnimais();
        System.out.println("| -> Alcance Max de altura: " + getAlcanceMAxAltura());
        System.out.println("| -> Tempo máximo de voo: " + getTempoMaxVoo());
        System.out.println("| -> Velocidade máxima voando: " + getVelocidadeMaxVoo());
    }
}
