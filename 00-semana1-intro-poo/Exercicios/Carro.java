public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private boolean ligado;

    public Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.ligado = false;
    }
    
    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void ligar() {
        setLigado(true);
        System.out.println("Ligado");
    }

    public void desligar() {
        setLigado(false);
        System.out.println("Desligado");
    }

    public void acelerar() {
        System.out.println("VvvvrrRRRRuuuUUMMMMmmmmmm");
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

    public static void main(String[] args) {
        Carro c = new Carro("Chevrolet", "Chevete", 1982);
        System.out.println("marca:       " + c.getMarca());
        System.out.println("modelo:      " + c.getModelo());
        System.out.println("ano:         " + c.getAno());
        c.ligar();
        c.desligar();
        c.ligar(); 
        c.acelerar();   
    }
}
