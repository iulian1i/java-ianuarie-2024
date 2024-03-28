package curs.curs19;

public class ClasaSecundara extends ClasaPrincipala {

    /**
     * overloading
     */
    int metodaClasei() {
        System.out.println("Metoda din ClasaSecundara");
        return 10;
    }

    /**
     * overriding
     */
    @Override
    int metodaClasei(String a) {
        System.out.println("Metoda din ClasaSecundara" + a);
        return 10;
    }

}
