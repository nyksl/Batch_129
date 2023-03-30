package day04memorykullanimwrapperclassascii;

public class C04_WrapperClass {
    /*
    Non-primitive data türleri sadece data barındırmak icin degil aynı zamanda metotlar'da bulundurur
    Primitiv data türleri ise sadece deger saklar metodu yoktur.
    Java bu duruma bir cozum uretmistir.
    Her Primitive data turunu Non-Primitive olarak kullanabilmek icin ozel calss'lar olusturmustur.
    Oraclen firmasi'nin urunu olan java Primitivlere metot ekleyerek olusturdukları bu yeni yapıya Wrapper Class adını vermistir.

     Primitive      Wrapper
      byte    ==>    Byte
      short   ==>    Short
      int     ==>    Integer ***
      long    ==>    Long
      float   ==>    Float
      double  ==>    Double
      boolean ==>    Blooean
      char    ==>    Character ***


     */

    public static void  main(String[] args){

        byte primitiveByte = 12;
        Byte wrapperByte = 12;

        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);


        // Ex  : short , ınt , lon , data type'laerini max ve min degerlerini hesaplatan kodu yazınız.

        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);

        //************ Primitive'ler Wrapper Class'lara Nasıl cevrilir (Autuboxing)*********

        float f1 = 13.99F; //kucuk kutu primitive
        Float wrapperF1 = f1;//buyuk kutu wrapper class


        //Wrapper Class'ları Primitive data type'lere nasıl cevrilir? (Unboxing)
        Character w1 ='s';
        char primitiveW1= w1;

        //Note : Autoboxing ve Unboxing Java tarafından otomatik yapılır.
        //Extra kod yazmaya gerek yoktur
        //ex : Verilen iki String datanın toplamını veren kodu yazınız.
        String str1 ="12345";
        String str2 ="6789";
        System.out.println(str1+str2);// 123456789 yan yana yazdırdı
        System.out.println(Integer.valueOf(str1)+Integer.valueOf(str2));


    }


   }



