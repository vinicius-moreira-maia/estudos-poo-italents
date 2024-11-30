public class Animal {
    private String nome;
    private String alimentacao;

    public Animal(String nome, String alimentacao){
        this.nome = nome;
        this.alimentacao = alimentacao;
    }

    public void emitirSom(){
        if (this.nome.equals("Leão")) {
            System.out.println("WhhhrrooAAAggggHHHHH");
        } else {
          System.out.println("animal desconhecido");  
        }
    }

    public static void main(String[] args) {
        Animal leao = new Animal("Leão", "Carne");
        leao.emitirSom();

        Animal gato = new Animal("Gato", "Ração");
        gato.emitirSom();
    }
}
