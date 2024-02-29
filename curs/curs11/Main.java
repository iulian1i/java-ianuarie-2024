package curs.curs11;

public class Main {

    public static void main(String[] args) {

        /** Am creat un obiect de Floare=am creat o instanta Floare */
        Floare lalea = new Floare(3, "verde");
        int numarul10 = lalea.metodaCareIntoarce10();
        System.out.println(numarul10);
    }

}
