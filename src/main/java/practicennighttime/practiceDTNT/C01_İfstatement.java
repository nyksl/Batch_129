package practicennighttime.practiceDTNT;

import java.util.Scanner;

public class C01_İfstatement {
    public static void main(String[] args) {


        /*
        Kullanıcıdan bir gun alin
        Eger gun cuma ise "Muslumanlar İcin Mubarek Gun",
        Eger guncumartesiise "Yahudiler icin Kutsal Gun"
        Eger gun pazar ise "Hiristiyanlar İcin Kutsal Gun"
        yazdıran kodu yazdıralım.


         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen gun ismi giriniz...");

        String gun = input.next().toLowerCase();//Kucuk harfe cevirdik

        if (gun.equals("cuma")) {
            System.out.println("Muslumanlar İcin Mubarek Gun");

        } else if (gun.equals("cumartesi")) {
            System.out.println("Yahudiler icin Kutsal Gun");
        } else if (gun.equals("pazar")) {
            System.out.println("Hiristiyanlar İcin Kutsal Gun");

        }else
            System.out.println("Kutsal gün degildir..");


    }
}

