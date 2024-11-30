public interface Animal {
    // public static final (todo atributo de interface é uma constante, é público e possui escopo de interface)
    String TIPO_ANIMAL = "Mammifero";

    // métodos abstratos (não possuem implementação)
    // apenas tipo do retorno e nome
    void fazerBarulho();
}
