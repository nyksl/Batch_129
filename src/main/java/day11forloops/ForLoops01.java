package day11forloops;

public class ForLoops01 {
    public static void main(String[] args) {

        //Example 1: Verilen bir String'de ilk 'a' harfinden onceki tum character'leri console'a yazdiriniz
        //           "Tramvay" ==> "Tr"
        String s = "Tramvay";

        for (int i=0; i<s.length(); i++){

            if (s.charAt(i)=='a'){
                break;
            }
            System.out.println(s.charAt(i));
        }

        //Example 2: Verilen bir String'de son 'a' dan sonraki tum character'leri ters sirada yazdiriniz
        //           "Germany" ==> yn


        String sn = "Germany";

        for (int k=sn.length()-1; k>=0; k--){

            if (sn.charAt(k)=='a'){
                break;

            }System.out.print(sn.charAt(k));


        }

    }

}
