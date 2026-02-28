package tema1;

public class Tema1Magda {

    public static void main(String[] args) {
        studentVarstaInaltime();
        sumaMedia();
        verificareVarsta();
        sumaNumerelor();
        afisareaNumerelor();
        invatJava();
        System.out.println(produsulADouaNr(5, 5));
        System.out.println(sumaNrPare());
        System.out.println(mediaA3Numere(13,17,43));
        startSiEnd(6,46);

    }

    private static void studentVarstaInaltime() {
        int age = 18;
        double inaltime = 1.65;
        boolean estePrezent = true;
        System.out.println("Studentul are: " + age + " ani");
        System.out.println("Inaltimea studentului este de: " + inaltime + " metri.");
        System.out.println("Studentul este prezent la curs?: " + estePrezent);
    }

    private static void sumaMedia() {

        int a = 17;
        int b = 23;
        double c = 23.4;
        int suma = a + b;
        double media = (a + b + c) / 3;
        System.out.println("Suma celor doua numere int este: " + suma);
        System.out.println("Media este: " + media);
    }

    private static void verificareVarsta() {

        int age = 17;
        if (age >= 18) {
            System.out.println("Acces permis");
        }else {
            System.out.println("Acces interzis");
        }
    }

    private static void sumaNumerelor() {
        int suma = 0;
        for (int i = 20; i <=50; i++) {
            suma += i;
        }
        System.out.println("Suma numerelor de la 20 la 50 este: " + suma);
    }

    private static void afisareaNumerelor() {
        int suma = 10;
        while ( suma >= 1) {
            System.out.print(suma + " ");
            suma--;
        }
        System.out.println();
    }

    private static void invatJava() {
        System.out.println("Invat Java");
    }

    private static int produsulADouaNr(int a , int b) {
        return a * b;
    }

    private static int sumaNrPare() {
        int suma = 0;
        for (int i = 1; i <= 50 ; i++) {
            if (i % 2 ==0) {
                suma += i;
            }
        }
        return suma;
    }

    private static double mediaA3Numere(int a , int b, int c) {
        return (a + b + c) / 3.0;
    }

    private static void startSiEnd(int start , int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");

        }
    }
}



