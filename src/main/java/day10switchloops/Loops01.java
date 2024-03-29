package day10switchloops;

public class Loops01 {
    public static void main(String[] args) {
         /*

     Code Standarts
     i)Tekrar (Repetition) olmamalıdır.
     ii)Dynamic olmalıdır.
     iii)Tamir(Fix) ve update kolay yapilabilmelidir.

     */
        //Example 1: Ekrana 5 kere "Hi!" yazdırınız.

        //1.Yol: Tavsiye edilmez.
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");


        //2.Yol:
        //Aynı adımlar tekrar tekrar yapılması gerektiğinde "Loop" lar kullanılır
        //Dort tane Loop var ; i)for-loop  ii)while-loop  iii)do-while-loop  iv)for-each-loop

        //i)for-loop

        // Baslangıç degeri    Loop'un calısma sartı  Increment/Decrement
        //Ex 1: ekrana 5 defa "Hİ" yazdıran kodu yazdırın.
        for (int i = 1; i < 6; i++) {

            System.out.println("Hi");
        }
        //Ex 2: 11'den 14'e kadar tum sayilari ekrana yazdiriniz.
        for (int i = 11; i < 15; i++) {
            System.out.println(i);
        }
        //Ex 3 : 40'dan 23'ekadar tum cift tamsayilari ekrana yazdiriniz.

        for (int i = 40; i > 22; i--) {
            if (i % 2 == 0) {

                System.out.println(i);
            }

        }

                //Example 4: 18'den 56'ya kadar tum tek tamsayilari ekrana yazdiran kodu yaziniz

        for (int i = 18; i < 57; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");


            }


        }
    }
}