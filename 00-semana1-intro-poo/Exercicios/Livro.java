public class Livro {
    private String titulo;
    private String autor;
    private int nPaginas;

    public Livro(String titulo, String autor, int nPaginas){
        this.autor = autor;
        this.titulo = titulo;
        this.nPaginas = nPaginas;
    }

    @Override
    public String toString() {
        return "Título:            " + this.titulo + "\n"
             + "Autor:             " + this.autor + "\n"
             + "Número de páginas: " + nPaginas;
    }
    public static void main(String[] args) {
        Livro livro = new Livro("Harry Potter", "J.K. Rowling", 452);
        System.out.println(livro);
    }
}
