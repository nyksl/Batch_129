package day18list;

import java.util.ArrayList;
import java.util.List;

public class List04Tekrar {

    public static void main(String[] args) {

        List<String > names = new ArrayList<>();

        names.add("Ajda");
        names.add("Cuneyt");
        names.add("Mahsun");
        names.add("Muslum");
        names.add("Orhan");

        List<String>females = new ArrayList<>();
        females.add("Ajda");
        females.add("Emel");

        //
        boolean r = names.containsAll(females);
        System.out.println(r);
    }
}
