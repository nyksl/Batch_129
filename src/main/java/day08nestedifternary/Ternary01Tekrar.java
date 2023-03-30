package day08nestedifternary;

import java.util.Scanner;

public class Ternary01Tekrar {
    public static void main(String[] args) {

        //Ex 1: Kullacidan iki sayi aliniz "buyuk olmayan"(kucuk veya esit olan) sayiyi yaziniz.

        Scanner input = new Scanner(System.in);
        System.out.println("İki sayi giriniz...");
        double sayi1 = input.nextDouble();
        double sayi2 = input.nextDouble();

        //1.Yol
        if (sayi1<sayi2 ){
            System.out.println(sayi1);
        }else{
            System.out.println(sayi2);
        }

        //2.Yol Ternary
        double sy = sayi1<sayi2 ? sayi1 : sayi2;
        System.out.println(sy);





















    }
}
