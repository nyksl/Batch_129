package day05typecastingstringmanipılations;

public class TypeCasting01 {
    /*
    Numaric primitive data type'larini birbirine donusturulmesine "Type Casting" denir.
    Numaric(Sayısal) Data Type'lar; byte - short - int - long - float - double

    Not 1: Kucuk data type'lerini buyk data type'lerine cevirmeyi Java otomatik olarak yapabilir.
           Bu isleme "Autowidening"(Otomatik Genisletme) denir.
    Not 2: Buyuk data type'lerini kucuk data type'lerine cevirmek riskli bir istir. Java bu riskli isi
           otomatik olarak yapmaz.
           Bu islemi kod yazanlar yapar.
           Bu isleme "ExplicitNarrowing"(Acıktan daraltma) denir.



     */
    public static void main(String[] args) {

        //byte data type'nı int data type'ina ceviriniz
        byte age = 13;
        int ageInt = age; //AutoWidening

        //long data type'ini short data type'ine cevirelim
        long weight = 234;
        short weightShort = (short)weight;//Explicit Narrowing(Acık daraltma) (short) yazarak long'u short'a ceviriyoruz.

        //int data type'ini float data type'ine cevirelim
        int population = 700000;
        System.out.println(population);

        float populationFloat = population;
        System.out.println(populationFloat);

        //double data type'ini short data type'ine ceviriniz.

        double number = 12.934;
        System.out.println(number);

        short numberShort = (short)number;
        System.out.println(numberShort);

        //Dikkat!
        //Donusum yaptıgınız sayı(260) donusecegınız data type'ının sınırları dısında ise, Java kulandıgınız sayı ile "mod" islemi
        // yapar ve mod islemi sonucu sizin yeni degeriniz olur.
        short num = 260;
        System.out.println(num);

        byte numByte =(byte) num;
        System.out.println(numByte);// 4  byte degeri==> -128..-1.. 0..1..127 == 256 yapar 260/256=4

        //Example

        short n = 1023;
        System.out.println(n);

        byte nByte =(byte)n;
        System.out.println(nByte);//-1  1023/256*4 1024-1023=-1







    }
}
