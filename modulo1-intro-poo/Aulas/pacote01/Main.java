package pacote01;

// importando o pacote
import pacote02.Time;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Time time = new Time();

        // o atributo acessível aqui é o public
        System.out.println(time.nome);

        System.out.println(pessoa.nome); // public é global
        System.out.println(pessoa.idade); // protected tem escopo de pacote
        System.out.println(pessoa.getPeso()); // private tem escopo de classe
    }
}
