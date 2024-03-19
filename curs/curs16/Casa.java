package curs.curs16;

public class Casa {

    /**
     * private->am acces doar in interiorul clasei
     */
    private int nr;
    String strada;
    String oras;
    String judet;

    /**
     * constructor->se apeleaza la crearea obiectelor
     */
//    Casa() {
//        System.out.println("S-a apelat constructorul!");
//    }

    /**constructor default */
//    Casa(){}

    /**
     * le accesam prin denumirea clasei
     */
    static int mp = 100;

    /**
     * getter
     */
    public int getNr() {
        return this.nr;
    }

    /**
     * setter
     */
    public void setNr(int nr) {
        this.nr = nr;
    }

    public int calculeazaCodPostal(int valoareData) {

        int valoarePrimita = valoareData;
        int codPostal = valoarePrimita * this.nr;
        return codPostal;
    }


}
