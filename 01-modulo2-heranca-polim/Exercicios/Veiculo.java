package Exercicios;

public class Veiculo {
    private String modelo;
    private int ano;

    Veiculo(String modelo, int ano){
        this.modelo = modelo;
        this.ano = ano;
    }

    // exercídio 4
    public String imprimirInformacoes(){
        return "Modelo: " + modelo + "\n" + "Ano: " + ano;
    }
}
