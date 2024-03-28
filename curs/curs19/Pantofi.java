package curs.curs19;

public class Pantofi extends GenericPantofi implements Incaltaminte {

    void metodaPantofi(){
        System.out.println("Metoda din clasa Pantofi");
    }

    @Override
    public boolean areToc(String denumire) {
        if (denumire.contains("de femei")) {
            return true;
        } else {
            return false;
        }
    }

}
