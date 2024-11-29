package Exercicios;

public class Triangulo extends FormaGeometrica {
    private double base;
    private double altura;

    Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public void area() {
        System.out.println("Triângulo - Área: " + ((base * altura) / 2));
    }
}
