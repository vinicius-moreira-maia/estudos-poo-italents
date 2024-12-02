import java.util.Scanner;

// Exercício 6

public class ConversaoStringParaInteiro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("número: ");
        String input = scanner.nextLine();

        try {
            int numero = Integer.parseInt(input);
            System.out.println("Número convertido: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Não foi possível converter para inteiro.");
        }
    }
}
