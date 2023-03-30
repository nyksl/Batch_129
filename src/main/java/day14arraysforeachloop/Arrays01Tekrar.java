package day14arraysforeachloop;


import java.util.Arrays;

public class Arrays01Tekrar {

    public static void main(String[] args) {

        //Example 1: String array olusturun, icine 5 tane eleman ekleyin, ilk eleman ile son elemanin
        //           icerdigi karakter sayilari toplamini ekrana yazdirin.


     String arr[] = new String[5];

        arr[0]= "Ajda";
        arr[1]= "Serhat";
        arr[2]= "Cemal";
        arr[3]= "Can";
        arr[4]= "Hasan";

     System.out.println(Arrays.toString(arr));
     System.out.println(arr[0].length()+ arr[arr.length-1].length());



     //Example 2: String array olusturun, icine 5 tane eleman ekleyin, tum elemanlarin
        //           icerdigi karakter sayilari toplamini ekrana yazdirin.
        String brr[]=new String[5];
        brr[0]= "Leman";
        brr[1]="cuneyt";
        brr[2]="Cemal";
        brr[3]="Metin";
        brr[4]="Hasan";
        int a = 0;

        for (int i=0; i<brr.length; i++){
           a= a+ brr[i].length();


        }
        System.out.println(a);



        //2.Yol: for each-lopp

        int sum = 0;

        for (String w : brr){

            sum = sum + w.length();
        }
        System.out.println(sum);

    }

}
