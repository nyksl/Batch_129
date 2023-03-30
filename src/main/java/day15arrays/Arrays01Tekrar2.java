package day15arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01Tekrar2 {
    public static void main(String[] args) {

        //Example 1: Kullanici ile beraber bir array olusturunuz

        Scanner input = new Scanner(System.in);

        System.out.println("Kac ogrenci ismi gireceksiniz?");
        int stdsayisi = input.nextInt();
        System.out.println("Sonlandirmak icin Q'ya basiniz");

        String std[] = new String[stdsayisi];

        for(int i=1; i<=stdsayisi; i++){
            System.out.println("Lutfen orgenci ismi giriniz...");
            String stdN = input.next();
            if(stdN.equalsIgnoreCase("Q")){
                break;
            }
           std[i-1]= stdN;
        }
        System.out.println(Arrays.toString(std));







    }
}
