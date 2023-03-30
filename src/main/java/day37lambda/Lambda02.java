package day37lambda;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Lambda02 {
    /*
    AnyMath: Vereceğimiz şarta bağlı olarak Stream içerisinde gezinir ve
herhangi bir elemanla eşleşme durumunda true dönecektir.


AllMatch: Verilen şarta göre Stream içerisindeki tüm elemanların
bu şarta uyması durumunda true dönecektir.


NoneMatch: Şarta göre Stream içindeki hiç bir
elemanın şartı sağlamaması durumunda true dönecektir.
    */

    public static void main(String[] args) throws IOException {

        //1)LambdaTextFile dosyasi icindeki metni konsal'a yazdiran kodu yaziniz.
        Files.lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).forEach(System.out::println);

        //2)LambdaTextFile dosyasi icindeki her karakteri uppercase yapiniz.
        Files.
                lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(String::toUpperCase).
                forEach(System.out::println);



        boolean result = Files.
                lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(t->t.split(" ")).// split methodu her zaman Array verir.
                flatMap(Arrays::stream).// flatMap() dumduz et Arrayler'i stream'in icine koy
                anyMatch(t->t.contains("Java"));//anyMatch(t->t.contains("Java"))==> Java kelimesi var mı?
        System.out.println(result);//true
        //split Array dondurdugu icin "Line" i alip parcalayip "array" icine yazar.Arrayden cikarmak icin  "flatmap()" ile kelimeleri duz yapariz.sonra
        // "Stream"e ceviricek sonra da "anyMatch()" ile herhangi birinin verecegimiz degerle eslesip eslesmedigini kontrol edecek ve true vericek
       // AnyMatch(): Vereceğimiz şarta bağlı olarak Stream içerisinde gezinir ve
       // herhangi bir elemanla eşleşme durumunda true dönecektir.

        //4) LambdaTextFile dosyasi icindeki her kelimenin "a" icerip icermedigini gosteren kodu yaziniz
        boolean result2 = Files.
                lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream).
                allMatch(t->t.contains("a"));//allMatch() Her kelime "a" harfini iceriyorsa sonuc "ture" olur aksi halde "false" olur.
        System.out.println(result2);// false

        //5)LambdaTextFile dosyasi icindeki hicbir kelimenin "x" gosteren kodu yaziniz
        boolean result3 = Files.
                lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream).
                noneMatch(t->t.contains("x"));
        System.out.println(result3);// true

        //6) LambdaTextFile dosyasi icinde "r" ile biten kelimeleri sayan kodu yaziniz

        //1.Yol
        long result4 = Files.
                lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream).
                 filter(t->t.endsWith("r")).//Kac tane "r" ile biten kac varsa tane varsa sayip verir.
                 count();
        System.out.println(result4);

        //2.Yol : Tavsiye edilmez
        long result5 = Files.
                lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream).
                filter(t->t.endsWith("r")).collect(Collectors.toList()).size();

        System.out.println(result5); //5


    }

}
