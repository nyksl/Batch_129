package day05typecastingstringmanipılations;

public class StringManipulations01 {
    //String bir non-primitive data type'dır ve aynı zamanda bir class'dır.

    public static void main(String[] args) {

        String s = "Java is easy";

        //Example 1: "s" String'indeki tum character'leri buyuk harf yapınız.
        String supper = s.toUpperCase();
        System.out.println(supper);//JAVA IS EASY

        //Example 2: "s" String'indeki tum character'leri kucuk harf yapınız.
        String sLower = s.toLowerCase();
        System.out.println(sLower);//java is easy

        //Example 3: "s" String'indeki ilk character'i alınız.
        char firstChar = s.charAt(0);
        System.out.println(firstChar);//J

        //Example 4: "s" String'indeki ikinci ve sondan ikinci character'i alınız ve ekrana yanyana yazdırınız.
       char secondChar = s.charAt(1);//a
       char secondLastChar = s.charAt(10);//s

        //1.Yol
        System.out.println(secondChar);
        System.out.println(secondLastChar);

        //2.Yol
        System.out.println(" " + secondChar + secondLastChar);

        //Example 5: "s" String'inde kullanılan character sayısını bulunuz.
        int sLenght = s.length();
        System.out.println(sLenght);//12

        //Example 6: "s" String'indeki ilk 4 characteri alınız.

        //substring'de(0, 4) ==> yani ilk index dahil, "4" yani ikinci index haric'dir.(0,4)
       String sub1 = s.substring(0, 4);
        System.out.println(sub1);

        //Example 7: "s" String'indeki "is" kelimesini alınız.

      String sub2 =  s.substring(5, 7);
        System.out.println(sub2);

        //Example 8: "s" String'indeki "easy" kelimesini alınız.
        String sub3 = s.substring(8, 12);
        System.out.println(sub3);
        //Bir character'den baslayıp String'in sonuna kadar olmak isterseniz,ikinci index'i yazmayınız.
        //s.substring(8, 12); yerine s.substring(8); yazınız
        String sub4 = s.substring(8);
        System.out.println(sub4);

        //Example 8: "s" String'inde "money" kelimesinin var olup olmadıgını kontrol ediniiz.
       boolean isExist = s.contains("money");
        System.out.println(isExist);//false

        /*
        Bir metodu ogrenirken uc seyi ogrenin
        i)Bu metot ne ise yapar?
        ii)Bu metodun farklı kullanımları nasıldır?
        iii)Bu metod size ne return eder?
         */

        //Example 10: "s" String'inin belli bir harfle baslayıp baslamadıgını kontrol ediniz.
        boolean isStart = s.startsWith("Java");
        System.out.println(isStart);

        //Example 11: "s" String'inin 6. karakterden itibaren belli bir harf ile baslayıp baslamadıgını kontrol ediniz.
       boolean isBegin =  s.startsWith("i", 5);
        System.out.println(isBegin);










    }

}
