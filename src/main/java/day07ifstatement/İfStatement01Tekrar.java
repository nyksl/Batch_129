package day07ifstatement;

import java.util.Scanner;

public class İfStatement01Tekrar {
    public static void main(String[] args) {



    //Ex 1: Verilen charecter buyuk harf ise ekrana Buyk Harf yazdıran kodu olusturunuz.
    //      Kucuk harf ise kucuk harf yazdıran kodu yazınız.
     Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz...");

        char hrf =input.next().charAt(0);
        //1.Yol
       // if(hrf>='A' && hrf<='Z'){

       // System.out.println("Buyuk harf...");

       // }
       // if(hrf>'a'&& hrf<'z'){
        //    System.out.println("Kucuk harf...");
       // }
       // System.out.println("Harf degil...");

        //2.Yol
        if(hrf>='A' && hrf<='Z'){
            System.out.println("Buyuk harf.");

        } else if (hrf>='a' && hrf<='z') {
            System.out.println("Kucuk harf.");

        }else{
            System.out.println("Harf degil.");
        }
    }
}
