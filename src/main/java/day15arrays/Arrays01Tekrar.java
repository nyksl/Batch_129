package day15arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01Tekrar {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Kac ogrenci ismi gireceksiniz");
        int elemansayisi = input.nextInt();
        System.out.println("Girisi sonlandirmak icin Q' ya basiniz");

        String std[] = new String[elemansayisi];

        for (int i=1; i<=elemansayisi; i++){
            System.out.println("Lutfen"+ i + ".ogrenci adini giriniz");

            String stdN = input.next();
            if(stdN.equalsIgnoreCase("Q")){
                break;
            }
            std[i-1] = stdN;
        }

        System.out.println(Arrays.toString(std));




    }
}
