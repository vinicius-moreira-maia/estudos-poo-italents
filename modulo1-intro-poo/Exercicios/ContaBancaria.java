public class ContaBancaria {
    
    private double saldo;
    private int numConta;

    public ContaBancaria(int numConta){
        this.saldo = 0.0;
        this.numConta = numConta;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1234);
        System.out.println("Conta:      " + conta.getNumConta());
        conta.depositar(50);
        System.out.println("Saldo:      " + conta.getSaldo());
        conta.sacar(12.89);
        System.out.println("Saldo:      " + conta.getSaldo());
    }
}
