package day11forloops;

public class ForLoop01Tekrar {
    public static void main(String[] args) {

        //Example 1: Verilen bir String'de ilk 'a' harfinden onceki tum character'leri console'a yazdiriniz
        //           "I love Java" ==> "I love J"

        String str = "Tramvay";

        for (int i = 0; i<str.length(); i++){

            char ch = str.charAt(i);

            if (ch =='a'){
                break;


            }System.out.println(ch);

        }





        //Example 2: Verilen bir String'de son 'a' dan sonraki tum character'leri ters sirada ve buyuk yazdiriniz
        //           "Germany" ==> yn

       String sn = "Germany";

        for (int k=sn.length()-1; k>=0; k--){

          if (sn.charAt(k)=='a'){
              break;

            }System.out.print(sn.charAt(k));


        }

    }
}