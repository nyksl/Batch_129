package practicennighttime.nighttime10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CollectionsMethods {

    // Kullanıcıdan 5 sayıdan olusan
    // bir liste isteyin.
    // listeyi sirala ve tersten yazdir
    // listeyi karıştırin ve yazdırin
    // 3'er sağa kaydirin ve yazdırin
    //maxsimum ve minumum sayiyi bulun ve yazdirin
    //tüm maxsimum sayilarn yerine minimum sayilari yazdir

    public static void main(String[] args) {

        ArrayList<Integer> arrList = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Lutfen bir sayi giriniz...");

            arrList.add(input.nextInt());
        }
        System.out.println("arrLst" + arrList);//arrLst[4, 5, 6, 7, 8]

        // listeyi sirala ve tersten yazdir
        arrList.sort(Collections.reverseOrder());

        System.out.println("tersten arrList = " + arrList);//tersten arrList = [8, 7, 6, 5, 4]

        // listeyi karıştırin ve yazdırin

        Collections.shuffle(arrList);//shuffle rondom olarak karistirir
        System.out.println("karistir arrList = " + arrList);//karistir arrList = [8, 4, 6, 5, 7]

        // 3'er sağa kaydirin ve yazdırin

        Collections.rotate(arrList,3);
        System.out.println("3 saga kaydiktan sonra arrList = " + arrList);//3 saga kaydiktan sonra arrList = [6, 5, 7, 8, 4]

        Integer max = Collections.max(arrList);//maximum sayiyi aldik
        Integer min = Collections.min(arrList);//minimum sayiyi aldik

        System.out.println(max);//8
        System.out.println(min);//4

        Collections.replaceAll(arrList, max, min);
        System.out.println("max degerlerin yerine min geldikten sonra arrList =" + arrList);//max degerlerin yerine min
                                                                                            // geldikten sonra arrList =[4, 4, 7, 6, 5]





    }

}

