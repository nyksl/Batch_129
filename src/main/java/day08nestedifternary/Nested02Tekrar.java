package day08nestedifternary;

import java.util.Scanner;

public class Nested02Tekrar {
    public static void main(String[] args) {


         /*Kullanicidan bir ucgenin kenar uzunlugunu aliniz
        Uc kenari birbirine esit ise "Eskenar Ucgen " yazdiriniz
        Sadece iki kenar uzunlugu biribirine esit ise "Ikizkenar ucgen"
        Tum kenarlari birbirinden farkli ise "Cesitkenar Ucgen" yazdiriniz

        a+b>c>a-b
        a+c>b>a-c
        b+c>a>b-c
        a=b=c ise eskenar ucgen
        */


        Scanner input = new Scanner(System.in);
        System.out.println("Ucgenin kenarlari icin 3 tane uzunluk giriniz...");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        boolean ucgenmi = (a + b > c && c > Math.abs(a - b) && a + c > b && b > Math.abs(a - c) && b + c > a && a > Math.abs(b - c));

        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Gecersiz kenar uzunlugu");


        } else if (ucgenmi) {


            if (a == b && b == c && a == c) {
                System.out.println("Eskenar");

            } else if (a == b || b == c || a == c) {
                System.out.println("İkiz kenar");

            } else {
                System.out.println("Cesit kenar");
            }
        } else {
            System.out.println("Ucgen degil");
        }


    }
}
