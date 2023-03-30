package day23datetimestringbuilder;

public class StringBuffer01 {

     /*
        String olusturmak icin String Class, StringBuilder ve StringBuffer kullanilabilir.
        1)StringBuffer Java'nin String uretmek icin olusturdugu ilk Class'dir. Java 5'de uretilmistir. Suan Java 19 var.
        StringBuffer varken String Class ve String Class yoktu.
        2)StringBuffer "synchronized" dir, StringBuilder "synchronized" degildir.
        3)StringBuffer "thread-safe"-(guvenli)(multi-thread'e-(cok dizin) uygun) dir, StringBuilder "thread-safe" degildir.
        4)StringBuffer ve StringBuilder ikisi de mutable(degisken) dir.

                *String Clas Immutable (degismez) olusturur
                *StringBuilder ve StringBuffer Mutubale string olusturur ama StringBuffer "thread-safe"'dir Synchronization!dır
                *StringBuilder "thread-safe" degil "Synchronization" degildir.
                *"Multithread" bir anda birden fazla is yapabilmek demektir.

        Note 1: Immutable(degismez) String lazim oldugunda String Class kullaniriz.
               Note 2: Mutable(degisken) String lazim oldugunda StringBuilder veya StringBuffer kullaniriz.
        Note 3: StringBuffer "Multithread" ve "Synchronization" lazim oldugunda tercih edilir.
                StringBuilder "Multithread" ve "Synchronization" gerekmezse tercih edilir.
     */

    public static void main(String[] args) {

        StringBuffer sbf = new StringBuffer("Java");
        System.out.println(sbf);//Java

        System.out.println(sbf.capacity());//20 verdi cunku 16 kutucuk ile 4'de Java'nin charekteri






    }
}
