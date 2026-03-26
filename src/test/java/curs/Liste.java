package curs;

import java.util.ArrayList;
import java.util.List;

public class Liste {

    public static void main(String[] args) {
        //crearea unei liste 1
        List<String> listaString = new ArrayList<>();

        //crearea unei liste 2
        List<Integer> listaInteger = List.of(1, 2, 23, 543);

        //afisarea listei 1
        System.out.println("afisearea listei - 1");
        System.out.println(listaString);
        System.out.println(listaInteger);

        //afisarea liste 2
        for (int i = 0; i < listaInteger.size(); i++) {
            System.out.println(listaInteger.get(i));
        }

        //afisarea listei 3
        for (Integer item : listaInteger) {
            System.out.println(item);
        }
        //operatii de baza
        List<String> fructe = new ArrayList<>();

        //adaugare elemente
        fructe.add("apple");
        fructe.add("banana");
        fructe.add("orange");

        fructe.add(1, "kiwi");
        System.out.println("fructe");

        //afisarea unui anumit element din lista
        String item = fructe.get(2);
        System.out.println(item);

        //modificarea unui element din lista
        fructe.set(3, "orange");
        System.out.println(fructe);

        //stergerea unui element lista
        fructe.remove("kiwi");
        System.out.println(fructe);

        fructe.remove(1);
        System.out.println(fructe);

        //dimensiunea unei liste
        fructe.size();
        int dimListei = fructe.size();
        System.out.println(dimListei);
    }
}



