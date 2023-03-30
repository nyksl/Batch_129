package day28exceptions;

public class Exceptions01 {

    public static void main(String[] args) {
       /*
        1)Exceptions demek beklenmedik problem demektir. Seyehat halinde benzin'in bitmesi, arabanin bozulmasi gibi...
        2)Gercek hayatta karsilastigimiz beklenmedik problemler icin cozum yollari vardir.
          Mesela benzin bitince Yol yardim'i arariz
          Applicationlarda da beklenmedik problemler icin cozum yollari uretmeliyiz,
          bu isleme "Exception Handling" denir.
        3)Exception'lar temel olarak ikiye ayrilirlar.
          i)Compile Time Exception:Siz kod yazarken farkedilir ve yazdiginiz kodun alti kirmizi cizgi ile cizilir.
          ii)Run Time Exception: Siz code yazarken fark edilmez ama, Codu calistirdiginizda consol'da hata aliriz.
        4)Exceptionlar'lar disinda "error" diye adlandirdigimiz "handle edilemeyen" problemler vardir.
          Gercek hayatta soforun olmesi gibi handle(ustesinden gelme)yecek edilemeyecek durumlar "Error" dur.
          Application'larda "Memory" nin dolmasi "Error" dur.
          Iki tur memory vardir;
          i)Stack Memory: dolarsa "StackMemorynFlow Error" alirsiniz.
          ii)Heap Memory: dolarsa "OutOfMemory Error" alirsiniz.
        5)Yazdiginiz kod calismadiginda problemi bulmak icin "Log" lara bakariz.
        6)if else kullanirsak olusacak her problemi spesifik olarak tum ihtimalleri gozetmemiz gerekir.
          Buda ciddi bir matematik bilgisi gerektirir, ve yazacaginiz kodu cok uzatir.
          Ama try catch'te Java ilgili Exception ile alakali olusabilecek butun problemleri yakalar.

 */
        int a = 12;
        int b = 0;

        divide(a, b);//divide-bolme

        divide2(a, b);
    }

    //ArithmeticException yazdiginiz code'da matematiksel islem kullaniyorsaniz alinabilecek bir Exception'dir.
    //Nasil handle edilecegini asagida yazdik.
    public static void divide(int a, int b){

        try{//deneyin demek
            System.out.println(a / b);//4
            System.out.println("I am here");
        }catch (ArithmeticException e){
            System.out.println("Do not divide by zero");
       }
        System.out.println("You are here");
    }
    //"Exception Handlin"de if-else kullanilmazBakiniz 6.Note
    public static void divide2(int a, int b){

        if (b==0){
            System.out.println("Do not divide by zero");
        }else {
            System.out.println(a/b);
        }
    }
}
