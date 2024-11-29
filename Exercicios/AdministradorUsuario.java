package Exercicios;

import java.util.ArrayList;

public class AdministradorUsuario {
    public static void main(String[] args) {
        // Exercício 10
        ArrayList<Autenticavel> pessoas = new ArrayList<>();
        pessoas.add(new Usuario("Pedro"));
        pessoas.add(new Usuario("Joana"));
        pessoas.add(new Administrador("Alex"));

        for (Autenticavel colaborador : pessoas) {
            colaborador.autenticar();
        }
    }
}
