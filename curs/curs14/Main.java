package curs.curs14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        String[] listaDeFructe = {"Mar", "Para", "Banana"};

        Arrays.sort(listaDeFructe);
        for (String fruct : listaDeFructe) {
            System.out.println(fruct);
        }
        System.out.println("Mai sus am sortarea pentru listaDeFructe");

        /** Nu copiem array-ul mai jos!*/
        String[] listaDeFructeTryCopy = listaDeFructe;
        Arrays.sort(listaDeFructeTryCopy, Comparator.reverseOrder());
        for (String fruct : listaDeFructe) {
            System.out.println(fruct);
        }
        System.out.println(listaDeFructe);

        /** Static */
        Contract contract = new Contract();
        Contract.metodaContract();

        String variabilaNumar = String.valueOf(3);
        System.out.println(Contract.numarDePagini);
//        Contract.numarDePagini;
//        contract.numarDePagini;

        ArrayList arrayList1 = new ArrayList();

    }

}
