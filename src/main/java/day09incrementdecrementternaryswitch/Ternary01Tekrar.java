package day09incrementdecrementternaryswitch;

public class Ternary01Tekrar {
    public static void main(String[] args) {

        //Example 2: Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz.
        //           -4 ==> -1*-4        4 ==> 4        0 ==> 0

         int a = -4;

        int r1 = a<0 ? -1*a : a;
        System.out.println(r1);


        int c = 450;

        int d1 = Math.abs(c); // Eger size verilen sayi eksi sayi ise mutlak sayiya cevirmek icin kullanılır.

        Object r2 = c>99 && c<1000 ?   c+ " Uc basamakli sayidir..." : c+ " Uc basamakli degildir...";
        System.out.println(r2);

    }
}
