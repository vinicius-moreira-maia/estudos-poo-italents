// Exercídio 10

public class DivisaoInteira {
    public static void main(String[] args) {
        try {
            // divisão exata
            int res = dividir(10, 2);
            System.out.println("Resultado da divisão: " + res);
        } catch (DivisaoInteiraInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            // divisão inexata
            int res = dividir(10, 3);
            System.out.println("Resultado da divisão: " + res);
        } catch (DivisaoInteiraInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static int dividir(int x, int y) throws DivisaoInteiraInvalidaException {
        if (x % y != 0) {
            throw new DivisaoInteiraInvalidaException("resto difrente de zero, divisão não exata");
        }
        return x / y;
    }
}