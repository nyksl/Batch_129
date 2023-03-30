package day01deneme01;

import java.util.Scanner;

public class SoruCozum {
    public static void main(String[] args) {



        /*
         * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
         * return eden metod yaziniz
         *
         * ornek:  input            output
         *         elma  2           eaea
         *         army  3           ayayay
         */
        Scanner input1 = new Scanner(System.in);
        System.out.println("Lütfen kelime");
        String Word = input1.nextLine();


        Scanner input2 = new Scanner(System.in);
        System.out.println("sayi giriniz");
        int repeat = input2.nextInt();


        char firstwr = Word.charAt(0);
        char lastwr = Word.charAt(Word.length() - 1);

        for (int i = 1; i <= repeat; i++) {

            System.out.print(firstwr);
            System.out.print(lastwr);














       /*
    Ask user enter a positive number and check if it is prime or not
    Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
     */
            /*
             * Kullanicidan bir cumle ve bir harf alin,
             * Cumlede harfin kac kere
             * kullanildigini bulup, yazdirin
             *
             * ORNEK:
             *
             * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
             *
             * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
             */





          /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     0-1-1-2-3-5-8-13-21-34....
     */
        }
    }
}