package day15arrays;

import java.util.Arrays;

public class Arrays02Tekrar {
    public static void main(String[] args) {


        //Example 2: Bir Stringdeki sesli harflerin sayisini bulan kodu yaziniz
        //           a - e - i - o - u - A - E - I - O - U

        String s = "Java brings you money";

        //1.Yol replaceALL()
        int sesliH = s.replaceAll("[^aeiouAEIOU]", "").length();
        System.out.println(sesliH);//7

        //2.Yol Array-loop

       String harfler[]= s.split("");
        System.out.println(Arrays.toString(harfler));//[J, a, v, a,  , b, r, i, n, g, s,  , y, o, u,  , m, o, n, e, y]

        int sayac = 0;

        for (String w : harfler){

            switch (w.toLowerCase()){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":

                sayac++;

            }

        }System.out.println(sayac);//7

    }
}
