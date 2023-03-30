package day10switchloops;

public class Loops02 {
    public static void main(String[] args) {

        //Example 1: 21 den 180 e kadar hem 4 hem de 6 ile bolune bilen tamsayilari ekrana yazdiran kodu yaziniz

        for (int i = 21; i < 180; i++) {
            if (i % 4 == 0 && i % 6 == 0) {
                System.out.println(i + "  ");
            }

        }
        //Size verilen kucuk harfle yazılmıs String'in index'i cift sayi olan charecterlerini buyuk harf yapiniz.
        //         ankara ==> Ankara
        //Note: Yazdiginiz code belli senaryolar icin calisiyor, tum senaryolar icin calismiyorsa; bu code'a
        //      "hard-code" denir. "hard-code" yanlis yazilmis code'dur, mutlaka duzeltilmelidir.

        //Note: Bir String'de son index = length() - 1
        String s = "ankara";
        for (int i = 0; i<s.length() ; i++) {//i<6 yazarsak sadece ankara icin calisir ama "s" sitringini
                                             // (i<s)yazarsak tum senaryolar icin calisir.

            String ch = s.substring(i, i+1);

            if(i%2==0){
                System.out.println(ch.toUpperCase());
            }
        }

        }

    }
