package day22staticblocksconstructors;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

public class DateTime01 {

    public static void main(String[] args) {

        //Date Class
        Date myDate = new Date();
        System.out.println(myDate);//Sat Jan 07 23:26:50 EET 2023
        System.out.println(myDate.getTime());//1673123344425==> 1 ocak 1970'den su ana kadar ki mili saniye miktari

        //İcinde bulundugumuz an nasil alinir?
        System.out.println(LocalDate.now());//2023-01-07

        System.out.println(LocalTime.now());//23:34:45.260797400

        System.out.println(LocalDateTime.now());//2023-01-07T23:36:22.390025200

        //Dunyanin herhangi bir saat dilimindeki saati nasil aliriz?
        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Vienna")));//2023-01-07T21:44:58.488304100
        System.out.println(LocalDateTime.now(ZoneId.of("Asia/Tokyo")));//2023-01-08T05:45:44.795699400
        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Moscow")));//2023-01-07T23:46:47.681673500

        //İleriki bir tarihe nasil gidilir?
        System.out.println(LocalDate.now().plusYears(7).plusMonths(5).plusDays(35));//2030-06-12

        //Geri taririhe nasil gidilir?
        System.out.println(LocalDate.now().minusYears(4).minusMonths(3).minusDays(2));//2018-10-05

        //İlerki bir zamana nasil gidilir?
        System.out.println(LocalTime.now().plusHours(3));//02:56:43.618611500

        //Geri bir taririhe nasil gidilir?
        System.out.println(LocalTime.now().minusMinutes(45));//23:13:43.394353700

        //Zaman'da belli bir bolumu nasil aliriz?
        System.out.println(LocalTime.now().getHour() + ":" + LocalTime.now().getMinute());//0:4

        //Tarih'de belli bir bolumu nasil aliriz?
        System.out.println(LocalDate.now().getMonth() + ":" + LocalDate.now().getDayOfMonth());//JANUARY:8

        //İki tarih nasil karsilastirilir?
        //02/13/2005 - 03/01/2007
        boolean result = LocalDate.of(2005,02,13).isBefore(LocalDate.of(2007,03,01));
        System.out.println(result);//true

        //Tarih'lerin formatlari nasil degistirilir?
        //M==>Tek rakamla ay no'sunu yazar --MM==>iki rakamla ay no'sunu yaar
        //MMM==Ay isminin ilk ve harfini yazar --MMMM==>Ay isminin tamamini yazar.

        //yy==>Yilin son iki rakamini yazar - yyyy==> Yilin tamamini yaar
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");//offPattern kalip demek

        System.out.println(dtf.format(LocalDate.now()));//08/01/2023


        LocalTime time = LocalTime.now();
        System.out.println(time.plusMinutes(11));




    }



}
