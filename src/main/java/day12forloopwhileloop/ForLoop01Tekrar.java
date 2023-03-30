package day12forloopwhileloop;

import java.util.Scanner;

public class ForLoop01Tekrar {

    public static void main(String[] args) {
         /*
      Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
            X X X X X
            X X X X X
            X X X X X
       */
        Scanner input = new Scanner(System.in);
        System.out.println("Satır sayisini giriniz");
        int s = input.nextInt();

        System.out.println("Sutun sayisini giriniz");
        int r = input.nextInt();

        for (int i=1; i<=s; i++){
            for (int k=1; k<=r; k++){
                System.out.print("X ");

            }
            System.out.println();//Alt satıra almak icin


       }



    }
}
