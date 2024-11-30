package Exercicios;

public class Calculadora {
        public static void soma(int x, int y){
            System.out.println(x + y);
        }

        public static void soma(double x, double y){
            System.out.println(x + y);
        }

        public static void subtracao(int x, int y){
            System.out.println(x - y);
        }

        public static void subtracao(double x, double y){
            System.out.println(x - y);
        }

        public static void divisao(int x, int y){
            System.out.println(x / y);
        }

        public static void divisao(double x, double y){
            System.out.println(x / y);
        }

        public static void multiplicacao(int x, int y){
            System.out.println(x * y);
        }

        public static void multiplicacao(double x, double y){
            System.out.println(x * y);
        }

        public static void main(String[] args) {
            // todos os métodos da classe são métodos de classe, portanto podem ser chamados sem instanciação de objetos

            multiplicacao(1, 2);
            multiplicacao(2.0, 5.5);
        }
}
