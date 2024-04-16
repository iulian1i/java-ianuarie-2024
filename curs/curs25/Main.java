package curs.curs25;

public class Main {

    public static void main(String[] args) {

        /**Obiect de tip Car */
        Car car1 = new Car();

        /** Clasa anonima=>clasa care extinde(extends) clasa Car */
        Car carAnonim = new Car() {

            String nume;

            @Override
            public void metodaDinClasaAnonima() {
                System.out.println("Am apelat metodaDinClasaAnonima()");
            }

            @Override
            public void functioneaza() {
                System.out.println("Functioneaza bine in clasa anonima");
            }
        };

        carAnonim.functioneaza();
        carAnonim.metodaDinClasaAnonima();

        /**Clasa anonima */
        CumparaturiInterface cumparaturiInterface1 = new CumparaturiInterface() {
            @Override
            public void cumpara() {
                System.out.println("S-a apelat metoda cumpara()");
            }
        };






    }

}
