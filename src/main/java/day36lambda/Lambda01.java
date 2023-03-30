package day36lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {

    public static void main(String[] args) {

        List<Double> myList = new ArrayList<>();
        myList.add(12.0);
        myList.add(4.0);
        myList.add(7.0);
        myList.add(3.0);
        myList.add(26.0);
        myList.add(38.0);
       List<Double> half = gethalfElementsGreaterThanFiveDistinctReversed(myList);
        System.out.println(half);//[19.0, 13.0, 6.0, 3.5]

        List<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("Jhon");
        list.add("Ajda");
        list.add("Angelina");
        list.add("Tom");
        list.add("Brad");
        list.add("Cuneyt");

        printAllAlphabeticallUpperDistinct(list);//AJDA ANGELİNA BRAD CUNEYT JOHN TOM
        System.out.println();
        printAllAlphabeticaLowerDistinct(list);//tom john cuneyt brad angelina ajda
        System.out.println();
        printAllSortWithLenghtUpperDistinct(list);//TOM JOHN AJDA BRAD CUNEYT ANGELİNA
        System.out.println();
        printAllSortWithLastCharUpperDistinct1(list);//AJDA ANGELİNA BRAD TOM JOHN CUNEYT
        System.out.println();
        printAllSortWithLastCharUpperDistinct2(list);//CUNEYT JOHN TOM BRAD AJDA ANGELİNA
        System.out.println();
        printAllSortWithLenghtUpperDistinctSameLenghtInAlphabeticalOlder(list);
        System.out.println();
        //System.out.println(removeElementIfTheLengthGreaterThanFive(list));//[Tom, John, Ajda, Tom, Brad]
        System.out.println();
      //  System.out.println(removeElementIfStartsWithAorEndsWithd(list));//[Tom, Jhon, Cuneyt]
        System.out.println();
        System.out.println(printLenghtSuquar(list));//[9, 16, 16, 64, 9, 16, 36]
        System.out.println();
        System.out.println(printElementsLenghtEven(list));//[John, Ajda, Angelina, Brad, Cuneyt]

    }
    //1)Create a method to find the half of the elements greater than 5, distinct, in reverse order in a List
    //Bir Listede 5'ten büyük öğelerin yarısını farklı, ters sırada bulmak için bir yöntem oluşturun
    public static List<Double> gethalfElementsGreaterThanFiveDistinctReversed(List<Double> myList){
      return myList.stream().distinct().filter(t->t>5).map(t->t/2).sorted(Comparator.reverseOrder()).collect(Collectors.toList());

    }

    // 2) Tum List elemanlarini buyuk harf ile alfabetik sirada tekrarsiz olarak yazdiriniz
    public static void printAllAlphabeticallUpperDistinct(List<String> list){
        list.stream().distinct().map(t->t.toUpperCase()).sorted().forEach(t-> System.out.print(t +" "));//AJDA ANGELİNA BRAD CUNEYT TOM
    }
    // 3) Tum List elemanlarini kucuk harf ile alfabetik sirada tersinde tekrarsiz olarak yazdiriniz
    public static void printAllAlphabeticaLowerDistinct( List<String> list){
        list.stream().distinct().map(t->t.toLowerCase()).sorted(Comparator.reverseOrder()).forEach(t-> System.out.print(t +" "));
    }//tom cuneyt brad angelina ajda

    // 4) Tum List elemanlarini buyuk harf ile uzunluklarina artan sirada tekrarsiz olarak yazdiriniz
    public static void printAllSortWithLenghtUpperDistinct( List<String> list){
        list.stream().distinct().map(t->t.toUpperCase()).sorted(Comparator.comparing(t->t.length())).forEach(t-> System.out.print(t + " "));
      //TOM AJDA BRAD CUNEYT ANGELİNA
    }

    // 5) Tum List elemanlarini buyuk harf ile son harflerine gore azalan sirada tekrarsiz olarak yazdiriniz
    public static void printAllSortWithLastCharUpperDistinct1( List<String> list){
        list.
                stream().
                distinct().
                map(t->t.toUpperCase()).
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))).
                //t->t.charAt(t.length()-1) bu ifade lambda expression olark adlandirilir
                forEach(t-> System.out.print(t + " "));//AJDA ANGELİNA BRAD TOM JHON CUNEYT
    }
    public static void printAllSortWithLastCharUpperDistinct2(List<String>list){
        list.
                stream().
                distinct().
                map(String::toUpperCase).
                sorted(Comparator.comparing(Utils::getLastChar).
                        reversed()).
                forEach(Utils::printInTheSameLineWithSpace);
    }




    //Example 6: Tum list elemanlarini buyuk harfle, uzunluklarina gore artan sirada, tekrarsiz olarak yazdiriniz
    //           Uzunluklari ayni olan elemanlar alfabetik sirada olsunlar
    public static void printAllSortWithLenghtUpperDistinctSameLenghtInAlphabeticalOlder( List<String> list){
       list.stream().
               distinct().
               map(String::toUpperCase).//String::toUpperCase yapisina (method referrance) denir.
               sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder())).
               forEach(System.out::println);
        //(String :: length) -->  String class'a git length methodunu kullan (method referrance) denir
        // bu yapiya method reference denir. classin icindeki methodu adresle demek.
        // karsilastirirken String classtaki lenhth methodu kullan dedik.
    }

    // 7) Character sayisi 5 den fazla olan elemanlari siliniz ve sonucu List olarak yazdiriniz.
