package curs.curs12;

public class Main {

    public static void main(String[] args) {

        String denumireFirma = "Curs.Inc";
        denumireFirma = "Altadenumire.Inc";

        StringBuilder denumireContract = new StringBuilder("Contract studii");
        denumireContract.append(" de anul acesta");
        System.out.println(denumireContract);
        denumireContract.append(" " + 1);
        System.out.println(denumireContract);

        System.out.println(denumireContract.indexOf("c"));
        System.out.println(denumireContract.substring(0, 3));
        System.out.println(denumireContract.insert(1, "CUVANT_NOUA"));

        System.out.println(denumireContract);

        System.out.println(denumireContract.deleteCharAt(3));
        System.out.println(denumireContract);

        System.out.println(denumireContract.reverse());

        double sumaContract = 100.22; //Double
        int sumaContractIntreg = 100; //Integer

        System.out.println(sumaContract);

    }

}
