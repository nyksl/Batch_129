package practicennighttime.practiceDTNT;

import java.util.Scanner;

public class C02_İfStatement {
    public static void main(String[] args) {
        /*
        Kullanicidan alacaginiz iki sayiyi yine kullaniciya
        sectireceginiz dort islemden biri ile isleme koyup yazdiriniz
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen\n Toplama yapmak icin 1\n Cıkarma yapmak icin 2\n" +
                " Carpma yapmak icin 3\n Bolme yapmak icin 4\n giriniz");

        int islem = input.nextInt();
        System.out.println("Lutfen iki tamsayi giriniz...");

        double num1 = input.nextDouble();//1Sayi assign edildi
        double num2 = input.nextDouble();//2.Sayı assign edildi

        if (islem == 1) {
            System.out.println("Toplamam isleminin sonucu: " + num1 + " + " + num2 + " = " + (num1 + num2));
        } else if (islem == 2) {
            System.out.println("Cikarma isleminin sonucu : " + num1 + " - " + num2 + " = " + (num1 - num2));
        } else if (islem == 3) {
            System.out.println("Carpma isleminin sonucu : " + num1 + " * " + num2 + " = " + (num1 * num2));


        } else if (islem == 4) {
            System.out.println("Bolme isleminin sonucu : " + num1 + " / " + num2 + " = " + (num1 / num2));
        } else System.out.println("Hatalı secim yaptiniz tekrar deneyiniz...");

    }
}