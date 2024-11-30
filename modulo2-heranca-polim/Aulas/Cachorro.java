// é possível também uma classe implementar várias interfaces (as regras são as mesmas)
public class Cachorro implements Animal{
    private String nome;
    private int idade;

    public Cachorro(String nome, int idade){
        this.idade = idade;
        this.nome = nome;
    }

    // a implementação dos métodos da interface é obrigatória!
    // sobrescrita
    @Override
    public void fazerBarulho() {
        System.out.println("auauau");
    }

    public void fazerBarulho(boolean guarda) {
        System.out.println("AUAUAUAUAUAUARAGWRAGWRAGWR");
    }

    public static void main(String[] args) {
        // o tipo pode ser tanto Animal quanto Cachorro (polimorfismo)
        Animal cao = new Cachorro("mel", 12);

        Cachorro cao2 = new Cachorro("Chico", 2);

        cao.fazerBarulho();
        cao2.fazerBarulho(true); // polimorfismo de sobrecarga

        // por ser um atributo 'static' (atributo de interface/classe) ele deve ser acessado estaticamente
        System.out.println(Animal.TIPO_ANIMAL);
    }
    
}
