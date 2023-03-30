package day29exceptions;

public class Exceptions02 {

    public static void main(String[] args) throws IllegalArgumentException {

        /*
        "throw" ile "throws" keyword'leri arasindaki fark nedir?
        1)"throw" method body'si icinde, "throws" ise method paranetzinden hemen sonra kullanilir.
        2)"throw" method body'si icinde istenilen yerde istenildigi kadar kullanilir,
          "throws" ise method paranetzinden hemen sonra sadece bir kere kullanilabilir.
        3)"throw" dan sonra "new" keyword ve "constructor" kullanilarak object olusturulur.
          "throws" dan sonra sadece Exception Class ismi yazilir
        4)"throw" belli sartlar icin Exception atmada kullanilir, "throws" ise application'i Exception attiktan sonra durdurur.
     */


        /*
      Belli sartlar altinda biz kendimiz exception throw edebiliriz.
      Mesela kullanici negatif yas girerse java hata vermeyecegi icin
      exception throw etmesini biz javaya soylemis oluruz.
      Java gercek hayati bilmez. Biz burada tabiri caizse Java'ya age'in negatif olmayacagini soyledik.
         "IllegalArgumentException"
    */
        try {

            printAge(-18);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
//        try {
//            getMark(-900);
//        }catch (IllegalArgumentException e){
//            System.out.println(e.getMessage());
//        }
        getMark(-90);

    }

    //"throw "keyword bir method'un body'si içinde istediğimiz yerde istediğimiz koşullar için istedigimiz kadar Exception atmamızı sağlar.
    //"throw" keyword yazdiktan sonra bir Excaption Class object'i olusturulur.
    //Exception Class constructor'inin parantezi icine istediginiz Exception mesajini yazabilirsiniz.

    public static void printAge(int age) {

        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        } else {
            System.out.println(age);//IllegalArgumentException

        }
    }
    //Ogrenci notlari girisi yapan ve notu console'a yazdiran bir method olusturunuz
    public static void getMark(double d){

        if (d<0){
            throw new IllegalArgumentException("Marks cannot be less than zero");
        }else if (d>100){
            throw new IllegalArgumentException("Marks cannot be greater than hundred");
        }else {
            System.out.println(d);
        }
    }
}
