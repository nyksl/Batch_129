package day34mapsiterators;

import java.util.HashMap;

public class HashMapMachanism {

    /*
        1)Siz HashMap olusturmak icin "HashMap<String, Integer> hm = new HashMap<>();" kodunu yazdiginizda Java
          16 tane "bucket(kova)" olusturur ve bu "bucket" lari 0 dan 15 e kadar index'ler.
        2)Siz eleman eklemek icin "hm.put("Istanbul", 17000000);" kodunu yazdiginizda Java;
          i)"key" icin "hashCode" uretir.
          ii)"hashCode" u 16 ya boler
          iii)Kalani index olarak kullanip, index'i kalana esit olan bucket'a bu "entry" i yerlestirir.
          iv)Bucket'a "entry" eklenirken, Java o bucket icinde "LinkedList" yapisini kullanir.

     */

    public static void main(String[] args) {

        HashMap<String, Integer>hm = new HashMap<>();

        hm.put("İstanbul",17000000);
        hm.put("Miami",50000000);
        hm.put("Moscow",100000000);
        hm.put("New Delphi",310000000);

        System.out.println(hm);

    }

}
