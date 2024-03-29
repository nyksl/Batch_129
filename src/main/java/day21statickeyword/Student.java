package day21statickeyword;

public class Student {
    /*
    1)Static variable veya static method'lar(class member) tum objeler icin ortak elemandir
    Static olan gokteki ay gibidir.Butun objelerin ortak veriable'si olur.
    Siz bir methodu static yaparsaniz o butun objelerin ortak methodu olur.
    2)static class member'lar uzerinde yapilan tum degisiklikler tum objeleri etkiler.
    3)static member'lar Class'a, non-static class member'lar object'lere monte edilir.
      Mesela; bir calss'dan 100 tane object olusturdugunuzda non- static olanlar 100 kere olusturulur
      ama static olanlar obje sayisindan bagimsiz olarak bir kere olusturulur.
    4) static calass memberlara ulasmak icin object olusturmaya gerek duyulmaz, ama non-static calss member'lara
     uasmak icin object olusturmak sarttir.
    5)static veriable'lerin diger adi clas veriabledir.Cunku class'lara yapistirilir.
     Non-static Veriable'lerin diger adi "Instance Veriable" veya "Object Veriable"dir.
    */


    public static String stdName = "Tom Hanks";
    public int age = 13;

    //Ogrenci isiminin ilk harflerini veren methodu olusturunuz
    public static String getInitials(String name){
        String first = name.substring(0, 1);
        String second = name.split(" ")[1].substring(0,1);
        return first + second;
    }

    //Ogrenci ismindeki sesli harfleri(a, e, i, o, u) sayan bir method olusturunuz
    public int countVowels(String name){

        int counter = 0;

        for(int i=0; i<name.length(); i++){
            char ch = name.toLowerCase().charAt(i);
            switch(ch){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':

                    break;
            }
        }
        return counter;
    }




}
