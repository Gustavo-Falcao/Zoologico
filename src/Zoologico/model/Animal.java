package Zoologico.model;

public abstract class Animal {

    protected String nome;
    protected String especie;
    protected int idade;
    protected double peso;
    protected double altura;
    protected double comprimento;
    protected String cor;

    public Animal(String nome, String especie, int idade, double peso, double altura, double comprimento, String cor) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.comprimento = comprimento;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public String getCor() {
        return cor;
    }

    public abstract void descansar();
    public abstract void acordar();
    public abstract void movimentar();
}
