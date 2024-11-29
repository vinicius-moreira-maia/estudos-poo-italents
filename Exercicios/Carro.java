package Exercicios;

public class Carro extends Veiculo{
    private String cor;
    private int nPortas;

    Carro(String modelo, int ano, String cor, int nPortas){
        super(modelo, ano);
        this.cor = cor;
        this.nPortas = nPortas;
    }

    public void acelerarCarro(){
        System.out.println("carro acelerando...");
    }

    // Exercício 4
    @Override
    public String imprimirInformacoes() {
        return super.imprimirInformacoes() + "\n" + "Cor: " + cor + "\n" + " nº de portas: " + nPortas;
    }
}