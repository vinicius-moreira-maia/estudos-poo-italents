public class Triangulo {
    private double base;
    private double altura;

    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double getArea(){
        return (base * altura)/ 2; 
    }

    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(4, 6);
        System.out.println("Área:      " + triangulo.getArea());
    }
}
