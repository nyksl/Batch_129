package day01deneme01;


import java.util.Scanner;

public class DenemeScanner01 {
   //Kullanıcıdan data alıp kodlarımızı kullanacagız


   public static void main(String[] args) {

      //Object olusturduk
      Scanner input = new Scanner(System.in);

      //Kullanıcıya ne istediginize dair mesaj veriniz

      System.out.println("Lütfen Yasınızı Giriniz...");

      //Uygun method'u kullanarak kullanıcının verdigi data'yı memory'e yerlastirin.
      byte age = input.nextByte();
      System.out.println(age);

      Scanner scan = new Scanner(System.in);
      System.out.println("Lutfen bir sayı giriniz");
      double sayı = scan.nextDouble();
      System.out.println(sayı*sayı);


   }



}
