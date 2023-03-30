package day01deneme01;

import java.util.Scanner;

public class DenemeScanner04 {
    public static void main(String[] args) {
        //Kullanıcıdn iki sayı alıp 4 islem yapan ve islemlerin sonuclarını ekrana yazdıran kodu yazınız.
        Scanner input = new Scanner(System.in);
        System.out.println("İki sayı giriniz...");

        double firstNumber = input.nextDouble();
        double secondNumber = input.nextDouble();
        System.out.println(firstNumber + secondNumber);
        System.out.println(firstNumber - secondNumber);
        System.out.println(firstNumber * secondNumber);
        System.out.println(firstNumber / secondNumber);


    }
}
