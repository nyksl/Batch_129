package day17arrayslists;

import java.util.ArrayList;
import java.util.List;

public class ArraysList03Tekrar {

    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("İstanbul");
        cities.add("Kayseri");
        cities.add("Almaty");
        cities.add("Kayseri");

        String n = cities.remove(1);
        System.out.println(n);//İstanbul
        System.out.println(cities);//[Miami, Kayseri, Almaty]

       boolean p=  cities.remove("Kayseri");//Kayseri'yi siler
        System.out.println(p);//true
        System.out.println(cities);//[Miami, Almaty]
    }
}
