package day03scanner;

import java.util.Scanner;

public class Scanner05Tekrar {
    public static void main(String[] args) {

        //Kullanicidan bir dikdortgenin iki kenar uzunlugunu aliniz
        //i)Alanini hesaplayiniz ==> Kisa kenar * Uzun kenar
        //ii)Cevresini hesaplayiniz ==> 2*Kisa Kenar*UzunKenar

        Scanner input = new Scanner(System.in);


        System.out.println("Lütfen kisa kenari giriniz...");
        double kisaKenar = input.nextDouble();


        System.out.println("Lutfen uzun kenarı giriniz...");
        double uzunKenar = input.nextDouble();
        System.out.println("Alani" + kisaKenar+uzunKenar);

        System.out.println("Cevresi" + 2*(kisaKenar + uzunKenar));





    }
}
