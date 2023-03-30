package day03scanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ilk isminizi giriniz...");
       String firstName = input.next();

       System.out.println("Soy isminizi giriniz...");
        String lastName = input.next();

       System.out.println(firstName  + " " + lastName);


    }
}
