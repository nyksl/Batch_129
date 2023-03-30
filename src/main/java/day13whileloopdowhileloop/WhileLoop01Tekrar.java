package day13whileloopdowhileloop;

import java.util.Scanner;

public class WhileLoop01Tekrar {
    public static void main(String[] args) {

        //Example 1: Kullanicinin verdigi sayi icin carpim tablosunu olusturup console'a yazdiran kodu yaziniz
        //           3 ==> 3x1=3 3*2=6 3*3=9 3*4=12.... 3*10=30

        Scanner input = new Scanner(System.in);
        System.out.println("Carpim tablosunu gormek icin bir sayi giriniz");
        int  c= input.nextInt();

        int i= 1;

        while (i<11){
            System.out.println(c + "x" + i+ "=" + (c*i));

            i++;

        }
        System.out.println();

        //Example 2: Verilen bir String'de her harfin sonrasina "*" sembolunu ekleyiniz
        //           Java ==> J*a*v*a*

        System.out.println("Bir kelime giriniz");
        String z = input.next();
        String w = "";

        int k =0;


        while (k<z.length()){
            w = w + z.charAt(k)+ "*";

            k++;
        }
        System.out.println(w);



















    }
}
