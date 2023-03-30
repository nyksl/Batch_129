package day22staticblocksconstructors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTime01Tkr {

    public static void main(String[] args) {

        Date myDate = new Date();
        System.out.println(myDate);//Sat Jan 14 18:54:16 EET 2023

        System.out.println(myDate.getTime());//1673711731741


        //İcinde bulundugumuz an nasil alinir?
        System.out.println(LocalDate.now());//2023-01-14

        System.out.println(LocalTime.now());//18:58:16.831885800

        System.out.println(LocalDateTime.now());//2023-01-14T18:59:26.834197800

        System.out.println(LocalDateTime.now().atZone(ZoneId.of("Europe/Vienna")));//2023-01-14T19:03:05.877747600+01:00[Europe/Vienna]
        System.out.println(LocalDateTime.now(ZoneId.of("Asia/Tokyo")));//2023-01-15T01:13:13.482829100
        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Moscow")));//2023-01-14T19:13:13.482829100

        //İleriki bir tarihe nasil gidilir?
        System.out.println(LocalDate.now().plusYears(7).plusMonths(5).plusDays(35));//2030-07-19

        //Geri tarihe nasil gidilir?

        System.out.println(LocalDate.now().minusYears(4).minusMonths(3).minusDays(2));//2018-10-12

        //İleriki bir zamana nasil gidilir?
        System.out.println(LocalTime.now().plusHours(3));//22:22:59.189268

        //Geri bir zamana nasil gidilir?
        System.out.println(LocalTime.now().minusMinutes(45));//18:39:17.540776800

        //Zaman'da belli bir bolumu nasil aliriz?
        System.out.println(LocalTime.now().getHour() +":"+ LocalTime.now().getMinute());//19:26

        //Tarih'de belli bir bolumu nasil aliriz?
        System.out.println(LocalDate.now().getMonth() +":" + LocalDate.now().getDayOfMonth());//JANUARY:14

        //İki tarih nasil karsilastirilir?
        //02/13/2005 - 03/01/2007 isBefore()once mi? karsılastırdik
       boolean result= LocalDate.of(2005,02,13).isBefore(LocalDate.of(2007,03,01));

        System.out.println(result);//true

        //Tarih'lerin formatlari nasil degistirilir?
        //M==>Tek rakamla ay no'sunu yazar --MM==>iki rakamla ay no'sunu yaar
        //MMM==Ay isminin ilk ve harfini yazar --MMMM==>Ay isminin tamamini yazar.

        //yy==>Yilin son iki rakamini yazar - yyyy==> Yilin tamamini yaar

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println(dtf.format(LocalDate.now()));//14/01/2023







    }
}
