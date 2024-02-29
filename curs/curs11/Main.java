package curs.curs11;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        /** Am creat un obiect de Floare=am creat o instanta Floare */
        Floare lalea = new Floare(3, "verde");
        int numarul10 = lalea.metodaCareIntoarce10();
        System.out.println(numarul10);

        lalea.numarPetale = 30;

        System.out.println(lalea.numarPetale);

        String variabilaAimal = "LeuL L L L l";
        System.out.println(variabilaAimal.replace("L", "l"));
        variabilaAimal.toUpperCase();

        lalea.setNumarPetale(30);
        System.out.println(lalea.getNumarPetale());

        String varabila2 = variabilaAimal + "String nou";
        String obiectString = "";
        StringBuilder variabilaStringBuilder = new StringBuilder("acolade");

    }

}
