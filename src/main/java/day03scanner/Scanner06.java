package day03scanner;

import java.util.Scanner;

public class Scanner06 {
    public static <Scaner> void main(String[] args) {
        //Kullanicidan alacaginiz 5 basamakli
        // bir sayinin ilk iki ve son iki basamagindaki
        // rakamlarin toplamini yazdiran kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("5 basamaklı bir sayı giriniz...");

        int number = input.nextInt();//5 basamakli bir tam sayi oldugu icin "nextInt" kullandik

        //son rakamı al
        int lastDigit = number%10;// herhangi bir sayinin son rakamini almak icin "%"(Modulus Operator) kullaniriz.
                                  // Bir sayisinin son rakamini almak icin 10'a bolun kalana bakin
                                  // tam sayiyi tam sayiya bolerseniz java onu kesinlkle tam sayi verir
                                  //Java ondalik kismi iptal eder.
        number = number/10;       // Sayiyi kucultmek icinde tekrar 10'a "/" boleriz.

        //Sondan ikinci rakamı al
        int lastSecondDigit = number%10;
        number = number/10;

        //Sondan ucuncu rakamı al
        int lastDigir = number%10;
        number = number/10;

        //Sondan dorduncu rakamı al
        int lastFourthDigit = number%10;
        number = number%10;

        //Sondan besinci rakamı al
        int lastFifthDigit = number%10;

        System.out.println(lastDigit + lastSecondDigit + lastFourthDigit + lastFifthDigit);







    }
}
