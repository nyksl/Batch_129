package testsoru;

public class TestSoru {

    public static void main(String[] args) {

        //Soru 3:Verilen multidimensional array in tum elementlerin toplamini bulunuz

        int arr[][]={{3,1,7},{6,10,2}};

        int tp = 0;

        for (int[] w : arr){

            for (int r : w){


                tp = tp+r;
            }
        }System.out.println(tp);

    }
}
