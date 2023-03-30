package practicennighttime.practiceDTNT;

import java.util.Scanner;

public class C03_Ternary {

    /*
     Kullanicidan sifirdan buyuk pozitif bir tamsayi girmesini isteyin
     Girilen pozitif tamsayi 3 basamakli ise ekrana "3 Basamakli " yazdirin
     3 basamakli degilse cift olup olmadigini kontrol edin
     Cift ise "3 basamakli olmayan cift sayi" yazdirin
     Cift degilse " 3 basamakli olmayan tek sayi" yazdirin
    */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz...");


        int sayi = input.nextInt();

        System.out.println("******* if ile cozumu********");

        boolean sifirdanBuyukUcBas = sayi > 99 && sayi < 1000;
        boolean sifirdanBuyukOlmayanCift = !(sayi > 99 && sayi < 1000) && sayi % 2 == 0;
        if (sayi > 0) {

            if (sifirdanBuyukUcBas) {
                System.out.println("Uc basamaklı sayi...");

            } else if (sifirdanBuyukOlmayanCift) {

            } else
                System.out.println("Uc basamakli olmayan pozitif tek sayi");

        } else {//negatif sayilar icin burasi calisacak
            System.out.println("Lutfen pozitif bir tamsayi giriniz...");

        }
        System.out.println("******* ternary ********");

        boolean pozitifseTernary = sayi>0;
        boolean sifirdanBuyukUcBasTer = sayi>99 && sayi<1000;
        boolean sifirdanBuyukUcBasDegilCiftTer = !(sayi> 99 && sayi<1000) && sayi %2 ==0;

        //Sart     ?   True Action    :   False Action

        String  sonuc  = (pozitifseTernary) ?(sifirdanBuyukUcBasTer) ? ("3 basamaklı sayi") ://0'dan
                // buyuk 3 basamakli ise incelendi
                (sifirdanBuyukUcBasDegilCiftTer ? "3 basamaklı olmayan çift sayı" : "3 basamaklı" +
                        " olmayan tek sayı ") ://0'dan buyuk 3 basamakli degilse incelendi
                ("Lutfen Sifirdan buyuk pozitif bir tamsayi giriniz");//0'dan kucuk olma durumu incelendi

        System.out.println(sonuc);

    }//main
}//class


