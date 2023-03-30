package day07ifstatement;

import java.util.Scanner;

public class ifStatement01 {
    public static void main(String[] args) {

        //Ex 1: Verilen charecter buyuk harf ise ekrana     Buyk Harf yazdıran kodu olusturunuz.
        //      Kucuk harf ise kucuk harf yazdıran kodu yazınız.
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir charecter giriniz...");
        char ch = input.next().charAt(0);

        //1.Yol

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Buyuk Harf...");
        }
        if (ch > 'a' && ch <= 'z') {
            System.out.println("Kucuk harf");
        }

        //2.Yol

        if(ch >= 'A' && ch <= 'Z') {
            System.out.println("Buyuk Harf...");
        } else if(ch>'a' && ch<='z' ){
            System.out.println("Kucuk harf");
        }else {
            System.out.println("Harf degil");
        }
    }

    }


