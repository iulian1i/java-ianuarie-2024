package curs.curs7;

public class Main {

    public static void main(String[] args) {
        System.out.println("Start");

//        System.out.println(3 == 3.1);

        /** Creare obiect =>instantiere  */
        Animal animalObiect = new Animal();
        Animal pisica = new Animal();
        Animal caine = new Animal();

        /** Nu se mai creeaza o noua zona de memorie/nu este creat un alt obiect */
        Animal soarece = pisica;

        System.out.println(pisica == soarece);
        System.out.println(caine == soarece);

        int numarMasini = 10;
        if (numarMasini == 10) {
            System.out.println("Ai 10 masini!");
        }
//        else if (numarMasini == 3) {
//            //code
//        }
//        } else {
//            //
//            System.out.println("Nu ai 10 masini!");
//        }

    }

}
