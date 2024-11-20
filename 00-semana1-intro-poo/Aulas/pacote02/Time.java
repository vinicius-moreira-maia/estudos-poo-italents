package pacote02;

public class Time {
    public String nome = "Ceará";
    protected String codinome = "Vozão";
    private String nomeSecreto = "Mais querido";
    
    public Time(){
    }

    public static void main(String[] args) {
        Time time = new Time();
        System.out.println(time.nome);
        System.out.println(time.codinome);
        System.out.println(time.nomeSecreto); // acessível, pois está dentro da classe
    }
}
