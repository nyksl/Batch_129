package day07ifstatement;

import java.util.Scanner;

public class ifStatement03Tekrar {
    public static void main(String[] args) {

        //Ex 3: Verilen bir sayının pozitif, negatif veya notr oldugunu kontrol eden kodu yazdırınız.

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz...");
        int num= input.nextInt();

        if(num>0){
            System.out.println("Pozitif...");
        }else if(num<0){
            System.out.println("Negatif...");
        }else{
            System.out.println("Notr...");
        }
    }
}
