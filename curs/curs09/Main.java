package curs.curs09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String variabilaTest = "ceva";

        for (int index = 0; index < 10; index++) {

//            System.out.println(index);

        }

//        int numarCursuri = 9;
//        switch (numarCursuri) {
//            case 3:
//                System.out.println("Este pe cazul 3");
//                break;
//            case 9:
//                System.out.println("Este pe cazul 9");
//                break;
//            case 10:
//                System.out.println("Este pe cazul 10!");
//                break;
//            default:
//                System.out.println("Nici un caz nu este adevarat");
//
//        }

        int numarZileDeVacanta = 10;
        while (numarZileDeVacanta < 20) {
//            System.out.println(numarZileDeVacanta);
            numarZileDeVacanta++;
        }

        int doVariabila = 100;
        do {
//            System.out.println(doVariabila);
            doVariabila++;
        } while (doVariabila < 99);

        //-Develop a program that uses a for loop to count the number of even and odd numbers in a range from 1 to n,
        // where n is input by the user. Print the counts.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int numerePare = 0;
        int numereImpare = 0;
        for (int index = 1; index <= n; index++) {
            /**Numpar par*/
            if (index % 2 == 0) {
                System.out.println("Numar par: " + index);
                /**Numar impar */
                numerePare++;
            } else {
                System.out.println("Numar impar: " + index);
                numereImpare++;
            }
        }
        System.out.println("Numarul total de numere pare: " + numerePare);
        System.out.println("Numarul total de numere impare: " + numereImpare);

//        for (int index = 1; index <= n; index++) {
//
//        }


    }
}
