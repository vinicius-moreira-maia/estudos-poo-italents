public class Veiculo {
    private String marca;
    private String cor;

    public Veiculo(String marca, String cor){
        this.marca = marca;
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Polimorfismo de sobresctita (este método está definido na classe 'Object')
    @Override
    public String toString() {
        return "Marca: " + this.getMarca() + "\n" + "Cor: " + this.getCor();
    }
}
