package curs.curs24;

public class Main {

    public static void main(String[] args) {

        System.out.println(StareCosCumparaturi.ARE_PRODUSE.getStareNume());
        System.out.println(StareCosCumparaturi.ARE_PRODUSE);

        new CumparaturiInterface() {
            @Override
            public void cumpara() {
                System.out.println("Cumpara");
            }

        };

        Car car = new Car() {

            @Override
            public void functioneaza() {
                //code
                System.out.println("Un obiect cu metoda functioneaza() modificata");
            }
        };

        car.functioneaza();


        /**Continuat in curs 25 */
//        /**Lambda expression */
//        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
//        names.sort((s1, s2) -> s1.compareTo(s2));
//        System.out.println(names); // Output: [Alice, Bob, Charlie]
//
//
//        /**Anonymous class */
//        List<String> names2 = Arrays.asList("Alice", "Bob", "Charlie");
//        names2.sort(new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                return s1.compareTo(s2);
//            }
//        });
//        System.out.println(names2); // Output: [Alice, Bob, Charlie]
//

    }

}
