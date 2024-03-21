package curs.curs17;

public abstract class Auto {

    String nume;
    String model;

    public void franeaza() {
        System.out.println("Autovehiculul franeaza...");
    }

    public abstract void accelereaza();

}
