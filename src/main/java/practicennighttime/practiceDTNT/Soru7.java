package practicennighttime.practiceDTNT;

import java.util.Arrays;
import java.util.Scanner;

public class Soru7 {
    public static void main(String[] args) {

        /*INTERWIEW QUESTIONS
        Kullanicidan bir String aliniz.
        String'de var olan her character'in sayisini ekrana yazdiriniz.
        Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
        abaa   ==> a=3  b=1
                */

        Scanner input = new Scanner(System.in);
        System.out.println("Bir kelime giriniz.");

        String str = input.nextLine();
        String arr[] = str.split("");
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);

        int counter = 0;

        int i;
        for (i = 1; i < arr.length; i++) {

            if (arr[i - 1].equals(arr[i])) {
                counter++;//Aynı olanlar icin 1 artır.
            } else {
                System.out.println(arr[i - 1] + " karakterinin sayisi " + (counter+1) + " kez kullanilmistir.");
                counter = 0;
            }
            if (i == arr.length - 1) {
                System.out.println(arr[i] + " karakter sayisi " + (counter + 1) + " kez tekrarlanmistir.");

            }

        }
    }
}
