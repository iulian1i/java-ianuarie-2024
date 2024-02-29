package curs.curs11;

public class Floare {
    /**
     * Proprietati
     */
    int numarPetale;
    String culoare;
    String miros;
    boolean areGhivechi;

    /**
     * Constructor
     */
    Floare() {
        this.miros = "de trandafir";
    }

    Floare(int numarPetaleParam, String culoareParam) {

        this.numarPetale = numarPetaleParam;
        this.culoare = culoareParam;
        System.out.println("Am apelat constructorul cu 2 parametri");
    }

    Floare(int numarPetaleParam) {
        this.numarPetale = numarPetaleParam;
    }

    /**
     * Metode/comportament
     */
    int metodaCareIntoarce10() {
        return 10;
    }

    String metodaCareIntoarceString() {
        return "Returnez String";
    }

    void metodaCareNuReturneazaNimic() {
        System.out.println("Metoda nu returneaza nimic");
    }

    /**
     * Getter & Setter
     */
    int getNumarPetale() {
        return numarPetale;
    }

    void setNumarPetale(int numarPetaleParametru) {
        this.numarPetale = numarPetaleParametru;
    }

//    int setAreGhivechi(){
//        return 100;
//    }




    /** */


}
