public class Produto {
    private String nome;
    private Double preco;

    public Produto(String nome, Double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public double getPrecoComDesconto(double desconto){
        double valorDesconto = this.preco * (desconto/100);
        return this.preco - valorDesconto;
    }
    public static void main(String[] args) {
        Produto produto = new Produto("ventilador", 100.0);
        double desconto = 25.0;
        System.out.println("Preço com " + desconto + " % de desconto: " + produto.getPrecoComDesconto(desconto));
    }
}
