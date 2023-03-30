package day02datatypesmethodcration;

public class MethodCreation01 {

    /*
    Java'da method nasıl olusturulur?
    1) main method'un olusturulur.
    2) AccessModifier + Return Type + Method Ismi + ()
    Olusturulan method'lar nasıl kullanılır?
    1)main method'un icinden kullanılır
    2)method'un ismini + () yazın
    3)Islem yapacagınız sayıları parantez icine koyun

     */
    public static void main(String[] args) {

        int sonuc = add(30, 50);

        System.out.println(sonuc);

       long carpmaSonucu = multiply(3, 6);
        System.out.println(carpmaSonucu);

       int ucluSonuc = ilkİkiyiCarpanUcuncuyuToplayan(2, 5, 8);
        System.out.println(ucluSonuc);

      double kup = getCube(5);
        System.out.println(kup);
    }

    public static int add(int a, int b){
     return a+b;
    }


    protected static long multiply(int a, int b){
        return a*b;// parantez icine (long a, long b,)'de yazılabilir.

    }
    //Ornek:Verilen 3 sayıdan ilk ikisini carpan ve sonucunu toplayan method'u olusturunuz ve kulanınız.
     private static int ilkİkiyiCarpanUcuncuyuToplayan(int a, int b, int c){
        return a*b+c;
}

    //Ornek 2: Verilen bir ondalık sayının kupunu hesaplayan methodu olusturup kullanınız.
    //Not: Access modifier'i default yapmak için access modifier yazmayın
        static  double getCube(double a){
        return a*a*a;
}

    //1) Dikdortgenin alanını hesaplayan metodu olusturunuz ve kullanınız.
    //2)Dikdörtgenin cvresini hesaplayan metodu olusturunuz ve kullanınız.
    //3)Dairenin alanını hesaplayan metodu olusturunuz ve kullanınız.




    }


