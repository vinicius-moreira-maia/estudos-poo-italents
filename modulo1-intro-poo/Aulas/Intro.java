public class Intro {
    
    /*
     Abstração -> É representar algo utilizando as características mais importantes desse algo, ignorando o que for
     desnecessário.

     Objetos -> São estruturas de dados heterogêneas que representam algo, e que possuem atributos (características) e 
     métodos (comportamentos).

     Classes -> São "blueprints" para a criação de objetos. Possuem a definição dos atributos e métodos, incluindo o método
     especial construtor, utilizado no momento da criação do objeto através da palavra 'new'.
     
     Modificadores de acesso -> São funcionalidades que definem a visibilidade de um método, classe ou de um atributo. Poden
     ser 'private', 'public', 'protected' ou 'default' no Java. Na prática os mais usados são os dois primeiros.
     
     Herança -> Capacidade de um objeto pai passar suas características (métodos e atributos) para os objetos filhos, criando
     uma cadeia de dependências.

     Polimorfismo -> Capacidade de objetos possuírem métodos de mesma nome com comportamentos diferentes. Sobrescrita é quando
     uma classe filha implementa um método da classe pai e sobrecarga é quando uma classe possui 2 métodos com nomes
     iguais mas assinaturas diferentes.

     Encapsulamento -> Capacidade de objetos guardarem em si tudo (ou quase tudo) que é preciso para operarem e de protegerem seu estado interno, no caso de Java essa característica é reforçada devido aos modificadores de acesso.

     ------------------------

     Pacote, no java, é uma pasta que contém arquivos .java.
     Quando eu executo este arquivo, ocorre a compilação em bytecode e a execução do bytecode pela JVM. O interpretador busca 
     o método main para ser executado.
     */

    public static void main(String[] args) {
        //System.out.println("Agora é POO, papai!");

        // Carro está no mesmo pacote, portanto pode ser referenciada aqui
        Carro carro = new Carro();
        System.out.println(carro);

        Carro novoCarro = new Carro(1988, "Opala Pretoooo");
        System.out.println(novoCarro);
    }
}