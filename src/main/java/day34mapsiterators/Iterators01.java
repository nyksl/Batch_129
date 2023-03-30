package day34mapsiterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {

    public static void main(String[] args) {

    /*
     Iterators'lar Loop'ların yaptığı işi yapar.Iteratorslar tıpkı loop'ta olduğu gibi elemanı alarak işleme sokar.
     Javanın Iterators'ları ortaya çıkarma sebebi sonsuz Loop tehlikesidir.
     Sonsuz Loop'lar memory dolana kadar çalışmaya devam eder. Application bu süreçte donar.
     Buna Java'da "fire of the day" denir.
     Iterator'larda sonsuz loop yoktur.Iterator'lar Java tarafından sonradan oluşturulmuşlardır.
     Loop'ların yaptıkları bütün işlemleri yaparlar.
     Loop'lar ile Iterator'larin performans farki yoktur ama Iterator'lar eleman silme ve update etmede daha basarilidirlar.
 Iki tip Iterator var;
    i)Iterator: Sadece elemanlari remove edebilirsiniz.
             Sadece soldan saga calisir yani tek yonludur.
    ii)ListIterator: Elemani "remove etme", "update etme" ve "add" yapabilirsiniz.
                  Hem soldan saga hem de sagdan sola calisabilir yani cift yonludur.


                  Iterator'larin update etme ozelligi olmadigi icin degistirilmesini
                  istemedigimiz datalari bu sekilde kullanabiliriz

   */
        List<String> list1 = new ArrayList<>();
        list1.add("Ali");
        list1.add("Can");
        list1.add("Aliye");

        Iterator<String> itr1 = list1.iterator();

        while (itr1.hasNext()) {

            itr1.next();
            itr1.remove();


        }
        System.out.println(list1);//[]

        List<String> list2 = new ArrayList<>();
        list2.add("Ali");
        list2.add("Can");
        list2.add("Aliye");
        System.out.println(list2);

        ListIterator<String> listItr = list2.listIterator();

        while (listItr.hasNext()) {

            String el = listItr.next();

            listItr.set(el + "!");

        }
        System.out.println(list2);//[Ali!, Can!, Aliye!]

        List<String> list3 = new ArrayList<>();
        list3.add("Ali");
        list3.add("Can");
        list3.add("Aliye");
        System.out.println(list3);

        ListIterator<String> listItr2 = list3.listIterator();

        while (listItr2.hasNext()) {
            listItr2.next();
        }

        while (listItr2.hasPrevious()) {

            String el = listItr2.previous();

            System.out.println(el + "<==");//Aliye<==
                                           //Can<==
                                           //Ali<==


        }


    }
}
