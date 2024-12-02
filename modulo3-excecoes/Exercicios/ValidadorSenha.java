// Exercício 8

public class ValidadorSenha {
    public static void main(String[] args) {
        try {
            validarSenha("abc");
        } catch (SenhaInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static void validarSenha(String senha) throws SenhaInvalidaException {
        if (senha.length() < 8) {
            throw new SenhaInvalidaException("senha deve ter pelo menos 8 caracteres");
        }
    }
}