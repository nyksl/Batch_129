package day06stringmanipulationsifstatement;

public class StringManipulationsifstatementTekrar {
    public static void main(String[] args) {

        //Example 1: Bir String'in bas ve sonunda space caharacter'i varsa siliniz.
        //             "   Ali Can   "     ==>      "Ali Can"
       String s = "  Ali Can  ";
        System.out.println(s);

       String s1= s.trim();
        System.out.println(s1);

        //trim() method'u bir String'in bas ve sonundaki space character'lerini siler, aradaki space'lere dokunmaz


        //Example 2: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        //           String tv = "$456.99";   String laptop = "$875.99";
        String tv = "$456.99";
        String laptop ="$875.99";

        String tv2= tv.replace("$", "");//replace ile "$"ı kaldırdık
        String laptop2 = laptop.replace("$", "");

        System.out.println(Double.valueOf(tv2) +Double.valueOf(laptop2));//1332.98 "valuOf" ile string'i Double'
                                                                         //         cevirip topladık



        //Example 3: Verilen ismin ilk isiminin ilk harfini ve soy isminin ilk harfini ekrana yazdiriniz
         String name = "  aLi cAn  ";
          char ilkharf = name.trim().toUpperCase().charAt(0);
        System.out.println(ilkharf);

          char ikinciharf = name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(ikinciharf);

        System.out.println(" " +ilkharf + ikinciharf);


        System.out.println();

        //Example 4: Bir String'in hic character icermedigini(Bos String) kontrol eden kodu yaziniz
        String str = "";
        //1.Yol
        boolean f1 = str.length() == 0;
        System.out.println(f1);

        //2.Yol
        boolean f2 = str.isEmpty();
        System.out.println(f2);

        //Example 5: Bir String'in space haric hicbir character icermedigini kontrol eden kodu yaziniz
        String nb = " ";
        boolean t = nb.replace(" ", "").length() == 0;
        System.out.println(t);

        boolean t1 = nb.replace(" ", "").isEmpty();
        System.out.println(t1);


        boolean t3 = nb.isBlank();
        System.out.println(t3);


        System.out.println();
        //Example 6: Bir String'de a, i, e character'lerinin ilk gorunumlerinin indexleri toplamini ekrana yazdiriniz
        //           "Java is easy to learn" ==> 1 + 5 + 8 = 14

        String idx = "Java is easy to learn";

        int ilkidx = idx.indexOf('a');
        System.out.println(ilkidx);

        int ikinciidx = idx.indexOf('i');
        System.out.println(ikinciidx);

        int ucuncuidx = idx.indexOf('e');
        System.out.println(ucuncuidx);//14

        System.out.println("index'ler toplamı:" + (ilkidx+ikinciidx+ucuncuidx));

        //Example 7: Bir String'de "Java" kelime'sinin ilk olarak kacinci index'de kullanildigini gosteren kodu yaziniz.
        //           "Ah Java vah Java sensiz olmuyorJava."==>3

        String cl = "Ah Java vah Java sensiz olmuyor Java.";


        int k = cl.indexOf("Java");
        System.out.println(k);


        //Example 8: Bir String'de a, i, e character'lerinin "son" gorunumlerinin indexleri toplamini ekrana yazdiriniz
        //           "Java is easy to learn" ==>
        String ny = "Java is easy to learn";

        int b1 = ny.lastIndexOf('a');
        System.out.println(b1);

        int c1 = ny.lastIndexOf('i');
        System.out.println(c1);

        int g1 = ny.lastIndexOf('e');
        System.out.println(g1);

        System.out.println("Son index'leri toplamı:" + (b1+ c1 + g1));//40


        //Example 9: Bir String'deki tekrarsiz character'leri ekrana yazdiriniz.
        String y = "aac";
        char d = y.charAt(0);

        if (y.indexOf(d) == y.lastIndexOf(d)) {
            System.out.println(d);
        }

        char c = y.charAt(1);
        if (y.indexOf(c) == y.lastIndexOf(c)) {
            System.out.println(c);
        }
        char i = y.charAt(2);
        if (y.indexOf(i) == y.lastIndexOf(i)) {
            System.out.println(i);


            //Example 10: Sayi pozitif ise ekrana pozitif yazdirin.
            int num = 12;
            if(num>0){

                System.out.println("Pozitif");
            }


            //Example 11: Sayi -1 ile 10 arasinda ekrana "Rakam" yazdirin
            int number = 9;
            if(number>1 && number<10){
                System.out.println("Rakam");
            }



            //Example 12: Sayi uc basamakli ise ekrana "Wooow!" yazdirin.
            int n = 123;
            if(n>99 && n<1000){
                System.out.println("Wooow");
            }


        }
    }
}