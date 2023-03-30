package day07ifstatement;

import java.util.Scanner;

public class İfStatement05Tekrar {
    public static void main(String[] args) {
        //EX 1: Ay isimleri girilince kacıncı ay oldugunu yazan kodu yazınız.
       Scanner input = new Scanner(System.in);
        System.out.println("Bir ay ismi giriniz...");
       String ay=input.next();

        if(ay.equalsIgnoreCase("Ocak")){
            System.out.println(1);

        }else if (ay.equalsIgnoreCase("Subat")){
            System.out.println(2);

        }else if (ay.equalsIgnoreCase("Mart")){
            System.out.println(3);

        }else if (ay.equalsIgnoreCase("Nisan")){
            System.out.println(4);

        }else if (ay.equalsIgnoreCase("Mayis")){
            System.out.println(5);

        }else if (ay.equalsIgnoreCase("Haziran")){
            System.out.println(6);

        }else if (ay.equalsIgnoreCase("Temmuz")){
            System.out.println(7);

        }else if (ay.equalsIgnoreCase("Agustos")){
            System.out.println(8);

        }else if (ay.equalsIgnoreCase("Eylul")){
            System.out.println(9);

        }else if (ay.equalsIgnoreCase("Ekim")){
            System.out.println(10);

        }else if (ay.equalsIgnoreCase("Kasim")){
            System.out.println(11);

        }else if (ay.equalsIgnoreCase("Aralik")){
            System.out.println(12);

        }else {

        }System.out.println("Gecersiz ay...");


    }

}





