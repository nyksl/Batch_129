package day07ifstatement;

import java.util.Scanner;

public class ifStatement02 {
    public static void main(String[] args) {

        //Ex 2: Kullanıcıdan alınan sayı ın tek mi cıft mi oldugunu yazdıralım.
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir charecter giriniz...");
        int num = input.nextInt();

        //1.Yol
        if (num % 2 == 0) {
            System.out.println("Cift sayı...");
        }

        if (num % 2 != 0) {
            System.out.println("Tek sayı...");
        }
        //2.Yol
        if (num % 2 == 0) {
            System.out.println("Cift sayı...");
        } else {
            System.out.println("Tek sayı...");
        }
    }
}

