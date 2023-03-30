package day10switchloops;

public class Loops01Tekrar {
    public static void main(String[] args) {

        //Ex 1: ekrana 5 defa "Hİ" yazdıran kodu yazdırın.

        for (int i = 1; i<6; i++){
            System.out.println("Hİ");

        }



        //Ex 2: 11'den 14'e kadar tum sayilari ekrana yazdiriniz.

        for (int i=11; i<15; i++){
            System.out.println(i);

        }

        //Ex 3 : 40'dan 23'ekadar tum cift tamsayilari ekrana yazdiriniz.

        for (int i =40; i>22; i--){
            if (i%2==0){
                System.out.print(i+ " ");

            }

        }
        System.out.println();

        //Example 4: 18'den 56'ya kadar tum tek tamsayilari ekrana yazdiran kodu yaziniz
        for (int i=18; i<57; i++){
            if (i % 2 != 0); {// if i'yi 2'ye boldugunde kalan sifir (!)degilse yazdir.
                System.out.print(i+ " ");
            }

        }



        }
    }
