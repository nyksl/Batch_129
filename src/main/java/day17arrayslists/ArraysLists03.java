package day17arrayslists;

import java.util.ArrayList;
import java.util.List;

public class ArraysLists03 {
    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("İstanbul");
        cities.add("Kayseri");
        cities.add("Almaty");
        cities.add("Kayseri");//remove(Object) methodu ileilk gorunumunu siler

        //remove() methodu index ile kullanilirsa o index'teki elemani siler.
        String n = cities.remove(1);
        System.out.println(n);//İstanbul'u sildigini yazdirir
        System.out.println(cities);


        //remove() methodu eleman ile kullanlırsa ilk gorunumunu siler
        //remove() methodu eleman ile kullanilirsa size o elemani silip silmedigini ifade eden
        //true veya false verir.
        //Eger eleman List'te var ise o elemani siler ve size true der.
        //Eger eleman List'te yok ise o elemani silemediginden  size false der.
       boolean p =  cities.remove("Kayseri");
        System.out.println(p);//true
        System.out.println(cities);//[Miami, Almaty, Kayseri]
    }

}
