package curs.curs24;

public enum StareCosCumparaturi {
    GOL("Nu are produse"),
    PENDING("În curs de actualizare"),
    ARE_PRODUSE("Există produse în coș"),
    PLATIT("Plătit");

    private final String stareNume;

    String getStareNume() {
        return stareNume;
    }

    StareCosCumparaturi(String stareNume) {
        this.stareNume = stareNume;
    }

}
