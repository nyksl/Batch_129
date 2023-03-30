package day05typecastingstringmanipılations;

import java.util.Scanner;

public class StringManipulations03 {

    public static void main(String[] args) {


             /*
    Example 1: Asagıdaki kurallara gore kullanıcının girdigi password'u kontrol ediniz.
    i) en az 8 character olsun
    ii)Space characteri password'de olmasın
    iii)En az bir tane buyuk harf olsun
    iv)En az bir tane kucuk harf olsun
     v)En az bir tane sembol olsun
     vi)En az bir tane rakam olsun
     */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen password giriniz...");
        String pwd = input.nextLine();

        //En az 8 charecter olsun

        boolean first = pwd.length()>7;
        System.out.println(first);

        //ii)Space characteri pasword'de olmasın

        boolean second = !pwd.contains(" ");//cotains bir karakterin olup olmadığına bakar (!) ise olmasın demeketir.
        System.out.println(second);

        //iii)En az bir tane buyuk harf olsun
        //Not: Buyuk harf olmayanları sil sonra
        // kalan charecter sayısına bak
        //character sayısı sıfır ise buyuk harf yok demektir.
        //sıfırdan buyuk ise buyuk harf var demektir.

        boolean third =  pwd.replaceAll("[^A-Z,]","").length()>0;

        //En az bir tane kucuk harf olsun
        boolean fourth = pwd.replaceAll("[^a-z]", "").length()>0;

        //En az bir tane sembol ve rakam harici her sey olsun
        boolean fifth = pwd.replaceAll("[a-zA-Z0-9]", "").length()>0;

        //En az bir tane rakam olsun
        boolean sixth = pwd.replaceAll("[^0-9]", "").length()>0;


        System.out.println("Pasword gecerli mi" + (third && fourth && fifth && sixth));//&& yazmamızın sebebi bir
                                                                                // tanesi yanlıs olsa bize false verecek
    }
}
