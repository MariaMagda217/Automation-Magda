package Tema7;

//3. Creează clasa Temperature:
//Atribute:
// • celsius
//Metode:
//•	toFahrenheit() → returnează conversia
//•	toKelvin() → returnează conversia
//Formule:
// • F = C * 9/5 + 32
//•	K = C + 273.15
//În main:
// • creează obiect și afișează valorile


public class Temperature {
    private final double celsius;

    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    public static void main(String[] args) {
        Temperature t = new Temperature(25);
        System.out.println("Celsius: " + 25);
        System.out.println("Fahrenheit: " + t.toFahrenheit());
        System.out.println("kelvin: " + t.toKelvin());
    }

    public double toFahrenheit() {
        return celsius * 9.0 / 5.0 + 32;
    }

    public double toKelvin() {
        return celsius + 273.15;
    }
}
