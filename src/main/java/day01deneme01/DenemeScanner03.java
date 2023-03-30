package day01deneme01;

import java.util.Scanner;

public class DenemeScanner03 {
    public static void main(String[] args) {
        //Kullanıcıdan adresini alını ve ekrana yazdırınız.

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen adresinizi giriniz...");

        //nextLine kullanıcıdan cok kelime String almak icin kullanılır.
        String address = input.nextLine();

        System.out.println(address);


    }
}
