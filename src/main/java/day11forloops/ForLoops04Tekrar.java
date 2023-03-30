package day11forloops;

public class ForLoops04Tekrar {

    public static void main(String[] args) {


        //Ex 1: 5' ten 8' e kadar tam sayilarin toplamini veren kodu yaziniz.
        //      5 + 6 + 7 + 8 ==> 26
        int sum = 0;
        for (int i=5; i<9; i++){
            sum = sum + i;

        }
        System.out.println(sum);//26

        // Ex 2: 7'den 9' a kadar tamsayilarin carpimini veren kodu yaziniz
        //       7*8*9 ==> 504
        int m = 1;
        for (int k=7; k<10; k++){
            m = m * k;

        }
        System.out.println(m);//504


    }
}
