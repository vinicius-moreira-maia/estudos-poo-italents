package Exercicios;

public class ContaPoupanca extends ContaBancaria{
    
    // Exercício 9
    @Override
    public void aplicarJuros() {
        this.setTaxaJuros(65/100);
    }
}
