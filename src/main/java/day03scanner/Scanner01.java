package day03scanner;
//Scanner kullanıcıdan data alıp o data'yı kodlarımızın icinde yazmamıza yardım eder Javanın utill kutuphanesinin icindedir.
import java.util.Scanner;

public class Scanner01 {



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //                       Sistem içine koy demenk
        // Object ismini "input" yaptım cunku bu object kullanıcıdan alinan data'yi benim kodlarimin icinekoyacak
        //

        System.out.println("Lutfen yasinizi giriniz...");

       byte age = input.nextByte();

       System.out.println(age);
    }

}
