package Exercicios;

public class Retangulo extends FormaGeometrica {

    private double base;
    private double altura;
    
    Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void area() {
        System.out.println("Retângulo - Área: " + (base * altura));
    }    

    @Override
    public void perimetro() {
        System.out.println("Retângulo - Perímetro: " + (2 * (base + altura)));
    }
}
