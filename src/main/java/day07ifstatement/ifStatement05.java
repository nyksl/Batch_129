package day07ifstatement;

import java.util.Scanner;

public class ifStatement05 {
    public static void main(String[] args) {


        //EX 1: Ay isimleri girilince kacıncı ay oldugunu yazan kodu yazınız.
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ay giriniz...");
        String montName = input.next();

        if (montName.equalsIgnoreCase("January")) {
            System.out.println(1);
        } else if (montName.equalsIgnoreCase("February")) {
            System.out.println(2);
        } else if (montName.equalsIgnoreCase("Marc")) {
            System.out.println(3);
        } else if (montName.equalsIgnoreCase("April")) {
            System.out.println(4);
        } else if (montName.equalsIgnoreCase("May")) {
            System.out.println(5);
        } else if (montName.equalsIgnoreCase("June")) {
            System.out.println(6);
        } else if (montName.equalsIgnoreCase("July")) {
            System.out.println(7);
        } else if (montName.equalsIgnoreCase("August")) {
            System.out.println(8);
        } else if (montName.equalsIgnoreCase("September")) {
            System.out.println(9);
        } else if (montName.equalsIgnoreCase("October")) {
            System.out.println(10);
        }else if (montName.equalsIgnoreCase("November")) {
            System.out.println(11);
    }else if (montName.equalsIgnoreCase("December")) {
            System.out.println(12);

        }else{
            System.out.println("Invalid month name (Gecersiz ay adı...)");
        }

        /*Note: Stringler'in esitliklerini kontrol ederken "==" yerine "eguals()" kullanırız.
           Niye?
           Cunku "==" sembolu iki Stringi karsılastırırken hem adres'leri hemde degerlere bakar,7
           ikiside aynı ise siz String'ler esittir der ama biz code yazarken genellkle String'lerin
           adresleri ile degil degerleri ile ilgileniri. Bu yüzden String karşılastırmalarında "==" kullanmayız.

           "equals()" metho'u ise iki String'i karsilastirirken sadece degerlerine bakar, degerler ayni ise
           bu iki String esittir der degerler farkli ise bu iki String farklidir der ki bu bizim kod yazarken
           ihtiyac duydugumuz seydir.

        Stack Memory'de
        1)Primitive Data'lar depolanir
        2)Non-primitive'lerin adresleri depolanir.(Reference)
        Heap Memory'de Non-primitive'ler depolanir.

        Primitive Data: char,boolean,byte,short,int,long,float,double
        Non-primitive Data: String,Wrapper Class,sizin olusturdugunuz Class'lar

        */
        String s ="Tom";
        String t ="Teryy";
        String r = new String("Tom");
        String m ="Tom";
        System.out.println(s==t);// false cunku adresler ve degerler farklı
        System.out.println(s.equals(t));//false cunku; degerler farklı

        System.out.println(s==r);// false cunku adres'ler farklı
        System.out.println(s.equals(r));//true verdi cunku eguals() sadece degerler bakar "s"ve "r" nin degerleri aynı oldugundan true verir

        System.out.println(s==m);//true


    }
}
