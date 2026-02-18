package org.Magda0.mgd;

public class ExercitiiArray {

    public static void main() {
        int []scor = {2, 3, 5, 2, 4, 8, 10, 6};

        for (int i = 0; i < scor.length; i++) {

            System.out.println(scor[i]);
        }

        int suma = 0;
        for (int i = 0; i <= scor.length - 1; i++) {
            suma = suma +scor[i];
        }
        System.out.println("Suma numerelor din sir este: " + suma);


        int valMaxima = scor[0];
        for(int i =0; i < scor.length; i++) {
            if(scor[i] > valMaxima){
                valMaxima = scor[i];
            }
        }
        System.out.println(valMaxima);

        int counter = 0;
        for(int i = 0; i < scor.length; i++) {
            if (scor[i] % 2 == 0) {
                counter++;
                counter = counter +1;
            }
        }
        System.out.println( "Numere " + counter);

        System.out.println("Media nr este: " + suma / (scor.length - 1));
    }

}
