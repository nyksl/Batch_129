package day13whileloopdowhileloop;

import java.util.Scanner;

public class DoWhileLoop03Tekrar {
    public static void main(String[] args) {


    /*
                Gecerli Username="admin" ve Password="pwd123" dur.
                Kullanicidan username ve password'u alin.
                Username ve password dogru ise console'a "Hesabiniza hosgeldiniz!" yazdirin.
                Username veya password yanlis ise 4 kere "Username ve password'unuzu giriniz"
                 mesaji versin
                Username veya password 4. kere yanlis girilirse "Hesabiniz bloke olmustur"
                 mesaji vererek islemi tamamlayiniz
         */

        Scanner input = new Scanner(System.in);

      int b = 0;

      do {
          if (b==4){
              System.out.println("Hesabiniz bloke olmustur...");
              break;
          }
          System.out.println("Username giriniz...");
          String username = input.next();

          System.out.println("Pasword giriniz...");
          String pwd = input.next();

          if (username.equals("admin")&& pwd.equals("pwd123")){
              System.out.println("Hesabiniza hosgeliniz...");
              break;
          }
          b++;

      }while (true);







    }
}

