package day02datatypesmethodcration;

public class Veriables01 {

    //primitive datatypes --> char - boolean -byte - short - int - long - float - double

    //float: virgullu sayılar(ondalık sayılar-Decimal Numbers) icin kullanılır.Memory'de daha az yer kaplar.
    // (Fiyatlandırmalarda kulanılır. - 12.99)
    //double: virgullu sayılar(ondalık sayılar-Decimal Numbers) icin kullanılır. double daha fazla yer kaplar.
    //(Hucre agırlıgında kullanılır. 0.000000000000112)

    //Not1: primitive data type'lerini Java olusturmustur, biz olusturamayız.
    //Not2: primitive data type'lerinin isimlerinde sadece kucuk harf kullanılır.
    //Not3: primitive data type'ler data type'lara gore memory'de  yer kaplar.
    //Not4: primitive data type'ler iclerinde sadece sizin atadıgınız degeri barındırır.

    public static void main(String[] args) {
        //Ornek 1: Gomlek ve ayakkabı fiyatları icin iki tane veriable olusturup toplam fiyatı ekrana yazdırınız.
        //Note: Java Decimal Numbers(Ondalik sayilar)'i otomatik olarak "double" kabul eder.
        //float olmasını ısrar ediyorsanız sonuna "F" koymalısınız.
        //float memory'de 4 byte yer kaplar, double ise 8 byte yer kaplar.

        float shirtPrice = 12.99F;
        float shoesPrice = 15.89F;
        System.out.println(shirtPrice + shoesPrice);

        //Ornek 2: Hucre ve Amip'in agırlıgı icin iki tane veriable olusturun ve agırlıkları farkını ekrana yazdırın
        double weightCell = 0.000000000000112;
        double weightAmip = 0.000000000000023;
        System.out.println(weightCell - weightAmip); //8.9E("E"Exponent-Ussu sayı demek) -14==> 8.9 carpı 10 uzeri -14 0.00000000000008.9



    }

}
