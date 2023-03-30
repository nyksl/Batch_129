package testsoru;

public class soru {
    public static void main(String[] args) {

        //Soru 3:Verilen multidimensional array in tum elementlerin toplamini bulunuz

        int arr[][]={{3,1,7},{6,10,2},{5,8,10}};

        int tpl=0;
        for (int[] w : arr){

            for (int r : w){
                tpl=tpl+r;
            }

        }
        System.out.println(tpl);//29




    }
}
