package Zoologico.model;

public abstract class AnimalTerrestre extends Animal {

    protected int numeroPatas;
    protected String opcaoAlimentar;


    public AnimalTerrestre(String nome, String especie, int idade, double peso, double altura, double comprimento, String cor, int numeroPatas, String opcaoAlimentar) {
        super(nome, especie, idade, peso, altura, comprimento, cor);
        this.numeroPatas = numeroPatas;
        this.opcaoAlimentar = opcaoAlimentar;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public String getOpcaoAlimentar() {
        return opcaoAlimentar;
    }

    public void getInfoAnimalTerrestre() {
        super.getInfoDetalhadaAnimais();
        System.out.println("| -> Numero de patas: " + getNumeroPatas());
        System.out.println("| -> Opção alimentar: " + getOpcaoAlimentar());
    }
}
