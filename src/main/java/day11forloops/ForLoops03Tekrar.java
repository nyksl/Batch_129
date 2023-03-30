package day11forloops;

public class ForLoops03Tekrar {
    public static void main(String[] args) {

        //Example 1: Size verilen bir String'i tersten yazdiriniz
        //           "Germany" ==> ynamreG
        String str = "Germany";
        String c = "";
        for (int i = str.length() - 1; i >= 0; i--) {

            c = c + str.charAt(i);


        }
        System.out.println(c);


        //Example 2: Size verilen bir String'in "Palindrome" olup olmadigini kontrol eden kodu yaziniz
        //     civic,nalan,kucuk, 11211 ==> Palindrome

        String duz = "Civic";
        String ters = "";

        for (int i=duz.length()-1; i>= 0; i--) {
            ters = ters + duz.charAt(i);

        }
        if (duz.equalsIgnoreCase(ters)) {
            System.out.println(duz + " String Palindrom");

        }else{
            System.out.println(duz + " String Palindrom degil...");
        }
    }
}
