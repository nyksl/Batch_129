package day07ifstatement;


import java.util.Scanner;

public class ifStatement02Tekrar {
    public static void main(String[] args) {

        //Ex 2: Kullanıcıdan alınan sayı'nın tek mi cıft mi oldugunu yazdıralım.

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz...");
        int sayi = input.nextInt();

        //1.Yol
//        if(sayi %2 == 0 ){
//            System.out.println("Cift Sayi...");
//        }if(sayi %2 != 0){
//            System.out.println("Tek sayi..");
//        }

        //2.Yol
        if(sayi%2 == 0){
            System.out.println("Cift sayi...");
        }else{
            System.out.println("Tek sayi...");
        }




    }
}
