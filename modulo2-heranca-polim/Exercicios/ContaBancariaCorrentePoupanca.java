package Exercicios;

public class ContaBancariaCorrentePoupanca {
    public static void main(String[] args) {
        // As classes aqui usadas envolvem as questões 3 (implementação de Herança) e 9 (implementação de polimorfismo de sobrescrita)

        ContaBancaria corrente = new ContaCorrente();
        ContaPoupanca poupanca = new ContaPoupanca();

        // Exercício 9
        corrente.aplicarJuros();
        poupanca.aplicarJuros();

        System.out.println("Juros - Corrente: " + corrente.getTaxaJuros());
        System.out.println("Juros - Poupanca: " + poupanca.getTaxaJuros());
    }
}
