public class Carro {
    private Integer ano;
    private String modelo;

    // Polimorfismo de Sobrecarga nos construtores!
    public Carro(){
        ano = 1970;
        modelo = "Aqueles carro de Chevete";
    }

    public Carro(Integer ano, String modelo){
        this.ano = ano;
        this.modelo = modelo;
    }

    // getters e setters públicos para acessar e alterar atributos privados
    public Integer getAno() {
        return ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Polimorfismo de sobrescrita, toString() está definido na classe 'Object', a classe "suprema" do Java
    @Override
    public String toString() {
        return "Ano: " + this.getAno() + " - " + "Modelo: " + this.getModelo();
    }

    /*
     -> Métodos da classe 'Object'
     toString() method
     hashCode() method
     equals(Object obj) method
     finalize() method
     getClass() method
     clone() method
     wait(), notify() notifyAll()
     */

}
