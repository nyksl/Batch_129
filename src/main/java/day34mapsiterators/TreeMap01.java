package day34mapsiterators;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMap01 {

    /*
      1)TreeMap entry'leri "key" lere gore "natural order" a koyar.
      2)TreeMap cok yavastir cunku "natural order" yapmak cok zaman ister.

    */

    public static void main(String[] args) {

        TreeMap<String,Integer> stAges = new TreeMap<>();

        long one =System.nanoTime();
        stAges.put("Ali",21);
        stAges.put("Ayse",21);
        stAges.put("Kemal",21);
        stAges.put("Murat",21);
        //"key" lere gore alfabetik sira yapti
        System.out.println(stAges);//{Ali=21, Ayse=21, Kemal=21, Murat=21}

        long two =System.nanoTime();

        HashMap<String,Integer> stAges2 = new HashMap<>();

        stAges.put("Ali",21);
        stAges.put("Ayse",21);
        stAges.put("Kemal",21);
        stAges.put("Murat",21);

        System.out.println(stAges2);

        long three =System.nanoTime();

        HashMap<String,Integer> stdAges3 = new HashMap<>();

        stdAges3.put("Ali",21);
        stdAges3.put("Kemal",19);
        stdAges3.put("Ayse",25);
        stdAges3.put("Murat",22);

        TreeMap<String ,Integer> stdAges4 = new TreeMap<>(stdAges3 );

        System.out.println(stdAges4);//{Ali=21, Ayse=25, Kemal=19, Murat=22}

        long four = System.nanoTime();

        System.out.println("TreeMap:" + (two-one));//TreeMap:496600
        System.out.println("HashMap:" + (three-two));//HashMap:56500
        System.out.println("HashMap --> TreeMap:" + (four-three));//HashMap --> TreeMap:69800



    }
}
