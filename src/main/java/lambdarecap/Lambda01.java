package lambdarecap;

import java.util.*;

public class Lambda01 {
    public static void main(String[] args) {

        List<Integer> sayi = new ArrayList<>(Arrays.asList(-5,-8,-12,0,1,12,5,5,6,9,15,8));

        ciftVePozitifLamExYazdir(sayi);
        System.out.println("\n ------------");
        ciftVePozitifMetRef(sayi);
        System.out.println("\n ------------");
        kareYazdir(sayi);
        System.out.println("\n ------------");
        kareTekrarsiYazdir(sayi);
        System.out.println("\n ------------");
        buyuktenKucugeSirala(sayi);
        System.out.println("\n ------------");
        pozitifKupBirlerBasBes(sayi);
        System.out.println("\n ------------");
        toplamMetRef(sayi);
        System.out.println("\n ------------");
        toplamLambdaEx(sayi);
        System.out.println("\n ------------");

    }

    //SORU1: List elemanlarının çift ve pozitif olanlarını, Lambda Expression kullanarak aralarında bosluk olacak sekilde yazdırın

    public static void ciftVePozitifLamExYazdir(List<Integer> sayi){

        sayi.stream().
                filter(t->t%2==0 && t>0).
                forEach(t-> System.out.print(t+ " "));// 12 6 8
        //filter(t->t%2==0 && t>0) cift'se pozitif olanlari ver.
    }

    //SORU2: List elemanlarının çift ve pozitif olanlarını, Method Referances kullanarak aralarında bosluk olacak sekilde yazdırın

    public static void ciftVePozitifMetRef(List<Integer> sayi){

        sayi.stream().filter(t->t%2==0 && t>0).forEach(Utilss::yazdir);// 12 6 8
    }
    //SORU3 : List elemanlarının karelerini, aralarında bosluk olacak sekilde yazdırın

    public static void kareYazdir(List<Integer> sayi){

        //sayi.stream().map(t->t*t).forEach(Utilss::yazdir);//25 64 144 0 1 144 25 25 36 81 225 64

        sayi.stream().map(Utilss::kareBul).forEach(Utilss::yazdir);//Method Referances ile Utils clas'indan aldik
    }

    //SORU4 : List elemanlarının karelerini, tekrarsiz yazdırın
    public static void kareTekrarsiYazdir(List<Integer> sayi) {

        sayi.stream().map(Utilss::kareBul).distinct().forEach(Utilss::yazdir);//25 64 144 0 1 36 81 225
    }

    //SORU5: List elemanlarını buyukten kucuge sıralayarak yazdırın
    public static void buyuktenKucugeSirala(List<Integer> sayi){
        sayi.stream().sorted(Comparator.reverseOrder()).forEach(Utilss::yazdir);//15 12 9 8 6 5 5 1 0 -5 -8 -12
      //sorted(Comparator.reverseOrder() buyukten kucuge siralar
    }

    // SORU6 : List elemanlarının pozitif olanlarının, kuplerini bulup, birler basamagı 5 olanları yazdırınız
    public static void pozitifKupBirlerBasBes(List<Integer> sayi){
        sayi.stream().filter(t->t>0).map(t->t*t*t).filter(t->t%10==5).forEach(Utilss::yazdir);//125 125 3375
    }

    // SORU7: List elemanlarının Method References ile toplamını bulun ve yazdırın
    public static void toplamMetRef(List<Integer> sayi){
       Optional<Integer> sonuc = sayi.stream().reduce(Integer::sum);//reduve() method'u terminal method'dur.Kendisiden sonra hic bir method kabul etmez.
        // Terminal method'dan sonra forEach gibi methodlar kullanilamaz.foreach()£de bir terminal method'dur.
        System.out.println(sonuc);// Optional[36]
    }

    // SORU8: List elemanlarının Lambda Expression ile toplamını bulun ve yazdırın
    public static void toplamLambdaEx(List<Integer> sayi){
        int sonuc = sayi.stream().reduce(0,(t,u)->t+u);
        System.out.println(sonuc);
    }













}
