package day06stringmanipulationsifstatement;

public class StringManipulations01 {
    public static void main(String[] args) {

        //Exmple 1: Bir String'in bas ve sonunda space character'i varsa siliniz.
        //"trim" (kırpmak) demektir. space'leri silmek icin bu method kullanılır.
        //         "Ali Can  "   ==> "Ali Can"

        String s = " Ali Can ";
        System.out.println(s);

        //Trim metod'u bir String'in bas ve sonundaki space charecter'lerini siler, aradaki space'lere dokunmaz,
        String sTrimmed =  s.trim();
        System.out.println(sTrimmed);

        //Example 2: Asagıdak fiyatları verilen urunlerin toplam fiyatlarını bulunuz.
        //          String tv = "$456.99";    String laptop = "$875.99"  ==> 456.99 + 875.99 = 1332.98

        String tv1 = "$456.99";
        String laptop1 = "875.99";

        String tv2 = tv1.replace("$", "");// "replece" hiç birşey demek charecterleri siler
        System.out.println(tv2);//456.99  ==> Ondalık sayılar Java'da otomatik olarak double kabul edilir.

        String laptop2 = laptop1.replace("$", "");
        System.out.println(laptop2);//875.99

       Double totalPrice = Double.valueOf(tv2) + Double.valueOf(laptop2);
        System.out.println(totalPrice);//1332.98

        //Example 3: Verilen ismin ilk harfini ve soy ismin ilk harfini ekrana yazdırınız.
        //           "Ali Can" ==> AC

        String name = "   ali cAn  ";
       char first = name.trim().toUpperCase().charAt(0);//trim ile speceleri sildik, toUperCase ile kücük harfleri
        // büyüttük, charAt(0) yazarak Ali'nin A sini aldık
        System.out.println(first);//A

        char second = name.trim().toUpperCase().split( " ")[1].charAt(0);// split Bir string' parcalamak icin
        // kullanılır.ad soyad'ın arasındaki space'ı silmek icin "split"kullanıyoruz.
        System.out.println(second);

        System.out.println("" +first + second);//AC char oldugu icin AC'yi yazdırması icin ("" +) koyuyoruz.

        //Example 4: Bir String'in hic character icermedigini(Bos String) kontrol eden kodu yaınız.

        String str = "";

        //1. Yol: length () kullan
        boolean result1 = str.length()==0;
        System.out.println("String bos mu?" + result1); // true

        //2.Yol:isEmpty() kullan. Java bir konuda method uretmisse, o method' kullanmak en iyisidir
       boolean result2 = str.isEmpty();//ikinci yol kullanımı daha kolay ve iyi
        System.out.println("String bos mu?" +result2);// true

        //Exampla 5: Bir String space haric hicbir character icermedigini kontrol eden kodu yazınız.

        //1.Yol:
        String t = "     ";
       boolean result3 = t.replace(" ", "").length()==0;
        System.out.println("Sadece space mi var?" + result3);//true

        //2.Yol:
       boolean result4 = t.replace(" ", "").isEmpty();
        System.out.println("Sadece space mı var?" +result4);

        //3.Yol:
        //isBlank metod'u sadece space iceren String'ler icin verir, space disinda bir character icerirse false verir
        //isBlank metodu bos String'ler inid de true verir
        //isBlank() ==> space + hicbirsey icin true               // isEmpty ==> hicbirsey icin true

        boolean result5 = t.isBlank();
        System.out.println("Sadece space mi var?" + result5);

        //Example 6: Bir String'te a, e, i characterlerinin ilk gorunumlerinin indexleri toplamını yazdırınız.
        //           "Java is easy to learn" ==> 1 + 5 + 8 =14

        String r = "Java is easy to learn";
       int idxA = r.indexOf('a');//1
        System.out.println(idxA);

       int idxİ = r.indexOf('i');
        System.out.println(idxİ);//5

        int idxE = r.indexOf('e');
        System.out.println(idxE);//8

        System.out.println("Index'ler toplamı:" + (idxA+idxİ+idxE));// Indexler toplamı 14

        //Example 7: Bir String'te Java kelimesinin ilk kacıncı indexlerde kullanıldıgını gosteren kodu yazınız.
        //          "Ah Java vah Java sensizolmuyor Java."

        String u = "Ah Java vah Java sensizolmuyor Java.";
        //indexOf("Java") kullanımında siz "Java" kelimesinin ilk gorunumundeki ilk harfin (Yani J'nin) index'ini almış olursunuz.

       int idxJava = u.indexOf("Java");
        System.out.println(idxJava);//3

        //indexOf metod'u olmayan characterler icin kullanılırsa her zaman "-1" verir.
       int idxOfXyz = u.indexOf("xyz");
        System.out.println(idxOfXyz);

        //Bir String'te a, e, i characterlerinin son gorunumlerinin indexleri toplamını yazdırınız.
        //            "Java is easy to learn" ==> 18 + 5 + 17 = 40
        String v = "Java is easy to learn";
        int idxOfA =v.lastIndexOf('a');
        System.out.println(idxOfA);//18

        int idxOfI = v.lastIndexOf('i');
        System.out.println(idxOfI);//5

        int idxOfE =  v.lastIndexOf('e');
        System.out.println(idxOfE);//17

        System.out.println(idxOfA+idxOfI+idxOfE);//40

        //Note: lastIndexOf() String olmayan bir character icin kullanilirsa her zaman "-1" verir


        //Example 9: Bir String'teki tekrarsız character'leri ekrana yazdırınız,
        //          aac ==> c
        //INTERWİEW SORUSU

        String y = "aac";
        char ch1 = y.charAt(0);

        if(y.indexOf(ch1)==y.lastIndexOf(ch1)){
            System.out.println(ch1);
        }

        char ch2 = y.charAt(1);

        if(y.indexOf(ch2)==y.lastIndexOf(ch2)){
            System.out.println(ch2);
        }

        char ch3 = y.charAt(2);

        if(y.indexOf(ch3)==y.lastIndexOf(ch3)){
            System.out.println(ch3);
        }

        //Note : Bazı kodların bazı sartlara baglı olarak calısması gerekir.
        //       Bazı kodları bazı sartlar gore aktive etmek icin "if statement" kullanılır.
        //       if you study hard, you will learn Java.

        //Example 10: Sayi pozitif ise ekrana pozitif yazdirin.
        int num = 12;
         if(num>0){
             System.out.println("Pozitif");

        }



         //Example 11: Sayı -1 ile 10 arasında ise ekrana rakam yazdırın.
        int number = 3;
        if(number>-1 && number<10){
            System.out.println("Rakam");
        }

        //Example 12: Sayı 3 basamaklı ise ekrana "Wooow!" yazdırın.


       int n = 177;
        if(n>99 && n<1000){
            System.out.println("Wooow!");



        }









    }
}
