package day33maps;

import java.util.Arrays;
import java.util.HashMap;

public class Hashmaps02 {

    public static void main(String[] args) {

        //Exampla 1: Size verilen bir cumledeki her bir kelimenin kacar kere kullanildigini gosteren kodu yaziniz
        //           "Java is easy. Java is OOP. OOp makes Java easy."  ==> Java=3, is=2, easy=2, OOP=2, makes=1

        HashMap<String,Integer> wordsMap = new HashMap<>();//{                     }

        String sentence = "Java is easy. Java is OOP. OOp makes Java easy.";
        System.out.println(sentence);// Java is easy. Java is OOP. OOp makes Java easy.

        //Kelimeleri sayarken mutlaka noktalama isaretlerini silmeliyiz.
        // Java noktalama isaterleri olan kelimeleri karakter olarak aldıgı icin saymaz
        // Stringer immutuble(degismez)dir.Method'lar orjinal String'i degistiremezler.
        // İlla degistirmek istiyorsan degismis halini (Assigment) atamak gerekir.
        sentence = sentence.replaceAll("\\p{Punct}","");//noktalama isareterini sildik
        System.out.println(sentence);// Java is easy Java is OOP OOp makes Java easy

        String[] wordsArray = sentence.split(" ");
        System.out.println(Arrays.toString(wordsArray));// [Java, is, easy, Java, is, OOP, OOp, makes, Java, easy]

        for (String w : wordsArray){//Array olan kelimeler "w" nun icine girdi
           Integer numOfOccurrence = wordsMap.get(w);//Biz "w" icine "Java" koyunca Map'e gidecek get(w); methodu "Java"nın value'sini verecek
            // ama Map'de "Java" olmadigi icin null verecek atama operatoru null'ı alıp "numOfOccurrence" veriablesinin icine koyacak

           if (numOfOccurrence==null){ // null==null'a (true)
               wordsMap.put(w,1);//w yani Java'yı 1 valuea'si ile Map'e "wordsMap" ekliyor (Java=1)
           }else {
               wordsMap.put(w,numOfOccurrence+1);
           }
            System.out.println(wordsMap);// {Java=3, OOP=1, OOp=1, makes=1, is=2, easy=2}
        }

    }
}
