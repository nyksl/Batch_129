package day07ifstatement;

import java.util.Scanner;

public class ifStatement04 {
    public static void main(String[] args) {
        //Example 1: Gun sayisini verdiginizde gun ismini yazan kodu yaziniz.
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen kacinci gun oldugunu giriniz...");
        byte num = input.nextByte();

        if (num == 1) {
            System.out.println("sunday");
        } else if (num==2) {

        } else if (num == 3) {
            System.out.println("monday");

        } else if (num == 4) {
            System.out.println("wedneday");
        } else if (num == 5) {
            System.out.println("thursday");
        } else if (num == 6) {
            System.out.println("friday");
        } else if (num == 7) {
            System.out.println("saturday");
        } else  {
            System.out.println("Hatalı giris patınız. Lütfen 1 ile 7 arasında bir sayı giriniz...");
        }
    }
}