//    public static List<String> removeElementIfTheLengthGreaterThanFive (List<String> list){
//        list.removeIf(t->t.length()>5);
//        return list;
//        //[Tom, Jhon, Ajda, Tom, Brad]
//    }

    // 8) "A" ile baslayan veya "d" ile biten elemanlari siliniz.,
   // public static List<String>removeElementIfStartsWithAorEndsWithd(List<String> list){
      //  list.removeIf(t->t.startsWith("A") || t.endsWith("d"));
        //Bazen "stream()" methodu bize lazim olan methodlara ulasmamiza engel olur. Bu yüzden "stream()" methodunu kullanmayız
        //"removeIf()" methodunda olduğu gibi.

        //Fakat "stream()" methodunu daha sonradan kullanmamız gerekibilir. Bu durumda "stream()" methodunu kullanarak istediğimiz methodlara
       //ulasiriz, distinct() methoduna ulaştığımız gibi.

        // Sonuc bize list olarak lazımsa "collect(Collectors.toList()" ile sonucu List'e ceviririz
        //return list.stream().distinct().collect(Collectors.toList());
   // }

    //Example 9:List elemanlarini karakter sayilarinin karelerini aliniz ve bir list olarak ekrana yazdiriniz
    public static List<Integer> printLenghtSuquar(List<String> list){
        //Lambda expression'dan kurtulmanin bir yolu da kendi methodumuzu Util class'dan cagirarak kullanmaktir
       return list.stream().map(Utils::getLengthSquare).collect(Collectors.toList());
    }//[9, 16, 16, 64, 9, 16, 36]
    //Lambda expression'dan kurtulmanin bir yolu da kendi methodumuzu Util class'dan cagirarak kullanmaktir
    //map(Utils::getLengthSquare).//oluşturduğumuz Utils class'ından "getLengthSquare method"unu kullan dedim (functional programming)
    // bu methodlar Javadan da gelebilir sizin oluşturduğunuz methodlardan da gelebili


    //Example 10: List elemanlarindan karakter sayisi cift sayi olanlari bir list icinde ekrana yazdiriniz
     public static List<String> printElementsLenghtEven(List<String> list){
       return list.stream().filter(Utils::isLenghtEven).collect(Collectors.toList());
       //[Jhon, Ajda, Angelina, Brad, Cuneyt]
     }

}
