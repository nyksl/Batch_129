package day03scanner;

import java.util.Scanner;

public class Scanner06Tekrar {
    public static void main(String[] args) {
        //Bes basamaklı bir sayinin ilk iki ve son iki basamagındaki rakamların toplamını yazdırın.
        Scanner input = new Scanner(System.in);

        System.out.println("5 basamaklı bir sayı giriniz");

        int numara = input.nextInt();

        int sonRakam = numara%10;
        numara = numara/10;

        int sonDorduncuRakam = numara%10;
        numara= numara/10;

        int sonUcuncuRakam = numara%10;
        numara = numara/10;

        int sonikinciRakam= numara%10;
        numara = numara/10;

        int sonBesinciRakam = numara%10;
        numara = numara/10;

        System.out.println(sonRakam + sonDorduncuRakam + sonikinciRakam + sonBesinciRakam );


    }
}
