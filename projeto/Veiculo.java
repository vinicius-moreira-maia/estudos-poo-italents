public class Veiculo implements InterfaceVeiculo{
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private double preco;
    private int velocidade;

    public Veiculo(String marca, String modelo, int ano, String cor, double preco){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.preco = preco;
        this.velocidade = 0;
    }

    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getAno() {
        return ano;
    }
    public String getCor() {
        return cor;
    }
    public double getPreco() {
        return preco;
    }
    public int getVelocidade() {
        return velocidade;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public void ligar() {
        System.out.println("Veiculo ligado...");
    }

    @Override
    public void desligar() {
        System.out.println("Veiculo desligado...");
    }

    @Override
    public void acelerar(int velocidade) {
        try {
            this.velocidade += velocidade;
            if (this.velocidade > 120) {
                throw new MaxVelException("Velocidade acima do limite permitido!");
            }
            System.out.println("Veículo acelerando...");
            System.out.println("Velocidade atual do veículo: " + this.velocidade + " Km/h");
        } catch (MaxVelException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void frear(int velocidade) {
        try {
            this.velocidade -= velocidade;
            if (this.velocidade < 0) { 
                throw new MinVelException("Velocidade abaixo do mínimo permitido!");
            }
            System.out.println("Veículo desacelerando...");
            System.out.println("Velocidade atual do veículo: " + this.velocidade + " Km/h");
        } catch (MinVelException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Marca:  "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Ano:    "+ano);
        System.out.println("Cor:    "+cor);
        System.out.println("Preço:  "+preco);
    }

    // requisito 6
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Ford", "Ka", 2021, "preto", 38000);

        veiculo.acelerar(130);
        veiculo.frear(200);
    }
    
}
