package curs.curs8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Person persoana1 = new Person();
//        persoana1.name = "Alex";
//        persoana1.age = 20;

//        Person persoana2 = new Person();
//        persoana2.name = "Alex2";
//        persoana2.age = 22;


//        System.out.println("Varsta este: " + persoana1.age);
//        if (persoana1.age == persoana2.age) {
//            System.out.println("Varsta este diferita!");
//        }

        Person persoana3 = new Person("Alex", 20);

        System.out.println(persoana3.age);

//        int numarUtilizator=10;
        Scanner scanner = new Scanner(System.in);
        int numarUtilizator = scanner.nextInt();
        System.out.println(numarUtilizator);


    }

}
