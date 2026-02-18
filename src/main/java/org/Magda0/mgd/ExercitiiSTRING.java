package org.Magda0.mgd;

public class ExercitiiSTRING {
    public static void main(String []args ) {

        String text = "Ana are 7 mere verzi";
        System.out.println("Lungimea este : " + text.length());

        String cuvant = "catel";
        System.out.println("prima litera: " +cuvant.charAt(0));
        System.out.println("ultima litera: " +cuvant.charAt(cuvant.length() -1));

        String text1 = "Java";
        String text2 = "Python";
        boolean eq = text2.equals(text1);
        System.out.println("textele sunt egale: " +eq);

        System.out.println("contine cuvant: " + text.contains("mere"));


        String noulText = text.replace("mere" , "banane");
        System.out.println("inlocuire spatii: " + noulText);
    }


}
