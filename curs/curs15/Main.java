package curs.curs15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> numeMasini = new ArrayList<>();
        numeMasini.add("Masina1");
        numeMasini.add("Masina2");
        numeMasini.add("Masina3");

        for (String numeMasina : numeMasini) {
            System.out.println(numeMasina);
        }

        System.out.println(numeMasini.get(1));

        System.out.println("Lungimea ArrayList este: " + numeMasini.size());

        System.out.println("ArrayList NU este gol?: " + !numeMasini.isEmpty());

        /** Stergem elementul */
        numeMasini.remove("Masina1");

        /** Stergere elemente */
        numeMasini.clear();
        for (String numeMasina : numeMasini) {
            System.out.println(numeMasina);
        }

        System.out.println("Contine este element? :" + numeMasini.contains("Masina1"));

        int[] arrayNumere = {1, 2, 3};
        System.out.println(arrayNumere.toString());
        System.out.println(numeMasini);

        System.out.println(Arrays.toString(arrayNumere));


        /**Shopping cart */
        List<Product> cart = new ArrayList<>();
        Product produsNou = new Product("ciocolata", 15);
        cart.add(produsNou);


//        for (Product produs : cart) {
        cart.remove(produsNou);
//        }
        System.out.println("Am sters produsul?" + cart.isEmpty());

        /** Primire denumire produs de la utilizator */
//        Scanner numeProdus = new Scanner(System.in);
//        System.out.println(numeProdus.next());

        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).name.equals("NumeProdusDeSters")) {
                cart.remove(i);
                break;
            }
        }


        /** Un nou cos de cumparaturi:*/
        List<Product> cartP = new ArrayList<>();
        Product produsNouP = new Product("ciocolata", 15);
        cartP.add(produsNou);
        cartP.add(produsNou);
        cartP.add(produsNou);
        cartP.add(produsNou);
        cartP.add(produsNou);

        /** Total price*/
        double sumaPret = 0;
        for (int i = 0; i < cartP.size(); i++) {
            sumaPret = sumaPret + cartP.get(i).price;
        }
        System.out.println("Pretul total al cosuluiP este: " + sumaPret);

        double sumaPretForAdv = 0;
        for (Product product : cartP) {
            sumaPretForAdv = sumaPretForAdv + product.price;
        }
        System.out.println("Pretul total al cosului este: " + sumaPretForAdv);


    }

}
