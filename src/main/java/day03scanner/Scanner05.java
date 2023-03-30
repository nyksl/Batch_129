package day03scanner;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {

        //Kullanicidan bir dikdortgenin iki kenar uzunlugunu aliniz
        //i)Alanini hesaplayiniz ==> Kisa kenar * Uzun kenar
        //ii)Cevresini hesaplayiniz ==> 2*Kisa Kenar*UzunKenar

     Scanner input = new Scanner(System.in);
     System.out.println("Dikdörtgenin kisa kenar uzunluunu giriniz...");
     float shortSide = input.nextFloat();

     System.out.println("Dikdörtgenin uzun kenar uzunluğunu giriniz...");
     float longSide = input.nextFloat();
     System.out.println("Alan =" + shortSide * longSide);

        System.out.println("Cevre = " + 2*shortSide + 2*longSide);
    }
}
