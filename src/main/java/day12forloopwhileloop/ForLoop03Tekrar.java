package day12forloopwhileloop;

import java.util.Scanner;

public class ForLoop03Tekrar {
    public static void main(String[] args) {

          /*
    Example 1: Asagidaki sekli cizdiren kodu yaziniz
                * * * *
                * * *
                * *
                *
       */
        Scanner input = new Scanner(System.in);

        System.out.println("Satır Sayisini giriniz...");
        int r = input.nextInt();

       for (int i=1; i<=r; i++){
           for (int k=r; k>i; k--){
               System.out.print("* ");

           }System.out.println();

       }



    }
}
