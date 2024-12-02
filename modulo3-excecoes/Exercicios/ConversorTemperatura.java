// Exercício 2

public class ConversorTemperatura {
    public static void main(String[] args) {
        try {
            double F = converterCelsiusParaFahrenheit(25);

            System.out.println(F);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double converterCelsiusParaFahrenheit(double
    temperaturaCelsius){
        if (temperaturaCelsius < -273.15){
            throw new IllegalArgumentException("A temperatura não pode ser menor que -273.15");
        } else {
            return 9.0/5.0 * temperaturaCelsius + 32;
        }
    }
}
