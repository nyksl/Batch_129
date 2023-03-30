package day04asciiwrapperclassoperatorsmemoryyusage;

public class Operators01 {
    /*
    1)+,-,*,/ islemleri Jada'da matematik'te kullanıldıgı gibi kullanılır.
    Note 1: int / int ==> int olur
    Note 2: double / int ==> double olur. Cunku Java'da matematik islemlerde farklı data type'ları
     kullanılırsa sonuc buyuk data taype'ında olur

    2) Java'da "logical operator"lardır.
    AND veOR islemleri "logical operator"lardır.
    //And islemlerinde "true alabilmek için hersey true olmalıdır.
    //AND islemleri "perfectionist"dir.
    //AND islemleri bir tane false sonucu false yapar.
   || OR işleminde bir tane true sonucu true yapmaya yeter.(|| or symbol)
   ||OR işleminde sonucun false olması için her şey false olmalıdır.
   || OR işlemi "polyanna" gibidir.

   ii)NOT operatoru (!) true olanı false, false olanı true yapar.
      !true = false
      !false = true
      !true = true

      3)Comporison(Karsılaştırma) Operatorleri
      <,>,<=,>=,==,!=
      NOT: Karsılastırma oreratorlerini kullandıgınızda kesinlikle boolean (true veya false) alırsınız.

      NOT:Biz AND islemi için "&" kullanım da gecerlidir.
      Farkları nedir?
      "&&" ilk ifade false oldugunda diğerlerini ontrol etmez dolayııyla hızlı calısır.
      "&" kullanım ilk ifade ne olursa olsun digerlerini kontrol eder dolayııyla hızlı calışır.
      Bu yuzden biz hep "&&" kullanırız.

     */

    public static void main(String[] args) {
  boolean first = 3<5;
  boolean second = 2+3 != 5;
  boolean third = 2+3*5>= 19;

        System.out.println(first + " - " + second + " - " + third);

        System.out.println(first && second);
        System.out.println(first || second || third);


    }
}
