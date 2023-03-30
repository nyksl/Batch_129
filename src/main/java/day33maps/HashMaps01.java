package day33maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMaps01 {


    /*
        1) Map'ler "USA = 400,000,000" seklinde data depolamamiz gerktiginde kullanilir.
        2) "USA = 400,000,000" data'sinin "USA" kismi "key" olarak adlandirilir ve "key" ler "unique" dir.(Benzersiz)
        3) "USA = 400,000,000" data'sinin "400,000,000" kismi "value" olarak adlandirilir ve "value" ler "tekrarli" olabilir.
        4) Map'lerde depoladiginiz herbir data'ya "Entry" denir, "Eleman" denmez.
        5) "Entry" ler "unique" dir cunku "key" kisimlari "unique" oldugundan herbir "Entry" digerlerinden farklidir.

        6)"HashMap" cok hizlidir cunku "HashMap" ler "entry" leri siralamak ile ugrasmazlar.
        7)"HashMap"lerde bir tane "key" i "null" yapabilirsiniz.
        8)"HashMap"lerde birden fazla tane "value" u "null" yapabilirsiniz.
        9)"HashMap" ler "multi thread" icin kullanilamaz ve "synchronization" yoktur.

     */

    public static void main(String[] args) {
        //HasMap nasil olusturulur?
        HashMap<String,Integer> hm =new HashMap<>();
        System.out.println(hm);// {}

        //HAsMap'lere nasil entry eklenir?
        hm.put("USA", 400000000);
        hm.put("Germany",85000000);
        hm.put("Albania",3000000);
        //Ayni "key" i kullarak yeni bir "entry" eklerseniz var olan "value" u update etmis olursunuz.
        hm.put("Albania",2800000);
        hm.put(null,12000000);
        hm.put(null,180000000);//ikinci entry'i yani son yazilan "null key"'inin valuesini veriyor.tekrarliya müsade etmiyor
        hm.put("Myanmar",null);
        hm.put("Bhutan",null);
        System.out.println(hm);// {null=180000000, Myanmar=null, USA=400000000, Bhutan=null, Germany=85000000, Albania=2800000}
        //Key'ler icin null 1 tane veriyor tekrara yani ikinciye izin vermiyor kabul etmiyor
        // null' Value'ler icin kabul ediyor. ikinci null'i veriyor.

        //HasMap'lerde sadece key'leri almak istiyorum
        Set<String> hmKeys = hm.keySet();//key'leri bana set olarak verecek.tekrarsizlari set'e koyuyor.
        System.out.println(hmKeys);//[null, Myanmar, USA, Bhutan, Germany, Albania]


        //HashMap'lerde sadece "value" lari almak istiyorum
        //Example 1: hm Map'indeki ulkelerin toplam nufusunu bulunuz.
        Collection<Integer> hmValues = hm.values();
        int sum = 0;
        for (Integer w : hmValues) {
            if (w!=null)//null Integer olmadigi icin toplama yapmaz hata verir
                        // ama biz if() ile w null degilse dedik toplamayi yaptik
            sum = sum + w;
        }
        System.out.println(sum);// 667800000

        //HashMap'lerde belirli bir "key" nin "value" sunu nasil alabiliriz?
        Integer usaPopulation = hm.get("USA");//get() key'e git values'ini bana ver demek
        System.out.println(usaPopulation);// 400000000

        //HashMap'lerde replace() methodu varolan bir "key" nin "value"sunu degistirmek icin kullanilir.
        hm.replace("Bhutan",35000000);
        System.out.println(hm);//{null=180000000, Myanmar=null, USA=400000000, Bhutan=35000000, Germany=85000000, Albania=2800000}

        //putIfAbsent() yoksa ekle demek. "Usa" key'de oldugu icin value'yi degistirmedi
        hm.putIfAbsent("USA",700000000);//
        System.out.println(hm);//{null=180000000, Myanmar=null, USA=400000000, Bhutan=35000000, Germany=85000000, Albania=2800000}

        //benim map'imde "India" key'de olmadigi icin ekledi. (Yoksa ekle demek)
        hm.putIfAbsent("India",700000000);//
        System.out.println(hm);
        //{null=180000000, Myanmar=null, USA=400000000, Bhutan=35000000, Germany=85000000, Albania=2800000, India=700000000}


        //Example 2: Yeni ogretmenin maasi standart ucretten(10000) 1000TL fazla, eski ogretmenin maasi standart ucretten 2000TL fazla olsun
        HashMap<String, Integer> salaries = new HashMap<>();

        salaries.put("Ali",8000);
        salaries.put("Ayse",5000);
        salaries.put("Veli",9000);
        salaries.put("Tom",9900);

        String teacherName = "Kemal";// teacherName'e (Kemal) yazarsak yeni ogretmeni eklemis olacagiz
        if (salaries.keySet().contains(teacherName)) {
            salaries.put(teacherName, 12000);// Eski var olan ogretmenin maasini degistirecek
        }else {
            salaries.putIfAbsent(teacherName, 11000);//putIfAbsent() Yeni ogretmen ekledigimizde maasi ile birlikte eklicek

        }
        System.out.println(salaries);//{Tom=9900, Veli=9000, Ayse=5000, Kemal=11000, Ali=8000}
        //replace(key,oldvalue,newvalue)method'u key "USA" ve value "400000000" ise yeni value'yi "500000000" yapar
        hm.replace("USA",400000000,500000000);
        System.out.println(hm);//{null=180000000, Myanmar=null, USA=500000000, Bhutan=35000000, Germany=85000000, Albania=2800000, India=700000000}

        //getOrDefault() olan "key"ler icin degerini verir olmayan "key"ler icin sizin ikinci parametreye yazdiginiz degeri verir
        Integer r = hm.getOrDefault("Bhutan",0);
        System.out.println(r);// 35000000 Bhutan listede olmasaydi 0 verecekti

        //entrySet() method'u Map'i Set'e cevirir.
        // Setler'in methodlrini kullanabilmek icin entrySet() method'u kallanarak Map'i Set'e cevirebiliriz.
        //map'i Set'e cevirdiginizde Set'in butun ozelliklerini kullanabiliriz. Mesela loop gibi.
        //entrySet(); methodunu kullandiginizda elde ettiginiz Set'in elemanlari Map.Entry<String,Integer> seklinde bir Map olur.
        //Bu yuzden elemanlar icin Map methodlari kullanilabilir
        Set<Map.Entry<String,Integer>> myEntries = hm.entrySet();
        System.out.println(hm);//{null=180000000, Myanmar=null, USA=500000000, Bhutan=35000000, Germany=85000000, Albania=2800000, India=700000000}

        //Example 3: Ulke ismindeki karakter sayisini ulke nufusuna ekleyen ve sonucu konsolayazdiran kodu yaziniz.

        for (Map.Entry<String,Integer> w : myEntries) {
        //
            if (w.getValue()!=null && w.getKey()!=null) {

                int toplam = w.getValue() + w.getKey().length();
                System.out.println(toplam);
            }

        }








    }
}
