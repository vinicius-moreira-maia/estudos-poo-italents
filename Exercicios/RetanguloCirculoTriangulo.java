package Exercicios;

public class RetanguloCirculoTriangulo {
    public static void main(String[] args) {
        // Exercício 7
        FormaGeometrica tr = new Triangulo(3, 4);
        FormaGeometrica circ = new Circulo(3);
        FormaGeometrica ret = new Retangulo(3, 4);

        // não sei calcular perímetro de triângulo a partir de base e altura
        tr.area();

        circ.area();
        circ.perimetro();

        ret.area();
        ret.perimetro();
    }
}
