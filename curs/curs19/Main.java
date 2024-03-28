package curs.curs19;

public class Main {
    public static void main(String[] args) {

        ClasaPrincipala clasaSecundara = new ClasaSecundara();

        Incaltaminte incaltaminte = new Pantofi();
        boolean areToc = incaltaminte.areToc("Pantofi Sport de femei");
        System.out.println("Are toc?" + areToc);

        Pantofi pantofi = new Pantofi();
        GenericPantofi genericPantofi = new GenericPantofi();

        /** polymorphism */
        GenericPantofi newGenericPantofi = new Pantofi();

        Pantofi pantofiCast = (Pantofi) new GenericPantofi();
    }
}
