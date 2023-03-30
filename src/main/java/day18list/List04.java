package day18list;

import java.util.ArrayList;
import java.util.List;

public class List04 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Ajda");
        names.add("Cuneyt");
        names.add("Mahsun");
        names.add("Muslum");
        names.add("Orhan");

        List<String> fameless = new ArrayList<>();

        fameless.add("Ajda");
        fameless.add("Emel");

        //names.containAll(females)"names" listinde "females" listindeki"tum elemanlarin" var olup olmadigini kontrol eder.
        // Tamami varsa size"true" verir, herhangi biri yoksa size false verir.
        boolean r = names.containsAll(fameless);//nemas'in icinde "Ajda" ve "Emel" var mı?
        System.out.println(r);
        //names.subList(1,4) "names" Listindeki index'in 1, 2 ve 3 olan
        // elemanlari bir List'in icinde size verir.
        // Ikinci index olan 4 dahil olmaz.
       List<String> sublist =  names.subList(1,4);
        System.out.println(sublist);//[Cuneyt, Mahsun, Muslum]

        names.retainAll(fameless);//iki list karsılastırır olmayan elemanlari siler.
                                  // iki küme arasinda ortak elemanlari gormek icin retainAll()kullanilir.
        System.out.println(names);//[Ajda]
        System.out.println(fameless);//[Ajda,Emel]

        //Example 1: Elektronik aletler ve ev aletleri listeleriniz var
        //Elektronik ev aletlerini listeleyiniz.
        List<String> electronics = new ArrayList<>();
        electronics.add("Tv");
        electronics.add("Radio");
        electronics.add("Refrigarator");
        electronics.add("Mobil Phone");
        electronics.add("Notebook");

        List<String> homeGoods = new ArrayList<>();
        homeGoods.add("Carpet");
        homeGoods.add("Fork");
        homeGoods.add("Radio");
        homeGoods.add("Chair");
        homeGoods.add("Tv");

        //homeGoods.retainAll(electronics) homeGoods ile electronics
        // list'lerinin ortak elemanlarini homeGoods listi icinde verir.
        //Baska bir degisle(İn other words) homeGoodslistindeki ortak olmayan elemanlari siler.
        homeGoods.retainAll(electronics);
        System.out.println(homeGoods);//[Radio, Tv]
        //isEmpty() List'te hic eleman yoksa true verir. Listte bir veya daha fazla eleman varsa folse verir
        //isEmpty(); esasinda "names.size()==0" demektir.
        names.isEmpty();

        System.out.println(names.hashCode());//2041509



    }
}
