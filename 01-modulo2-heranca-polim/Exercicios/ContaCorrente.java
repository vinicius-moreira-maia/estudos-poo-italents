package Exercicios;

public class ContaCorrente extends ContaBancaria {

    // Exercício 9
    @Override
    public void aplicarJuros() {
        this.setTaxaJuros(15/100);
    }
}
