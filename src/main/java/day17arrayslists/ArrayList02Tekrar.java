package day17arrayslists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02Tekrar {

    public static void main(String[] args) {

        //ArrayList olustururken sag tarafa (constructor) ArrayList yazmak zorundasiniz.
        //Ama sol tarafa ister "ArrayList" yazin isterseniz de "List" yazin,ikisi de calisir.
       List<Character> initials = new ArrayList<>();
       initials.add('A');
       initials.add('B');
       initials.add('M');
       initials.add('B');

       int numOffElement = initials.size();
        System.out.println(numOffElement);//4

        char t = initials.get(2);
        System.out.println(t);//M

        //Example 1: Verilen bir String List'teki elemanlarin toplam karakter sayisini bulan kodu yaziniz.
        List<String>ct = new ArrayList<>();

        ct.add("Miami");
        ct.add("İstanbul");
        ct.add("Kayseri");
        ct.add("Almaty");

        int sum = 0;//Veriable
        for (String w : ct){
            sum=sum+ w.length();
        }
        System.out.println(sum);//26

        //2.Yol
        int tp = 0;

        for (int i=0; i<ct.size(); i++){

            tp = tp + ct.get(i).length();
        }
        System.out.println(tp);//26

        ct.set(0,"New York");//İstenilen bir elemani degistirmek icin kullanilir.

        System.out.println(ct);//[New York, İstanbul, Kayseri, Almaty]

        //Example 2: Maas List'i olusturunuz ve maaslara %20 zam yapiniz.

        List<Double> salary = new ArrayList<>();

        salary.add(19500.25);
        salary.add(8500.75);
        salary.add(32500.5);
        System.out.println(salary);//[19500.25, 8500.75, 32500.5]

        //1.Yol:
        int idx = 0;
                       //[19500.25, 8500.75, 32500.5]
        for (Double w : salary){
           salary.set(idx,w*1.20);
           idx++;
        }
        System.out.println(salary);//[23400.3, 10200.9, 39000.6]


        //2.Yol:
        for (int i=0; i<salary.size(); i++){
            salary.set(i,salary.get(i)*1.20);
        }
        System.out.println(salary);//[23400.3, 10200.9, 39000.6]



    }
}
