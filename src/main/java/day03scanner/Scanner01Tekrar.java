package day03scanner;

import java.util.Scanner;

public class Scanner01Tekrar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen Adinizi giriniz...");

        String name = input.next();

        System.out.println("Lutfen soyadınızı girini...");

        String soyisim = input.next();

        System.out.println("Lütfen yasinizi giriniz...");

        byte age = input.nextByte();

        System.out.println("lutfen ilinizi giriniz...");

        String adres = input.next();

        System.out.println(adres);






    }
}
