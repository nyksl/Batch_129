package day23datetimestringbuilder;

public class StringBuilderTkr {

     /*
        Java'da String, "String Class" kullanilarak veya "StringBuilder Class" kullanilarak olusturulabilir.
        "String Class" kullanarak urettiginiz String'ler "Immutable"(Degistirilemez) dir.
        "StringBuilder Class" kullanarak urettiginiz String'ler "Mutable"(Degistirilebilir) dir.
     */

    public static void main(String[] args) {
        //Immutable
        String s = "Java";

       String t = s + "!";
       String w = t + "?";

       String a = "Money";
       a = a + "More";

       //Mutable
        //1.Yol StringBuilder kullanarak String uretmenin 1.yolu
        StringBuilder sb = new StringBuilder("Python");
        System.out.println(sb);//Python
        sb.append("!").append("?").append(".");
        System.out.println(sb);//Python!?. Var olan string'i degistiriyor

        //StringBuilder kullanarak String uretmenin 2.yolu
        StringBuilder sb2 = new StringBuilder();//Olusturdugumuzda otomatik 16 tane bos kutu verir.
        System.out.println(sb2.length());//0 Hic deger vermedigimiz icin 0 verdi
        System.out.println(sb2.capacity());//16 capacity() bize 16

        sb2.append("Java");
        System.out.println(sb2.length());//4 Dort karakter oldugu icin 4 verdi
        System.out.println(sb2.capacity());//16

        sb2.append("xxxxxxxxxxxxxxx");
        System.out.println(sb2.length());//19 15 tane x 4 tane Java 19
        System.out.println(sb2.capacity());//34

        sb2.append("yyyyyyyyyyyyyyyy");
        System.out.println(sb2.length());//35 19'a 16 ekledi 35 yapti
        System.out.println(sb2.capacity());//34*2+2 ==> 70

        //StringBuilder kullanarak String uretmenin 3.yolu
       StringBuilder sb3 = new StringBuilder(2);

       sb3.append("Flo");
        System.out.println(sb3.length());//3
        System.out.println(sb3.capacity());//6

        sb3.insert(2,"xxxxxx");//insert() Verilen degerin İstediginiz yerine istediginiz karakteri koyar
        System.out.println(sb3);//Flxxxxxxo
        System.out.println(sb3.length());//9

        sb3.toString().split("l");

        StringBuilder sb4 = new StringBuilder(sb3);

        sb3.reverse();
        System.out.println(sb3);//oxxxxxxlF

        sb3.deleteCharAt(1);//istedigimiz karakteri silmek icin
        System.out.println(sb3);//oxxxxxlF

        sb3.delete(1,6);//baslangic ve bitis index'ine gore siler.
        System.out.println(sb3);//olF

        StringBuilder sb5 = new StringBuilder("java");
        StringBuilder sb6 = new StringBuilder("Java");

        //alfabtik olarak karsilastirir.kucuk harf yaparsak j ile buyuk J arasinda asci degeri verir
        System.out.println(sb5.compareTo(sb6));//32

        sb6.setCharAt(2,'m');
        System.out.println(sb6);//Jama









    }

}
