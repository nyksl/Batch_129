package day01deneme01;

import java.util.Arrays;
import java.util.Scanner;

public class Soruu {
    public static void main(String[] args) {
        //javada bir sayının kaç kez girildiğini bulan program hakkında yardım istiyorum
      // Örneğin
      //  girdiğim sayılar sırasıyla :
      //  1
      //  2
      //  4
      //  1// 2
      //  Çıktı ise şu şekilde olmalı
      //  1 sayısı 2 kez girilmiştir
      //  2 sayısı 2 kez girilmiştir
        //4 sayısı 1 kez girilmiştir

        System.out.println("Kaç Tane sayı gireceksin = ");
        Scanner input = new Scanner(System.in);
        int sayiSayisi = input.nextInt();

        int sayiDizisi[ ] = new int [ sayiSayisi ];
        int bakildimi[ ] = new int [ sayiSayisi ];
        for (int i = 0; i < sayiSayisi; i++) {
            System.out.println((i+1) + ". Sayıyı gir = > ");
            sayiDizisi[i] = input.nextInt();

        }
        int bakilansayi = 0;
        for (int i = 0; i < sayiSayisi; i++) {
            int a = 0;
            for (int j = 0; j < sayiSayisi; j++) {
                if(sayiDizisi[i]==bakildimi[j])
                {
                    a++;
                }
            }
            if(a == 0 )
            {
                int sayiAdedi = 0;
                for (int t = 0; t < sayiSayisi; t++) {
                    if(sayiDizisi[i]== sayiDizisi[t])
                    {
                        sayiAdedi ++;
                    }
                }
                bakildimi[bakilansayi] = sayiDizisi[i];
                bakilansayi ++;
                System.out.println(sayiDizisi[i] + " Sayısından " + sayiAdedi + " tane var ");


            }
        }


    }
}
