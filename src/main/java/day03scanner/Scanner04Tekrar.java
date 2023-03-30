package day03scanner;

import java.util.Scanner;

public class Scanner04Tekrar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yaziniz

        System.out.println("Lutfen iki sayi giriniz...");


        Double sayi1 = input.nextDouble();
        Double sayi2 = input.nextDouble();


        System.out.println(sayi1 + sayi2);
        System.out.println(sayi1 - sayi2);
        System.out.println(sayi1 / sayi2);
        System.out.println(sayi1 * sayi2);

    }
}
