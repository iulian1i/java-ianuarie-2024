package curs.curs23;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        /** fara primite in lista */
//        List<int> nume = List.of("Nume1", "Nume2");
        List<String> nume = List.of("Nume1", "Nume2");

        Animal animal1 = new Animal();

        animal1.mananca("Iarba");
        animal1.mananca(1);
        animal1.mananca(true);
//        animal1.mananca();



    }

}
