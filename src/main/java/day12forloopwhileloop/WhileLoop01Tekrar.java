package day12forloopwhileloop;

public class WhileLoop01Tekrar {
    public static void main(String[] args) {

        //Example 1: 3'den 10'a kadar tamsayilari console'a yazdiriniz

        //1.Yol for-loop
        for (int i = 3; i < 11; i++) {
            System.out.print(i + " ");

        }
        System.out.println();
        //2.Yol while-loop
        int k = 3;
        while (k < 11) {
            System.out.print(k + " ");
            k++;
        }
        System.out.println();


        //Example 2: 23'den 12'ye kadar cift tamsayilari console'a yazdiriniz
        int r = 23;
        while (r>11) {
            if (r%2==0) {
                System.out.print(r + " ");
            }
            r--;
        }
        System.out.println();

            //Example 3: Verilen bir tamsayinin rakamlari toplamini console'a yazdiran kodu yaziniz
       //1.Yol while-loop
        int t = 585;
       int s = 0;

       while (t>0){

         s = s + t%10;
         t/=10;

       }
        System.out.println(s);//18

        //2.Yol: for-loop
        int a = 6841;
        int tpl = 0;

        for (int i=a; i>0; i/=10){

            tpl= tpl + i%10;

        }
        System.out.println(tpl);//19




    }
}
