package day16multidimensionalarrays;

public class Md03Tekrar {

    public static void main(String[] args) {
        //Example 2: Bir tane integer multidimensional array olusturunuz
        //Bu array'deki tum sayilarin toplamini veren kodu yaziniz.

        int a[][]={{2,62,82},{3,13}};

        int tp=0;

        for (int[] w : a){
            for (int k : w){// MultiDimenasional array'lerde elemanlara birer birer ulaşmak istiyorsak
                            //Nested-loop kullanmak zorundayiz.
                tp=tp + k;
            }
        }
        System.out.println(tp);//162
    }
}
