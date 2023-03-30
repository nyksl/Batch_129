package day32collections;

import java.util.LinkedHashSet;

public class LinkedHashSet01 {

    public static void main(String[] args) {

        //LinkedHashSet olusturma
        LinkedHashSet<String> artist = new LinkedHashSet<>();
        artist.add("Ajda");
        artist.add("Tom");
        artist.add("Bradd");
        artist.add("Angelina");
        artist.add("Tom");// Set oldugu icin tekrarsiz eleman icerirler
                          // siz ayni elemani tekrar tekrar eklerseniz Java hata vermez,
                          // ama tekrarli eklenen elemani "set"e sadece bir kere koyar. ustune yazar
        System.out.println(artist);//[Ajda, Tom, Bradd, Angelina]

        LinkedHashSet<String> actress = new LinkedHashSet<>();
        actress.add("Ajda");
        actress.add("Angelina");

        artist.removeAll(actress);//Ajda ve Angelina'yi yani coklu eleman sildik.
        System.out.println(artist);//[Tom, Bradd]

    }
}
