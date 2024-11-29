// requisito 1
public class Caminhao extends Veiculo {
    private String tipoCombustivel;
    private boolean carreta;

    public Caminhao(String marca, String modelo, int ano, String cor, double preco,
        boolean carreta, String tipoCombustivel) {

        super(marca, modelo, ano, cor, preco);
        this.tipoCombustivel = tipoCombustivel;
        this.carreta = carreta;
    }

    public boolean isCarreta(){
        return carreta;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Tipo de combustivel: "+tipoCombustivel);

        if (isCarreta()){
            System.out.println("É uma carreta.");
        } else {
            System.out.println("Não é uma carreta.");
        }
    }
}
