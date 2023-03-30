package day05typecastingstringmanipılations;

public class StringManipulations01Tekrar {

    public static void main(String[] args) {

        String s = "Java is easy";

      String büyük = s.toUpperCase();//Buyuk yazdırmak icin
        System.out.println(büyük);

        String c = s.toLowerCase();//Kucuk yazdırmak icin
        System.out.println(c);

        //Example 3: "s" String'indeki ilk character'i alınız.

        char z = s.charAt(0);
        System.out.println(z);

        //Example 4: "s" String'indeki ikinci ve sondan ikinci character'i alınız ve ekrana yanyana yazdırınız.

        char x = s.charAt(1);
        char l = s.charAt(11);

        //1.Yoll aynı satırda yazdırır.
        System.out.print(x);
        System.out.println(l);

        //2. Yol aynı satırda yazdırmak icin("") koyarsak String olarak görecegi icin matematiksel islem yapmıcak.
        System.out.println("" + x + l);//

        //Example 5: "s" String'inde kullanılan character sayısını bulunuz.

        int j =  s.length();// charekter sayısını verir.
        System.out.println(j);

        //"s" String'indeki ilk 4 characteri alınız.

        String p = s.substring(0, 4);//substring'de(0, 4) ==> yani ilk index dahil, "4" yani ikinci index haric'dir.(0,4)
        System.out.println(p);

        //"s" String'indeki "is" kelimesini alınız.
        String g = s.substring(5,7);
         System.out.println(g);

         //"s" String'indeki "easy" kelimesini alınız.
         String w = s.substring(8);//cumle bittigi icin sadece "8" yazdırılır.
         System.out.println(w);

         //"s" String'inde "money" kelimesinin var olup olmadıgını kontrol ediniiz.

          boolean r = s.contains("money");//kelime aramak icin kullanılır. (true-false) verir
        System.out.println(r);

        //"s" String'inin belli bir harfle baslayıp baslamadıgını kontrol ediniz.

        boolean ı =s.startsWith("Java");
        System.out.println(ı);














    }
}
