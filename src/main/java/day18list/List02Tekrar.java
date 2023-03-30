package day18list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List02Tekrar {

    public static void main(String[] args) {

        //Interview sorusu
        // Example 1: Bir tane Integer List olusturunuz
        // Bu List'te birbirine en yakin iki tamsayiyi yaziniz
        // [12, 23, 9, 11, 33] ==>  12, 11

        List<Integer> nums = new ArrayList<>();

        nums.add(12);
        nums.add(23);
        nums.add(9);
        nums.add(11);
        nums.add(35);

        Collections.sort(nums);//Kucukten buyuge sıraladık
        System.out.println(nums);//[9, 11, 12, 23, 35]

        int minDiff = nums.get(1)-nums.get(0);//iki elemanın farkini bulduk.(11 ile 9'in arasındaki fark 2'yi bulduk)

        for (int i=1; i<nums.size(); i++){

           minDiff = Math.min(minDiff, nums.get(i)-nums.get(i-1));
        }
        System.out.println(minDiff);


    }

}
