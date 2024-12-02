import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Exercício 5

public class ArquivoNaoEncontrado {
    public static void main(String[] args) {
        try {
            lerArquivo("arquivo_teste.txt"); 
        } catch (FileNotFoundException e) {
            System.out.println("arquivo não foi encontrado.");
        }
    }

    // o método pode levantar a exceção, portanto precisa haver tratamento em "quem" for chamar
    public static void lerArquivo(String nomeArquivo) throws FileNotFoundException {
        File arquivo = new File(nomeArquivo);
        Scanner scanner = new Scanner(arquivo);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}
