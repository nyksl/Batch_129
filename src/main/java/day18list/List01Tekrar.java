package day18list;

import java.util.ArrayList;
import java.util.List;

public class List01Tekrar {

    public static void main(String[] args) {

        //Example 1: Integer bir List olusturunuz
        //           List'e 5 tane eleman ekleyiniz
        //           Bu elemanlardan 12'yi siliniz.

        List<Integer> ages = new ArrayList<>();

        ages.add(15);
        ages.add(22);
        ages.add(12);
        ages.add(9);
        ages.add(12);

//        Integer nonPrimitive = 12;
//        ages.remove(nonPrimitive);
//        System.out.println(ages);//[15, 22, 9, 5]// ilkini siliyor

         ages.remove((Integer) 12);
         System.out.println(ages);//[15, 22, 9, 5]//ilkini siler

//        ages.remove(Integer.valueOf(12));//valueOf methodu primitive olan 12 'yi wrapper class'a cevirir remove ise siler
//        System.out.println(ages);//[15, 22, 9, 5]//ilk

//        ages.remove(ages.indexOf(12));//indexOf 12'nin ilk gorunumunu alacak remove ise silecek.
//        System.out.println(ages);//ilk gorunumu siler

        //Example 2: Integer bir List olusturunuz
        //           List'e 5 tane eleman ekleyiniz
        //           Tum 12'leri siliniz.
        //

        List<Integer> nm = new ArrayList<>();

        nm.add(15);
        nm.add(22);
        nm.add(12);
        nm.add(9);
        nm.add(12);

        List<Integer>sil = new ArrayList<>();
        sil.add(12);
        nm.removeAll(sil);
        System.out.println(nm);//[15, 22, 9]


    }
}
