public class Retangulo {
    private double altura;
    private double largura;
    private double area;
    private double perimetro;

    public Retangulo(double altura, double largura){
        this.altura = altura;
        this.largura = largura;
    }

    public double getArea(){
        area = altura * largura;
        return this.area; 
    }

    public double getPerimetro(){
        this.perimetro = (altura * 2) + (largura * 2);
        return this.perimetro; 
    }

    public static void main(String[] args) {
        Retangulo r = new Retangulo(4, 30);
        System.out.println("Área:      " + r.getArea());
        System.out.println("Perímetro: " + r.getPerimetro());
    }
}
