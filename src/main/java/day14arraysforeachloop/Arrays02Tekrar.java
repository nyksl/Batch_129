package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays02Tekrar {
    public static void main(String[] args) {
        //Example 2: Integer array olusturunuz, icine 6 tane eleman yerlestiriniz,
        //           bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz

    int sayi[] =new int[6];
        sayi[0]= 15;
        sayi[1]= 20;
        sayi[2]= 43;
        sayi[3]= 12;
        sayi[4]= 35;
        sayi[5]= 40;
        System.out.println(Arrays.toString(sayi));

        Arrays.sort(sayi);//Kücükten büyüge siralamak icin sort kullanilir
        System.out.println(Arrays.toString(sayi));

        System.out.println(sayi[0]+ sayi[sayi.length-1]);

        //2.Yol:
       int x = sayi[0];
       int y = sayi[0];

      for (int w : sayi){
        x = Math.min(x, w );
        y = Math.max(y, w);
      }
        System.out.println(x+y);

    }
}
