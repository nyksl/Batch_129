package day23datetimestringbuilder;

public class StringBuilder01 {

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

        //String'i degistirdikten sonra ayni String assign ederseniz, Java yine yeni bir container olusturur,
        //degismis degeri bu yeni container'in icine koyar ve eski container'i gosteren oku yeni container'a yonlendirir.
        //Dolayisiyla eski container adressiz kalir, ve "Garbage Collector" adressiz olan container'lari siler.
        String a = "Money";
        a = a + " More";

        //Mutable
        //StringBuilder kullanarak String uretmenin 1.Yolu:
        StringBuilder sb1 = new StringBuilder("Python");
        System.out.println(sb1);//Python

        sb1.append("!").append("?").append(".");
        System.out.println(sb1);//Python!?. Var olan string'i degistiriyor

        //StringBuilder kullanarak String uretmenin 2.Yolu:
        StringBuilder sb2 = new StringBuilder();
        System.out.println(sb2.length());//0  Hic karakter olmadigi icin 0 verdi
        //StringBuilder kullandiginizda baslangic kapasitesi 16 dir.
        //Kapasite asildiginda varolan kapasite nin iki fazlasi kadar varolan kapasiteye ekleme yapilir,
        // 16 ==> 16*2+2       -       34 ==> 34*2+2
        System.out.println(sb2.capacity());//16

        sb2.append("Java");
        System.out.println(sb2.length());//4 Dort karakter oldugu icin 4 verdi
        System.out.println(sb2.capacity());//16

        sb2.append("xxxxxxxxxxxxxxx");
        System.out.println(sb2.length());//19 15 tane x 4 tane Java 19
        System.out.println(sb2.capacity());//34 = 16*2+2 Var olan kutu sayisinin 2 katinin 2 fazlasi
        //

        sb2.append("yyyyyyyyyyyyyyyy");
        System.out.println(sb2.length());//35
        System.out.println(sb2.capacity());//34*2+2 ==> 70

        //StringBuilder kullanarak String uretmenin 3. Yolu:
        StringBuilder sb3 = new StringBuilder(2);//capacity Standart olarak 16 verir
        // ama biz deger atarsak var olan deger kadar ekler


        sb3.append("Flo");
        System.out.println(sb3.length());//3
        System.out.println(sb3.capacity());//6

        //insert() methodu verilen sayi karakteri kadar es gecip istenen characteri eklemeye yarar.
        //insert() methodu append() gibi StringBuilder'i direkt degistirir
        sb3.insert(2,"XXXXX");//FlXXXXXo
        System.out.println(sb3.length());//9
        System.out.println(sb3);

        //toString methodu StringBuilder'i String'e cevirir.
        //Sring Class'ta var olan ama StringBuilder'de var olmayan String method gibi
        // methodlara ihtiyac duydugumuzda toString method kullanarak String Class gecer ve o method'lari kullaniiz.
         sb3.toString().split("l");

         //toString()ile String'e cevirdigimizi tekrar StringBilder'e cevirebilirsiniz.
          StringBuilder sb4 = new StringBuilder(sb3);

        //reverse() method'u String 'leri ters cavirir.
        sb3.reverse();
        System.out.println(sb3);//oXXXXXlF

        //deleteCharAt(1); index'teki charecter'i siler.
        sb3.deleteCharAt(1);
        System.out.println(sb3);//oXXXXlF

        //delete(1,6); index 1 deki character'den index 5(6 dahil olmadigi icin 5 yazdim) deki
        //characterler'e tum characterleri siler.
         sb3.delete(1,6);
        System.out.println(sb3);//oF

        StringBuilder sb5 = new StringBuilder("hava");
        StringBuilder sb6 = new StringBuilder("Java");
        //sb.compareTo(sb6) method'u sb5 ile sb6 alphabetic siralama olarak karsilastirir.
        //sb5 alphabetic siralamasi once ise sonuc negative olur, sonra ise sonuc positive olur.
        System.out.println(sb5.compareTo(sb6));//-2(H-J'den iki harf once h kucuk harf olsaydi ascii degerini)

        //sb6.setCharAt(2, 'm'); index 2'deki Characret'i 'm' ye cevirir
        sb6.setCharAt(2, 'm');
        System.out.println(sb6);//Jama

        sb6.replace(1, 3, "xyz");
        System.out.println(sb6);//Jxyza

        //StringBuilder Class'da kullanmamiza izin verilen  substring() method gibi bazi String Class methodlari vardir,
        //bu method'lari StringBuilder ustunde kullaninca StringBuilder'in orjinal degeri degismez.
        sb6.substring(1, 3);
        System.out.println(sb6);//Jxyza

    }
}


