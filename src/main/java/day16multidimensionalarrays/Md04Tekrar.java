package day16multidimensionalarrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Md04Tekrar {

    public static void main(String[] args) {

        //Example 1: Bir multi-dimensional array olusturunuz ve bir dimensionalli array donusturunuz.
        //           [ [2, 5], [4,7,11] ] ==> [2, 5, 4, 7, 11]

        int a[][] = {{2,5},{4,7,11},};
        //"a array"indeki toplam eleman sayisini bulunuz.
        int tp = 0;

        for (int[] w : a){
            tp = tp + w.length;
        }
        //"b" isimli tek dimenionallı bir array olusturunuz
        int b[] = new int[tp];
        System.out.println(Arrays.toString(b));//[0, 0, 0, 0, 0]

        //"a" arrayindeki elemanlari "b"arrayine transfer ediniz.
        int idx = 0;

        for (int[] w : a){

            for (int k : w){

                b[idx] = k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(b));//[2, 5, 4, 7, 11]
    }
}
