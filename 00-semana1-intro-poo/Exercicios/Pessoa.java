public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void cumprimentar(){
        System.out.println("Olá, " + nome + "!");
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Zé", 40);
        pessoa.cumprimentar();
    }
}
