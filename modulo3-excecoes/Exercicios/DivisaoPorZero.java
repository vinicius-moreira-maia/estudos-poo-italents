import java.util.Scanner;

// Exercício 4

public class DivisaoPorZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        try {
            int res = numero / 0; 
        } catch (ArithmeticException e) {
            System.out.println("Não é possível dividir por zero.");
        }

        scanner.close();
    }
}
