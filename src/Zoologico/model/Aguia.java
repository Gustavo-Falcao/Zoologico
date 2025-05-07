package Zoologico.model;

public class Aguia extends AnimalAereo implements SomAnimal {

    public Aguia(String nome, String especie, int idade, double peso, double altura, double comprimento, String cor, double alcanceMAxAltura, double tempoMaxVoo, double velocidadeMaxVoo) {
        super(nome, especie, idade, peso, altura, comprimento, cor, alcanceMAxAltura, tempoMaxVoo, velocidadeMaxVoo);
    }

    @Override
    public void descansar() {
        System.out.println("Aguia está descansando");
    }

    @Override
    public void acordar() {
        System.out.println("Aguia está acordada");
    }

    @Override
    public void movimentar() {
        System.out.println("Aguia está se movimentando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Aguia está gritando!!");
    }

    public void getInfoAguia() {
        System.out.println("| -> Alcance máximo de altura: " + getAlcanceMAxAltura() + " metros");
        System.out.println("| -> Tempo máximo de voo: " + getTempoMaxVoo() + " minutos");
        System.out.println("| -> Velocidade máxima: " + getVelocidadeMaxVoo() + " Km/h");
    }

}
