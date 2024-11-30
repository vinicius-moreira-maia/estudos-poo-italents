package Exercicios;

public class Moto extends Veiculo {
    private String cor;
    private boolean cross;

    Moto(String modelo, int ano, String cor, boolean cross){
        super(modelo, ano);
        this.cor = cor;
        this.cross = cross;
    }

    public void acelerarMoto(){
        System.out.println("moto acelerando...");
    }

    // Exercício 4
    @Override
    public String imprimirInformacoes() {
        return super.imprimirInformacoes() + "\n" + "Cor: " + cor + "\n" + " Cross?: " + cross;
    }
}
