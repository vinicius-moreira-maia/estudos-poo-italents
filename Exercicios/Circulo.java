package Exercicios;

public class Circulo extends FormaGeometrica {
    private double raio;
    
    Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public void area() {
        System.out.println("Círculo - Área: " + (Math.PI * raio * raio));
    }

    @Override
    public void perimetro() {
        System.out.println("Círculo - Perímetro: " + (2 * Math.PI * raio));
    }
}
