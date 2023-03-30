package day15arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

public class Arrays02 {
    public static void main(String[] args) {
        //Example 2: Bir Stringdeki sesli harflerin sayisini bulan kodu yaziniz
        //           a - e - i - o - u - A - E - I - O - U
        String s = "Java birings you money";

        //1.Yol: use replaceAll()
        int vowels = s.replaceAll("[^aeiouAEİOU]", "").length();
        System.out.println(vowels);

        //2. Yol use Array - Loop
        String letters[] = s.split("");

        System.out.println(Arrays.toString(letters));
        int counter1 = 0;

        for (String w : letters) {
            switch (w.toLowerCase()) {

                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    counter1++;

            }
        }
        System.out.println(counter1);

               /*
     Kullanicidan bir String aliniz.
     String'de var olan her character'in sayisini ekrana yazdiriniz.
     Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
            abaa   ==> a=3  b=1
           */

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen bir kelime giriniz");
        String klm = input.nextLine();

        String wrd[] = klm.split("");
        System.out.println(Arrays.toString(wrd));

        for (String w : wrd) {
            int idx = 0;
            for (int i = 0; i < wrd.length; i++) {

                if (w.equalsIgnoreCase(wrd[i])) {
                    idx++;
                }
            }
            System.out.println(w + "harfinden " + idx + "adet var");
        }



    }
}





