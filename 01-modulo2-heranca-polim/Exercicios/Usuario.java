package Exercicios;

public class Usuario implements Autenticavel {
    private String nome;

    Usuario(String nome){
        this.nome = nome;
    }

    @Override
    public void autenticar() {
        System.out.println("autenticando usuário: " + this.nome);
    }
}
