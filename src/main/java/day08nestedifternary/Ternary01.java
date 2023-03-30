package day08nestedifternary;


import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {

       //Ex 1: Kullacidan iki sayi aliniz "buyuk olmayan"(kucuk veya esit olan) sayiyi yaziniz.
        Scanner input = new Scanner(System.in);
        System.out.println("İki sayi giriniz...");
        double a = input.nextDouble();
        double b = input.nextDouble();

        //1. Yol
        if(a<b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
        //2. Yol : Ternary
        //            Condition  ? Condition true ise calisir    : Condition false verir ise calısır
        double result = a<b      ?       a                       :              b;

        System.out.println(result);
    }


}
