package day11forloops;

public class ForLoops02Tekrar {
    public static void main(String[] args) {

        //Example 1: Verilen bir String'de 'a' karakteri haric tum karakterleri yazdiriniz
        //          "Madagaskar" ==> Mdgskr

        //1.Yol
        String s = "Madagaskar";

        String t = s.replace("a", "");
        System.out.println(t);

        //2.Yol
        for (int i =0; i<s.length(); i++ ){

            char ch = s.charAt(i);
            if(ch!='a') {
                System.out.print(s.charAt(i));

                }
            }
        System.out.println();
        //3.Yol

        for (int i =0; i<s.length(); i++ ){
            char ch = s.charAt(i);
            if (ch=='a'){
                continue;
            }
            System.out.print(ch);

        }

    }
}

