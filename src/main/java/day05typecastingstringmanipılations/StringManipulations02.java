package day05typecastingstringmanipılations;

public class StringManipulations02 {
    public static void main(String[] args) {

        String s = "Learn Java earn money";


        //Example 1: "s" Sting'inin money ile bitip bitmediğini kontrol ediniz.

       boolean isEnd = s.endsWith("money");
        System.out.println(isEnd);

        //Example 2: "s" Sting'indeki money kelimesini "dollar" kelimesine ceviriniz.
        String newS1 = s.replace("money", "dollar");
        System.out.println(newS1);

        //Example 3: "s" Stringing'deki "earn" kelimesini "win" kelimesine ceviriniz,

        String s2 = s.replace("earn", "win");
        System.out.println(s2);//Lwin Java win money

        //Example 4: "s" Stringing'deki "a" kelimesini "*"a ceviriniz

        //Not: replace() metodunda coklu character ile calisirsaniz cift tırnak kullanacaksınız
        //Ama tek tırnak ile calısırsanız cift tırnak veya tek tırnak kullanabilirsiniz.
        //Ama ya ikiside cift tırnak olmalıdır, yada ikisi de tek tırnak olmalıdır.
        String s3 = s.replace("a", "*");
        System.out.println(s3);//Le*rn J*v* e*rn money

        //Not: Ama ya ikiside cift tırnak olmalıdır, yada ikisi de tek tırnak olmalıdır.
        //Example 5: "s" Stringing'deki "n" kelimesini "xxx"a ceviriniz.
        String s4 = s.replace("n", "xxx");
        System.out.println(s4);

        //Example 6: "s" Stringing'deki tum "e harflerini siliniz.
        //Note: Hiç birşey char data type'ede yok bu yuzden replace() metodu kullanarak silme islemi yaparsanız mutlaka cıft tırnak kullanınız.

        String s5 = s.replace("e", "");
        System.out.println(s5);//Larn Java arn mony

        String t = "Ali 13 yasindadir...";


        //Example 7: "t" String'indeki tüm rakamları(0,1,2,3,4,5,6,7,8,9) "*"a ceviriniz.
        //Not: Bir grup data'yi degistirmek icin replaceAll() kullanılır.
        //Not: Bir grup data'yi ifade etmek icin "Regular Expression" (Regex) kullanılır.
        String t1 = t.replaceAll("[0-9]", "*");
        System.out.println(t1);//Ali ** yasindadir...
        /*
        Meshur Regex'ler
        1)Tum rakamlar==> [0-9]
        2)Tum kucuk harfler [a-z]
        3)Tum buyuk harfler [A-Z]
        4)Tum kucuk harfler ve buyuk harfler ==>[a-zA-Z]
        5)Tum harfler ve rakamlar ==[a-zA-Z0-9]
        6)Tum noktalama isaretleri ==> [\\p{Punct}
        7)Tum sesli harfler ==> (aeiouAEİUO)
         x, y, w harfleri ==>[xyw]
        8) Kucuk harflerden farklı tum characterler ==>[^a-z]
        9)Tum harflerden farkli tum character'ler ==> [^a-zA-Z]
        10) Space dısındaki tum characterler ==> \\S
         */

        //Example 8: "t" String'indeki tum rakamları ve harfleri "!"ceviriniz
        String t2 = t.replaceAll("[a-zA-Z0-9]", "!");
        System.out.println(t2);//!!! !! !!!!!!!!!!...

        //Example 9: "t" String'indeki tum sesli harfleri "?"ceviriniz
        String t3 = t.replaceAll("[aeiuoAEİUO]", "?");
        System.out.println(t3);//?l? 13 y?s?nd?d?r...

        //Example 10: "t" String'indeki kucuk harfler dısındaki tum characterleri "<>" ceviriniz.

       String t4 = t.replaceAll("[^a-z]", "<>");
        System.out.println(t4);//<>li<><><><>yasindadir<><><>

        //Example 11: "t" String'indeki tum harfler dışındaki tum characterleri "+" ceviriniz.
        String t5 = t.replaceAll("[^a-zA-Z]", "+");
        System.out.println(t5);//

        //Example 12: "t" String'indeki space'ler dısındaki tum characterleri "+" ceviriniz.
     String t6 = t.replaceAll("[^ ]", "+");
     System.out.println(t6);//+++ ++ +++++++++++++

     //Example 13: "t" String'indeki sesli harfler dısındaki tum characterleri "&" ceviriniz.
     String t7 = t.replaceAll("[^aeiuoAEİUO]", "&");
     System.out.println(t7);






















    }
}
