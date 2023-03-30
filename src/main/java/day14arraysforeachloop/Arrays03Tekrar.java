package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays03Tekrar {

    public static void main(String[] args) {

        //Example 1: String bir array olusturunuz, 6 tane eleman yerlestiriniz,
        // character sayisi 5 den cok olan elemanlari siliniz.

       String color[] = new String[6];

        color[0]= "Kırmızı";
        color[1]= "Mavi";
        color[2]= "Turuncu";
        color[3]= "Siyah";
        color[4]= "Kahverengi";
        color[5]= "Sari";

        System.out.println(Arrays.toString(color));//[Kırmızı, Mavi, Turuncu, Siyah, Kahverengi, Sari]

        int sayac = 0;
        for (String w : color){
            if (w.length()<=5){
                sayac++;

            }

        }
        System.out.println(sayac);

        String yeniRenk[]= new String[sayac];

        int sy=0;

        for (String w : color){
            if (w.length()<=5){
                yeniRenk[sy] = w;
                sy++;

            }
        }
        System.out.println(Arrays.toString(yeniRenk));



    }
}

