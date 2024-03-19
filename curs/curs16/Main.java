package curs.curs16;

public class Main {

    public static void main(String[] args) {

        /** boolean nu poate fi null */
//        boolean existaMasina = null;
        boolean existaMasinaTrue = true;

        Boolean existaMasinaObiect = null;

        Casa casaNoua = new Casa();
        casaNoua.setNr(10);
        System.out.println(casaNoua.getNr());

        /** static */
        int nrSpecific = Casa.mp;

    }

}
