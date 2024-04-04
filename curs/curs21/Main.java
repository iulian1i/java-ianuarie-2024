package curs.curs21;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> curs = new ArrayList<>();
        curs.add("Curs1");
        curs.get(0);

        HashMap<Integer, String> hashMapNotaCurs = new HashMap<Integer, String>();
        hashMapNotaCurs.put(10, "Curs1");
        hashMapNotaCurs.put(9, "Curs2");
        hashMapNotaCurs.put(8, "Curs3");
        hashMapNotaCurs.put(8, "Curs4");

        System.out.println(hashMapNotaCurs.get(8));
        System.out.println("______________");

        for(Integer nota: hashMapNotaCurs.keySet()){

            System.out.println(hashMapNotaCurs.get(nota));
        }

    }
}
