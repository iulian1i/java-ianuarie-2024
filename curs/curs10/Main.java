package curs.curs10;

public class Main {

    public static void main(String[] args) {

        /** exemplu break */
//        DENUMIRE_FOR:
//        for (int i = 0; i <= 10; i++) {
//            System.out.println(i);
//            /** PAR */
//            if (i % 2 == 0) {
//                System.out.println("Am gasit numar par: " + i);
//                break;
//            }
//        }

//        /** exemplu continue */
//        for (int i = 0; i <= 10; i++) {
//            System.out.println(i);
//            /** PAR */
//            if (i % 2 == 0) {
//                System.out.println("Am gasit numar par: " + i);
//                continue;
//            }
//            /** nu mai ajunge aici dupa continue */
//            System.out.println("Am trecut de continue");
//        }

        String variabilaCeva = "ceva";
//        System.out.println(variabilaCeva.length());
//
//        System.out.println(1 + 2 + 3);
//        System.out.println(1 + 2 + "ab");
//        System.out.println("ab" + 1 + 2 + "2");

        String denumireCurs = "Curs java!";
        String denumireCurs2 = new String("Curs java");

        System.out.println(denumireCurs2.toUpperCase());

    }

}
