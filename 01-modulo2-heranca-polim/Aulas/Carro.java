public class Carro extends Veiculo {
    private int portas;
    
    // o construtor deve receber os parâmetros de construção da classe pai
    public Carro(String marca, String cor, int portas){
        super(marca, cor); // enviando para a superclasse
        this.portas = portas;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public void buzinar(int n){
        for (int i = 0; i < n; i ++){
            System.out.println("Bibiiiiiittt");
        }
    }

    // sobrecarregando o método buzinar
    // o tipo do retorno não influencia, o que influencia são os parâmetros recebidos
    public void buzinar(int n, boolean tarzan){
        for (int i = 0; i < n; i ++){
            if (!tarzan) {
                System.out.println("Bibiiiiiittt");    
            }
            else {
                System.out.println("aaaaAAAAaaAAAaaAAAaaaaaahhhhhoooooooo");
            }
        }
    }

    // aqui a sobrescrita é do método da classe pai, não da classe 'Object'
    @Override
    public String toString() {
        return super.toString() + "\n" + "Portas: " + this.getPortas();
    }

    public static void main(String[] args) {
        Carro c = new Carro("Ford", "preto", 4);
        //System.out.println(c.getMarca()); // Carro herda esse método
        //System.out.println(c.getCor()); // Carro herda esse método
        //System.out.println(c.getPortas());
        System.out.println(c);

        //c.buzinar(2);
        c.buzinar(4, true);
    }
}
