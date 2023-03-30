package day08nestedifternary;

import java.util.Scanner;

public class Nested04Tekrar {

    public static void main(String[] args) {
         /*
   Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra

   Eger calisan kadinsa;

    60 yasindan buyukse “Emekli Olabilir “yazdirin

   Eger calisan erkek ise;

    65 yasindan buyukse “Emekli Olabilir” yazdiran kodu olusturunuz
    */
        Scanner input = new Scanner(System.in);
        System.out.println("Cinsiyetinizi giriniz Erkek, Kadin, Digerleri... ");
        String cinsiyet = input.next();

        System.out.println("Lütfen yasinizi giriniz..");
        int yas = input.nextInt();

        if (cinsiyet.equalsIgnoreCase("Kadin")){
            if (yas>60){
                System.out.println("Emekli olabilir...");
            }else{
                System.out.println("Calismali");

            }
                }else if (cinsiyet.equalsIgnoreCase("Erkek")){
            if (yas>65){
                System.out.println("Emekli olabilir...");
            }else {
                System.out.println("Calismali...");

            }

            }else{
            System.out.println("Tanimli degil...");
        }







    }
}
