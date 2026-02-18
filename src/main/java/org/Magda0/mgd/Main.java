package org.Magda0.mgd;

public class Main {
    public static void main(String[] args) {
        System.out.println("Buna ziua");
        System.out.println("Azi Este Duminica");
        System.out.println("Sunt 7 grade");
        System.out.println("Copii au vacanta");
        System.out.println("Magda , 1995");

        String name = "Magda";
        int age = 30;
        String NumeDeFamilie = "Boboc";
        int NrMembri = 3;
        boolean areAnimal = true;
        int nrAnimale = 1;
        boolean esteSingurLaParinti = true;

        System.out.println(name);
        System.out.println(age);
        System.out.println(NumeDeFamilie);
        System.out.println(NrMembri);
        System.out.println(areAnimal);
        System.out.println(nrAnimale);
        System.out.println(esteSingurLaParinti);

        int varstaPeste5Ani = age + 5;
        System.out.println("Varsta peste 5 ani: " + varstaPeste5Ani);
        int totalFamilieSiAnimale = NrMembri + nrAnimale;
        System.out.println(totalFamilieSiAnimale);

        System.out.println("Ma numesc " + name + " , am " + age + " ani, am " + nrAnimale + " animal ");
        int a = 10;
        int b = 11;

        if (a % 2 == 0) {
            System.out.println("par");
        } else {
            System.out.println("impar");
        }

        if (a > b) {
            System.out.println("Valoarea mai mare este: " + a);
        } else {
            System.out.println("Valoarea mai mare este: " + b);
        }

        System.out.println("b este intre 11 si 15? " + (b >= 11 && b <= 15));
        int nota = 8;
        if (nota >= 5) {
            System.out.println("Admis");
        } else {
            System.out.println("Respins");
        }
        int produs1 = 120;
        if (produs1 > 100) {
            double disc10 = produs1 * 0.10;
            double discountedP = produs1 - disc10;
            System.out.println(discountedP);
        }
    }
}




