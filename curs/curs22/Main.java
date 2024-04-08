package curs.curs22;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        HashMap<Integer, String> hashMapNotaCurs = new HashMap<Integer, String>();
        hashMapNotaCurs.put(10, "Curs1");
        hashMapNotaCurs.put(9, "Curs2");
        hashMapNotaCurs.put(8, "Curs3");
//        hashMapNotaCurs.put(8, "Curs4");

        for (Map.Entry<Integer, String> entry : hashMapNotaCurs.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value :" + entry.getValue());
        }

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(List.of(7, 4, 3, 4, 5, 6, 7));
        /** Sortare */
        Collections.sort(numbers);
        for (Integer number : numbers) {
            //
        }

        numbers.forEach(
                (number) -> {
                    System.out.println(number);
                });

    }

}
