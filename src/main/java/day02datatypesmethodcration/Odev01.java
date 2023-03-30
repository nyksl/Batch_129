package day02datatypesmethodcration;

public class Odev01 {

    //1) Dikdortgenin alanını hesaplayan metodu olusturunuz ve kullanınız.
    // 2)Dikdörtgenin cvresini hesaplayan metodu olusturunuz ve kullanınız.
    //3)Dairenin alanını hesaplayan metodu olusturunuz ve kullanınız.

    public static void main(String[] args) {

        double dikDortgen = dikDortgenAlani(5, 10);
        System.out.println(dikDortgen);

        System.out.println("dikdDortgenCevresi:"+ dikDortgenCevresi(5, 7));

        System.out.println("daireAlanı:"+ daireninAlanı(Math.PI, 6 ));


    }


    public static double dikDortgenAlani(double a, double b) {
        return a * b;


    }

    public static int dikDortgenCevresi(int a, int b) {
        return 2 * (a + b);



        }
    public static double daireninAlanı(double a, double b){
        return Math.PI*(b*b);

    }
}








