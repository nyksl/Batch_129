package day05typecastingstringmanipılations;

import java.util.Scanner;

public class StringManipulations03Tekrar {
    public static void main(String[] args) {
          /*
            Example 1: Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.
                        i)En az 8 character olsun
                        ii)Space characteri password'de olmasin
                        iii)En az bir tane buyuk harf olsun
                        iv)En az bir tane kucuk harf olsun
                        v)En az bir tane sembol olsun
           */
       Scanner input = new Scanner(System.in);
        System.out.println("Lütfen pasword giriniz...");
        String pwd = input.nextLine();

        boolean ilk = pwd.length()>7;

        boolean ikinci = !pwd.contains(" ");

        boolean uc = pwd.replaceAll("[^A-Z]", "").length()>0;

        boolean dort = pwd.replaceAll("[^a-z]", "").length()>0;

        boolean bes = pwd.replaceAll("[a-zA-Z0-9]", "").length()>0;

        System.out.println("Pasword gecerli mi?"+ (ilk && ikinci && uc && dort & bes));




    }
}
