package day04memorykullanimwrapperclassascii;

public class C02_AsciiDegerleri {
   /*

    ASCII= Amerikan standart kodlama sistemi uluslararası kabul görmüs degerlerdir.
    Klavyemizde kullandıgımız harf ve semollerin matematiksel karsiligi char data türünde isleme alınırsa o char degerinin Acii Table.....1daki karsılıgını isleme alır.
    Harf ve sembollere deger atar.
    Karakterlerin cebirsel krsiligini bulmak icin ortaya cıikmistir. Cunku bilgisayarda hersey 1001001 den olusur. Bu yaoiya cevirebilmek icin Ascii Table olusturulmustur.
    Buyuk harflerin Ascii degri kucuk harflerin Ascii degerinden daha kucuktur.


   */

   public static void main(String[] args) {
    //Bir tamsayi ile bir harfi toplayınız
    int deger = 20;
    char harf = 'a';

    //1. Yol
       int sum =deger + harf;
       System.out.println("Bir tam sayı ile harfin toplamı ="+sum);

       //2.Yol
       System.out.println("2.Yol Toplam"+(deger+harf));//117

       char rakam1='1';
       System.out.println("rakam1 = "+rakam1);//1

       char rakam2='2';
       System.out.println("rakam2 ="+rakam2);//2

       char rakam3='3';
       System.out.println("rakam3="+rakam3);//3

       char rakam4='4';
       System.out.println("rakam4="+rakam4);//4

       System.out.println("rakam1+rakam2+rakam3+rakam4="+rakam1+rakam2+rakam3+rakam4);//1234

       System.out.println("rakam1+rakam2+rakam3+rakam4 ASCII toplam ="+rakam1+rakam2+rakam3+rakam4);//1234

       char kh='a';
       char bh ='A';
       System.out.println("a'nin Ascii Degeri ="+(kh+0));//

       System.out.println("A'nin Ascii degeri="+(bh+0));

       System.out.println("kh>bh==>"+(kh>bh));//truekarsılastırma islemlerinin sonucu true yada false cıkar.

       //Herhangibi bir karakterin Ascii degerini hesaplatalım.

       //1.Yol
       char space = ' ';
       System.out.println("soace'in Ascii degeri ="+(space+0));

       //2.Yol
       int hrf= 'm';

       //charlarda java type'larda Java karakterlere int degerlerde atanabilir
       //Cunku data type'ini bir resim degeri birde
       //Ascii'den gelen int degeri vardır.
       //Bu sekilde  de Ascii degerinide bulabiliriz

       System.out.println("int harf'in Ascii degeri"+hrf);

       ///Ascii degerlerinden yararlanarak karsilastirma yapabiliriz *******///
       byte b= 125;
       float f = 2.45648f;
       long l= 54565125511144L;
       char ch= 'h';
       System.out.println(l>ch); //true
       System.out.println(b<f); //false
       System.out.println(b<ch);//false

   }
}
