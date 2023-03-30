package day01deneme01;

public class deneme01Veriables {

    public static void main(String[] args) {

        //String!lere deger verirken cift tırnak (" ") icinde olmalıdır.

        String studentName = "Ali Can";
        System.out.println(studentName);

    /*
Javada iki tip daa vardır;
1)primitiv data taype:
char - boolean - byte - short - int - long - float - double
char: Tek karakterler icin kullanilir. A, *, ?, 5;
boolean: Sadece iki farklıdeger alabilir; true(dogru) veya false(yanlıs)
byte: -128'den +127'e kadar tamsayı degerleri icin kullanılır.(1byte)
short: -32768 ile 32767 arasındaki tamsayılar icin kullanılır.(2byte)
int:-2,147,483,648 ile 2,147,483,648(milyar) arasındaki sayılar icindir.(4byte)
long: -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807(kat trilyon) arasındaki sayılar icindir.(8byte)
2) non-primitive data taype


     */

        //Ornek 2: char data taype'inde ilk ismin ilk harfi olarak bir variable olusturunuz ve bir deger atayınız.
       //char data taype'ınde degerler tek tırnak icinde kullanılır.
        char isminİlkharfi = 'A';
        System.out.println(isminİlkharfi);

       //Ornek 3: noolean data taype'ında emeklimisin icin bir deger olusturun ve false degerini atayın
        boolean emeklimisin = false;
        System.out.println(emeklimisin);

        //Ornek 4: byte data tape'ınde ogrenci yası icin bir variable olusturun ve deger atayınız.

        byte studentAge = 13;
        System.out.println(studentAge);

        //Ornek 5: Site nufusu icin bir variable olusturun.
        short siteNufusu = 1200;
        System.out.println(siteNufusu);

        //Ornek 6:Ulke nufusları icin bir variable olusturup deger ataması yapınız.
        int ulkeNufusu = 1864184648;
        System.out.println(ulkeNufusu);

        //Ornek 7: insan vucudundaki hucre sayısı icin variable olusturunuz.
        //Not: Bir deger long ise sonuna "L" konur.
        long insanVucudundakiHucreSayısı = 87654321356788L;
        System.out.println(insanVucudundakiHucreSayısı);

        //Eger long'a atadıgınız deger int'lerin arasında is sonuna "l" koymaya gerek yok
        long weightOfSun = 123456;





    }
}
