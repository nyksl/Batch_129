package day10switchloops;

public class Loops02Tekrar {
    public static void main(String[] args) {

        //Example 1: 21 den 180 e kadar hem 4 hem de 6 ile bolune bilen tamsayilari ekrana yazdiran kodu yaziniz
        for (int i = 21; i<181; i++){
            if (i % 4==0 && i% 6==0){
                System.out.print(i+ " ");
            }
        }
        System.out.println();

        //Size verilen kucuk harfle yazılmıs String'in index'i cift sayi olan charecterlerini buyuk harf yapiniz.
        //         ankara ==> Ankara
        //Note: Yazdiginiz code belli senaryolar icin calisiyor, tum senaryolar icin calismiyorsa; bu code'a
        //      "hard-code" denir. "hard-code" yanlis yazilmis code'dur, mutlaka duzeltilmelidir.

        //Note: Bir String'de son index = length() - 1

        String str = "ankara";
        for (int k=0; k<str.length(); k++){

            String ch = str.substring(k, k+1);
            if (k%2==0){

                System.out.println(ch.toUpperCase());
            }

        }


    }
}
