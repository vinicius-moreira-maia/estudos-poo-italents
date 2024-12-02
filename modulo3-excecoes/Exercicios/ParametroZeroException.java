// Exercício 1

public class ParametroZeroException {
    public static void main(String[] args) {
        try {
            Exercicio1(10, 0); 
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void Exercicio1(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("O segundo número não pode ser 0");
        }

        System.out.println(a + b);
    }
}