package day01deneme01;

import java.util.Scanner;

public class DemeneScanner02 {
    public static void main(String[] args) {
        //kullanıcıdan ilk ismini ve soy ismini alıp ikisni aynı satırda yazdıralım.
        Scanner input = new Scanner(System.in);

        System.out.println("İlk isminizi giriniz...");
        String firstname = input.next();
        //Kullanıcıdan tek kelimeleri almak icin next() method kullanıcıdan String almak icin kullanılır

        System.out.println("Soy isminizi giriniz");
        String lastname = input.next();

        System.out.println(firstname +" "+ lastname);
        //isimlerin arasına bosluk koymak icin (" ") koyulur.
    }
}
