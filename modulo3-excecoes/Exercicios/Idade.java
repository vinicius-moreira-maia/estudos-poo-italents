// Exercício 3

public class Idade {
    public static void main(String[] args) {
        try {
            verificarIdade(151);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void verificarIdade(int idade) {
        if (idade < 0 || idade > 150) {
            throw new IllegalArgumentException("idade não pode ser maior que 150 ou menor que 0");
        } else {
            System.out.println("Idade válida: " + idade);
        }
    }
}
