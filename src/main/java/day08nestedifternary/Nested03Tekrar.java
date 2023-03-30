package day08nestedifternary;

import java.util.Scanner;

public class Nested03Tekrar {
    public static void main(String[] args) {
         /*
                    Password'un ilk harfi buyuk harf
                    'A' olursa "gecerli password" yazdirin degilse "gecersiz password" yazdirin
                    Alemci ==> Gecerli

                    Passwordun ilk harfi kucuk harf ise
                    'z' olursa "gecerli password" yazdirin degilse "gecersiz password" yazdirin
                    zehirli ==> Gecerli
         */
      Scanner input = new Scanner(System.in);
        System.out.println("Pasword giriniz...");
      String pwd = input.nextLine();

      if(pwd.charAt(0)>='A' && pwd.charAt(0)<='Z'){
          if (pwd.charAt(0)=='A'){
              System.out.println("Gecerli pasword");

          } else{
              System.out.println("Gecersiz cunku buyuk harf 'A' degil");

          }

          }else if (pwd.charAt(0)>='a' && pwd.charAt(0)<='z'){
          if (pwd.charAt(0)=='z'){
              System.out.println("Gecerli pasword");
          }else {
              System.out.println("Gecersiz pasword cunku kucuk harf 'z' degil");
          }

      }else {
          System.out.println("İlk karakter harf olmalı");
      }












    }
}
