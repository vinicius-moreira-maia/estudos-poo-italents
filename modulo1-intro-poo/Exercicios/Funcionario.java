public class Funcionario {
       
    private double salario;
    private String nome;
    private String cargo;

    public Funcionario(String nome, String cargo, double salario){
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    private void setSalario(double aumento) {
        this.salario += aumento;
    }

    public double getSalario() {
        return salario;
    }

    public double getAumento(double porcentagem) {
        double aumento = salario * (porcentagem / 100);
        setSalario(aumento);
        return aumento;
    }


    public static void main(String[] args) {
        Funcionario f = new Funcionario("Zé", "Programador", 4000);
        System.out.println("salario atual:      " + f.getSalario());
        System.out.println("valor do aumento:   " + f.getAumento(20));
        System.out.println("salario ajustado:   " + f.getSalario());
    }
   
}
