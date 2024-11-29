package Exercicios;

import java.util.ArrayList;

public class AnimalPeixeMamifero {
    public static void main(String[] args) {
        // As classes aqui usadas envolvem as questões 2 (implementação de Herança), 5 (implementação de polimorfismo de sobrescrita) e 8 (utilização de métodos polimórficos)

        // Exercício 8
        ArrayList<Animal> animais = new ArrayList<>(); 
        animais.add(new Peixe());
        animais.add(new Mamifero());
        animais.add(new Peixe());

        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}
