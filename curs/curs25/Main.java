package curs.curs25;

public class Main {

    public static void main(String[] args) {

        /**Obiect de tip Car */
        Car car1 = new Car();

        /** Clasa anonima=>clasa care extinde(extends) clasa Car */
        Car carAnonim = new Car() {

            public String nume;

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
        System.out.println("---------------------------");

        /**Clasa anonima (1)*/
        CumparaturiInterface cumparaturiInterface1 = new CumparaturiInterface() {
            @Override
            public void cumpara() {
                System.out.println("S-a apelat metoda cumpara()");
            }
        };

        /**Lambda ()->{};
         * Output-ul este identic cu (1)
         * */
        CumparaturiInterface cumparaturiInterface2 = () -> System.out.println("S-a apelat metoda cumpara() prin Lambda");
        cumparaturiInterface1.cumpara();
        cumparaturiInterface2.cumpara();
        System.out.println("---------------------------");

        CumparaturiInterface cumparaturiInterface3 = () -> {
            int numarZile = 3;
            if (numarZile == 3) {
                //code
            }
            System.out.println("S-a apelat metoda cumpara() prin Lambda");
            System.out.println("Text");
        };

//        System.out.print("Ceva");
//        System.out.print("---Ceva");

    }

}
