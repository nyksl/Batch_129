package day16multidimensionalarrays;

import java.util.Arrays;

public class Md02Tekrar {

    public static void main(String[] args) {

        //Example 1: Bir multidimensional array olusturunuz
        //        //           Toplam elemanlar  konsala yazdırınız.

        int a[][]={{13,213,4},{12,87},{4,7,1,9},{99}};//MultiDimensional için süslü parantez kuulanılır.
        System.out.println(Arrays.deepToString(a));//[[13, 213, 4], [12, 87], [4, 7, 1, 9], [99]]

        int sum=0;

        for (int[] w : a){
            sum=sum+w.length;
        }
        System.out.println(sum);//10

    }
}
