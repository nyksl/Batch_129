package day17arrayslists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList01Tekrar {

    public static void main(String[] args) {

        //List nasil olusturulur?
        ArrayList<Integer>ages = new ArrayList<>();



        //List'lere eleman nasil eklenir?
        ages.add(9);
        ages.add(12);
        ages.add(10);
        ages.add(888);

        ages.add(1,656);//Araya eleman sokmak icin add.(index element methodu kullanilir.
        ages.add(3,777);//2.index sonrasindaki bosluk 3. indextir
        System.out.println(ages);//[9, 656, 12, 777, 10, 888]

        //List'e coklu eleman nasil eklenir? veya List'e baska bir List nasil eklenir.
        //Bir "List" eleman eklemek, o elemanlari once bir List'in icine koymalisiniz

        ArrayList<Integer> newAges = new ArrayList<>();

        newAges.add(8);
        newAges.add(9);
        newAges.add(10);

        ages.addAll(newAges);
        ages.addAll(2,newAges);//[9, 656, 8, 9, 10, 12, 777, 10, 888, 8, 9, 10]
        //index 2'ye 8,9,10'u yerlestirdik
        System.out.println(ages);//[9, 656, 12, 777, 10, 888, 8, 9, 10]

        boolean r =ages.contains(656);//true Bir elemanın List'te var olup olmadigini kontrol eder.
        System.out.println(r);

        ArrayList<String> names1 = new ArrayList<>();
        names1.add("Tom");
        names1.add("Jim");
        names1.add("Kim");

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Tom");
        names2.add("Kim");
        names2.add("Jim");

        boolean s= names1.equals(names2);
        System.out.println(s);

        //Example 1: Verilen iki Integer List'te tamamiyla ayni elemanlarin olup olmadigini
        //           kontrol eden kodu yaziniz.

        ArrayList<Integer> nm = new ArrayList<>();

        nm.add(8);
        nm.add(10);
        nm.add(9);

        ArrayList<Integer> nm2 = new ArrayList<>();

        nm2.add(8);
        nm2.add(9);
        nm2.add(10);

        Collections.sort(nm);
        Collections.sort(nm2);

        boolean c = nm.equals(nm2);

        System.out.println(c);














    }

}
