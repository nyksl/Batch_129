package day07ifstatement;

import java.util.Scanner;

public class İfStatement04Tekrar {
    public static void main(String[] args) {
        //Example 1: Gun sayisini verdiginizde gun ismini yazan kodu yaziniz.
        Scanner input = new Scanner(System.in);
        System.out.println("Gun sayisini giriniz...");
        int gun= input.nextInt();

        if(gun==1){
            System.out.println("Pazartesi");

        } else if (gun==2) {
            System.out.println("Sali");

        } else if (gun==2) {
            System.out.println("Carsamba");

        } else if (gun==3) {
            System.out.println("Persembe");

        } else if (gun==4) {
            System.out.println("Cuma");

        } else if (gun==5) {
            System.out.println("Cumartesi");

        } else if (gun==6) {
            System.out.println("Pazar");

        }else{
            System.out.println("Hatali giris yaptiniz 1 ila 7 arasinda rakam giriniz.");
        }
    }
}

