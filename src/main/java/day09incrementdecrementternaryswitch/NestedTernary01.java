package day09incrementdecrementternaryswitch;

public class NestedTernary01 {
    public static void main(String[] args) {

        /*
        Ex 1: Verilen yilin "Artik Yil"(Leap Year) olup olmadigini kontrol eden kodu yaziniz.
        1) Yil 100'e bolunuyorsa 400'e de bolunmelidir. 1600==>Leap   1800==>Leap degil
        2) yil 100'e bolunmuyorsa 4'e bolunmelidir. 2004==>Leap 2005==>Leap egil
         */
        int year = 2005;

        String result = year%100==0 ? year%400==0 ? "Leap" : "Not leap" : year%4==0 ? "Leap" : "Not leap";

        System.out.println(result);

    }
}
