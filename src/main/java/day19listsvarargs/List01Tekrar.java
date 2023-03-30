package day19listsvarargs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List01Tekrar {

    public static void main(String[] args) {

        //Example 1: Verilen bir List'teki elemanlari tekrarsiz olarak yazdiriniz.
        //           [2, 3, 2, 2, 3, 5] ==> [2, 3, 5]

        List<Integer> myList = new ArrayList<>();

        myList.add(2);
        myList.add(3);
        myList.add(2);
        myList.add(2);
        myList.add(3);
        myList.add(5);

        List<Integer> newList = new ArrayList<>();

        for (Integer w : myList){

            if (!newList.contains(w)){
                newList.add(w);
            }
        }
        System.out.println(newList);

        //Example 2: Musteriden urun ismini aliniz
        //           Musterinin ismini verdigi urun listede varsa urunun ismini yazdiriniz
        //           Musterinin ismini verdigi urun listede yoksa "Out of stock" yazdiriniz

        Scanner input = new Scanner(System.in);
        System.out.println("Urun arama sistemimize hosgeldiniz...");
        System.out.println("Urun aramayi sonlandirmak icin Q ya basiniz...");

        List<String> products = new ArrayList<>();
        products.add("TV");
        products.add("Radio");
        products.add("İpad");
        products.add("PC");
        products.add("Notebook");
        products.add("Mobile Phone");

        do {
            System.out.println("Aradiginiz urunun ismini giriniz...");
            String p = input.nextLine();

            if (p.equalsIgnoreCase("Q")){
                break;
            }else if (products.contains(p)){
                System.out.println(p + " Stokta var");
            } else if (!products.contains(p)) {
                System.out.println(p + " Stoklar tukendi");
            }
        }while (true);
        System.out.println("Sisteimizi kullandiginiz icin Tesekkur ederiz..");


    }
}
