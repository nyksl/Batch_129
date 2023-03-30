package day07ifstatement;

public class C01_IfStatement {
    public static void main(String[] args) {

        // if it rains, I will cancel the picnic
        // Eger yagmur yagarsa piknigi iptal edecegim

        //Example 1: Verilen karakter büyük harf ise ekkrana "Buyuk harf yazdıran kodu oluturunuz.


        char ch = 'A';

        if (ch>='A' && ch<='Z'){
            System.out.println("Buyuk Harf");
        }//if body


        //Example 2: Verilen bir sayı cift sayı ie ekrana cıft sayi yazdıran kodu olusturunuz.

        byte sayi=20;
        if (sayi%2==0){
            System.out.println("Cift Sayi");
        }

        //Ex 3: Verilen sayi 300'den kucuk veya 1200 buyuk ise ekrana "Harika Sayı" yazdıran kodu olusturunuz.
       int s1=305;
        if(s1<300 || s1>1200){
            System.out.println("Harika Sayi");

        }//if body

        // Ex 4) Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz


    }//main
}//class body
