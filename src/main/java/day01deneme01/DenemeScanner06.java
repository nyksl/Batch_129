package day01deneme01;

import java.util.Scanner;

public class DenemeScanner06 {
    public static void main(String[] args) {
        //Kullanıcıdan aldıgınız 5 basamaklı
        //bir sayının ilk iki ve son ilk basamagındaki
        //rakamların toplamını yazdırın.
        //Bir sayının son rakamını alabilmek icin o sayıyı 10'a bolun kalana bakın

        Scanner input = new Scanner(System.in);

        System.out.println("5 basamaklı bir sayı giriniz...");
        //Son rakamı al
        int number = input.nextInt();
        int lastDigit = number%10;

        System.out.println(lastDigit);

        //Sayıyı kucult
        number = number/10;
        System.out.println(number);
    }
}
