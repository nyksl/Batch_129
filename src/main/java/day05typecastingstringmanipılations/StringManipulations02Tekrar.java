package day05typecastingstringmanipılations;

public class StringManipulations02Tekrar {
    public static void main(String[] args) {


        String s = "Learn Java earn money";

        //Example 1: "s" Sting'inin money ilebitip bitmediğini kontrol ediniz.
       boolean isEnd = s.endsWith("money");
        System.out.println(isEnd);

        //Example 2: "s" Sting'indeki money kelimesini "dollar" kelimesine ceviriniz.
       String s1 = s.replace("money","$" );
        System.out.println(s1);

        //Example 3: "s" Stringing'deki "earn" kelimesini "win" kelimesine ceviriniz,

       String s2 = s.replace("earn", "win");
        System.out.println(s2);

        //Example 4: "s" Stringing'deki "a" kelimesini "*"a ceviriniz,
       String s3 = s.replace('a','*');
        System.out.println(s3);

        //Example 5: "s" Stringing'deki "n" kelimesini "xxx"a ceviriniz.
        String s4 =  s.replace("n","xxx");
        System.out.println(s4);

        //Example 6: "s" Stringing'deki tum "e harflerini siliniz.
        String s5 = s.replace("e","");
        System.out.println(s5);

        String e = "Ali 13 yasindadir...";
        //Example 7: "e" String'indeki tüm rakamları(0,1,2,3,4,5,6,7,8,9) "*"a ceviriniz.

      String e1 = e.replaceAll("[0-9]", "*");
        System.out.println(e1);

        //Example 8: "e" String'indeki tum rakamları ve harfleri "!"ceviriniz
       String e2 = e.replaceAll("[a-zA-Z0-9]", "!");
        System.out.println(e2);

        //Example 9: "e" String'indeki tum sesli harfleri "?"ceviriniz
        String e3 = e.replaceAll("[aeiouAEIOU]","?");
        System.out.println(e3);

        //Example 10: "t" String'indeki kucuk harfler dısındaki tum characterleri "<>" ceviriniz.
       String e4 = e.replaceAll("[^a-z]","<>");
        System.out.println(e4);

        //Example 11: "e" String'indeki kucuk harfler dısındaki tum characterleri "+" ceviriniz.
        String e5 =e.replaceAll("[^a-zA-Z]", "+");
        System.out.println(e5);

        //Example 12: "t" String'indeki kucuk harfler dısındaki tum characterleri "+" ceviriniz.
        String e6 = e.replaceAll("[^ ]", "+");
        System.out.println(e6);

        //Example 13: "t" String'indeki sesli harfler dısındaki tum characterleri "&" ceviriniz.
        String e7 = e.replaceAll("[^aeiouAEİUO]", "&");
        System.out.println(e7);




    }


}
