package Exercicios;

public class CarroMotoVeiculo {
    public static void main(String[] args) {
        // As classes aqui usadas envolvem as questões 1 (implementação de Herança) e 4 (implementação de polimorfismo de sobrescrita)

        Veiculo carro = new Carro("Fusca", 1980, "amarelo", 2);
        System.out.println(carro.imprimirInformacoes());

        System.out.println();

        Veiculo moto = new Moto("Yamaha", 2008, "preto", false);
        System.out.println(moto.imprimirInformacoes());
    }
}
