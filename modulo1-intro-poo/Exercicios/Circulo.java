public class Circulo {
    private double raio;
    private double area;
    private double perimetro;
    private final double PI = 3.14;

    public Circulo(double raio){
        this.raio = raio;
    }

    public double getArea(){
        this.area = PI * (raio * raio);
        return this.area; 
    }

    public double getPerimetro(){
        this.perimetro = 2* PI * raio;
        return this.perimetro; 
    }

    public static void main(String[] args) {
        Circulo circulo = new Circulo(4);
        System.out.println("Área:      " + circulo.getArea());
        System.out.println("Perímetro: " + circulo.getPerimetro());
    }
}
