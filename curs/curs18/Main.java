package curs.curs18;

public class Main {

    public static void main(String[] args) {

        /** nu pot crea obiect cu o interfata */
//        AutoInterface autoInterface=new AutoInterface();
        BicicletaI bicicletaI = new BicicletaI();
        bicicletaI.accelereaza();

        int viteza = BicicletaI.viteza;

    }

}
