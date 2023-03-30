package day23datetimestringbuilder;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Datetime01 {
    public static void main(String[] args) {
        //Example : Time'i formatlayiniz
        LocalTime myTime = LocalTime.now();
        System.out.println(myTime);//21:38:53.291079

        //hh==>12:'lik saat dilimini kullanir  - HH==>24'luk saat sistemini kullanir.
        //hh kullandiginizda AM veya PM demelisiniz, bunu demek icin "a
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh-mm a");//PM yazdırmak icin bosluk birakip "a" yazilirsa pm yazar
        System.out.println(dtf.format(myTime));//09-43 PM


    }
}
