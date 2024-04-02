package curs.curs20;

public class Contract {

    String id;
    String denumire;
    StareContractEnum stare;

    Contract(String id, String denumire, StareContractEnum stare) {
        this.id = id;
        this.denumire = denumire;
        this.stare = stare;
    }

}
