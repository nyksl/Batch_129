package day23datetimestringbuilder;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Datetime01Tkr {

    public static void main(String[] args) {

        //Example : Time'i formatlayiniz

        LocalTime myTime = LocalTime.now();
        System.out.println(myTime);//19:48:52.093141900
        //hh==>12'lik saat sistemini kullanir - HH==>24'luk saat dilimini kullanir
        //hh kullandiginizdaa AM veya PM demelisiniz, bunu demek icin "a" yazmaniz yeterlidir.
        //yani;"hh:mm a"
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH-mm");//boslu bırakıp a yazarsak pm verir

        System.out.println(dtf.format(myTime));//07-51 ÖS benim bulundum bölgede su an Öyleden sonra oldugu icin ÖS verdi


    }
}
