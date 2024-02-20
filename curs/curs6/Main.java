package curs.curs6;

public class Main {

    public static void main(String[] args) {

        int numarZile = 10;
        int numarZileDinLuna = numarZile * 3;

        int y = 3 + 6 * --numarZile;//int y = 3+6*(numarzile-1)
        int y2 = 3 + 6 * numarZile--;
        int y3 = 3 + 6 * ++numarZile;

        System.out.println(numarZileDinLuna);
        System.out.println(y);
        System.out.println(y2);
        System.out.println(y3);

        //Boolean
        boolean areMasina = true;

        System.out.println(!areMasina);
        System.out.println("##################");

        int numarDeOre = 100;
        System.out.println(--numarDeOre);
        System.out.println(numarDeOre--);
        System.out.println(--numarDeOre);

        /** CTRL+/ pentru comentarii */
//        int numarIntreg=1.23232;

        System.out.println(2 > 3);

        System.out.println(2 < numarDeOre && numarDeOre < 3);
        System.out.println(2 < numarDeOre || numarDeOre < 3);

    }

}
