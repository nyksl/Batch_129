package day37lambda;

import day36lambda.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Lambda01 {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();

        myList.add(12);
        myList.add(8);
        myList.add(23);
        myList.add(10);
        myList.add(7);

        System.out.println(getSumOfAllElements(myList));// 60
        System.out.println(getSumFromSevenToSeventy());// 2464
        System.out.println(getMultiplicationFromThreeToNine1());// 181440
        System.out.println(getMultiplicationFromThreeToNine2());// 20160
        System.out.println(getFactorial(-5));//
        System.out.println(getSumOEvensBetweenTeoInt(15,4));// 50
        System.out.println(getSumOfDigitsBetweenTwoInts(12,18));// 30
    }

    //1)Verilen list'deki tum sayilarin toplamini veren method'u olusturunz
    public static int getSumOfAllElements(List<Integer> myList) {
        return myList.stream().reduce(Math::addExact).get();
        //Math::addExact() :Matematik Class'ina git,topla tam olarak
    }

    //2) 7'den 70'e kadar tum tam sayilarin toplamini veren kodu yaziniz.
    public static int getSumFromSevenToSeventy() {
        return IntStream.rangeClosed(7, 70).reduce(Math::addExact).getAsInt();
        //rangeClosed==> baslangis ve bitis araligi veriyor
        //Intstream==> integerlari yukardan asagi diziyor.

        //Note: Her zaman bize verilen list ile islem yapamayabiliriz
        //      Bunun icin IntStream methodunu kullaniriz.
        //      rangeClosed(startInclusive, endInclusive) methodu bize
        //      baslangıc ve bitis degeri kapsayan degiskenlerle islem yapmamızı saglar
    }

    //3) 3'den 9'a kadar tum sayilarin carpimini veren methodu olusturunuz
    public static int getMultiplicationFromThreeToNine1() {
        return IntStream.rangeClosed(3, 9).reduce(Math::multiplyExact).getAsInt();// rangeClosed() ==> [ ]

    }

    public static int getMultiplicationFromThreeToNine2() {
        return IntStream.range(3, 9).reduce(Math::multiplyExact).getAsInt();// rangeClosed() ==> [ ]
       //range(startInclusive, endExclusive) method baslangıc degerini dahil eder
      //                                           bitis degerini dahil etmez.
      // O yuzden bitis degeri bize verilenden 1 ust deger olması gerekir
    }

    //4)Size verilen sayinin faktoryelini hesaplayan kodu yaziniz.
    public static int getFactorial(int x){
        if (x==0){
            return 1;
        }else if (x<0){
            System.out.println("Faktoriyel islemi negatif sayilarla yapilamaz");
            return -1;
        }else {

        }
        return IntStream.rangeClosed(1,x).reduce(Math::multiplyExact).getAsInt();
    }

    //5) Size verilen iki tam sayi arasindaki tum cift sayilarin toplamini veren kodu yaziniz
    public static int getSumOEvensBetweenTeoInt(int a, int b){
        if (a>b){
            int temp = a;
            a=b;
            b=temp;
        }
       return IntStream.range(a+1,b).filter(Utils::isNumberEven).sum();

    }
    //6) Size verilen iki tam sayi arasindaki tum tam sayilarin rakamlari toplamini veren kodu yaziniz
    // 12 ve 18 ==> 13 14 15 16 17 ==> 4+5+6+7+8 = 30
    public static int getSumOfDigitsBetweenTwoInts(int a, int b){

       return IntStream.range(a+1,b).map(Utils::getSumOfDigits).sum();
        // rakamlari teker teker alip sonradan toplayacak streamdeki elemanlar degiscek bu yuzden reduce yerine map kullandik.

    }


}


