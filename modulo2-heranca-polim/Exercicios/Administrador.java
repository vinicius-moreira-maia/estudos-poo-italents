package Exercicios;

public class Administrador implements Autenticavel {
    private String nome;

    Administrador(String nome){
        this.nome = nome;
    }

    @Override
    public void autenticar() {
        System.out.println("autenticando adm: " + this.nome);
    }
}
