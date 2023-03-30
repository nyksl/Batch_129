package day10switchloops;

import java.util.Scanner;

public class Switch02Tekrar {
    public static void main(String[] args) {

        //Example 1: Kullanicidan iki sayi ve yapilacak islemi alan ve +,-,*,/,% islemlerini yapan kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen iki rakam giriniz...");
        double r1 = input.nextDouble();
        double r2 = input.nextDouble();

        System.out.println("Yapilacak islemleri giriniz..+,-,*,/,% islem'den birini giriniz ");

        char ch = input.next().charAt(0);

        switch (ch){

            case '+':
                System.out.println(r1 + "+" + r2 +"="+(r1+r2));
                break;

            case '-':
                System.out.println(r1 + "-" + r2 +"="+(r1-r2));
                break;

            case '*':
                System.out.println(r1 + "*" + r2 +"="+(r1*r2));
                break;

            case '/':
                System.out.println(r1 + "/" + r2 +"="+(r1/r2));
                break;

            case '%':
                System.out.println(r1 + "%" + r2 +"="+(r1*r2/100));
                break;
            default:
                System.out.println("Bu islem tenimlanmamistir...");

        }







    }
}
