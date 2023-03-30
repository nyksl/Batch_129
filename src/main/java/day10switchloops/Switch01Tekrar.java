package day10switchloops;

import javax.swing.*;
import java.util.Scanner;

public class Switch01Tekrar {
    public static void main(String[] args) {

        //Ex 1: Ay numarasini soyleyince numarısı verilen ay'dan baslayıp 12.'inci ay'a kadar tum aylarin isimlerini
        //yazdiran kodlari yazdirin.
        //   8 ==> August  September - Octomber - November - December

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir ay numarasi giriniz...");
        int ay = input.nextInt();

        switch (ay){
            case 1:
                System.out.println("Ocak");
            case  2:
                System.out.println("Subat");
            case 3:
                System.out.println("Mart");
            case 4:
                System.out.println("Nisan");
            case 5:
                System.out.println("Mayis");
            case 6:
                System.out.println("Haziran");
            case 7:
                System.out.println("Temmuz");
            case 8:
                System.out.println("Agustos");
            case 9:
                System.out.println("Eylul");
            case 10:
                System.out.println("Ekim");
            case 11:
                System.out.println("Kasim");
            case 12:
                System.out.println("Aralik");
                break;
            default:
                System.out.println("Gercerli bir rakam giriniz");



        }








    }
}
