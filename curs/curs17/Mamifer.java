package curs.curs17;

public class Mamifer extends Animal {

    /**
     * clasa Animal este parintele clasei Mamifer
     */
//    @Override
    void manancaMamifer() {
        System.out.println("Mamiferul mananca...");
    }

    /** eroare daca metoda din clasa parinte este final */
    @Override
    void faceZgomot(){

    }

}
