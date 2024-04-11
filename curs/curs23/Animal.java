package curs.curs23;

public class Animal {

    /**
     * metode
     */
    public <E, T> void alearga(E nume, T varsta) {
        System.out.println("Alearga animalul cu numele: " + nume);
        System.out.println("Are varsta: " + varsta);
    }

    public <wGeneric> boolean vaManca(wGeneric mancare) {
        System.out.println("S-a apelat metoda mananca() cu parametrul: " + mancare);
        return true;
    }

    public <wGeneric> wGeneric mananca(wGeneric mancare) {
        System.out.println("S-a apelat metoda mananca() cu parametrul: " + mancare);
        return mancare;
    }

}
