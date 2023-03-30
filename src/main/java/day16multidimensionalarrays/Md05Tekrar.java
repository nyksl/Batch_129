package day16multidimensionalarrays;

import java.util.Arrays;

public class Md05Tekrar {

    public static void main(String[] args) {

        //Example 1: Bir multidimensional array olusturunuz
        //bu array'deki tum elemanlarin carpimini consala yazdiran kodu yaziniz.

        int a[][] = {{2,5},{4,7,11},};

        int carp= 1;

        for (int[] w : a){

            for (int k : w){

                carp=carp*k;

            }
        }
        System.out.println(carp);//3080


    }
}
