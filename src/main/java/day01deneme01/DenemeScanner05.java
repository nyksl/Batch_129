package day01deneme01;

import java.util.Scanner;

public class DenemeScanner05 {
    public static void main(String[] args) {
        //Kullanıcıdan bir dikdörtgenin iki kenar uzunlugunu alınız
        //i) alanını hesaplayınız ==> kısa kenar * uzun kenar
        //ii)cevresini hesaplayınız ==>2*kısa kenar + 2*uzun kenar

        Scanner input = new Scanner(System.in);

        System.out.println("Dikdörtgenin kısa kenarını giriniz...");
       float shortSide = input.nextFloat();

        System.out.println("Dikdörtgenin uzun kenar uzunlugunu giriniz");
        float longSide = input.nextFloat();

        System.out.println("Alan=" +(shortSide * longSide));
        System.out.println("Cevre=" +(2*shortSide + 2*longSide));
    }
}
