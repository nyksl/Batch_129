package day05typecastingstringmanipılations;

public class SwapValues {
    //Swap yer degistirmek demektir. 1.kap: Patates 2.kap: Domates ==> 1.kap Domates 2.Kap Patates

    public static void main(String[] args) {
    int a = 12;
    int b = 5; // Swap'den sonra ==> a=5 ve b=12//
         int temp =0;
        System.out.println("a:" + a);
        System.out.println("b:" + b);


        //1.Adım
        temp = a;

       //2.Adım
        a = b;

       //3.Adım
        b = temp;

        System.out.println("a:" +a);//5
        System.out.println("b:" +b);//12

        //2.Yol:
        int x = 12;
        int y = 5;
        System.out.println(x);
        System.out.println(y);

        x = x + y; //12+5=17
        y = x -y;  //17-5=12
        x = x -y;  //17-12=5
        System.out.println(y);
        System.out.println(x);







    }
}
