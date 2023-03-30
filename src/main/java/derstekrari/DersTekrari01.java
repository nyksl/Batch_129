package derstekrari;

public class DersTekrari01 {
    public static void main(String[] args) {

        // Stringdeki bos ve spaceleri silelim.
        // "   Ali Can   "




        String shirt = "$750";
        String shoes = "$950";

        String ff = shirt.replace("$", "");
        System.out.println(ff);

        String s1 = shoes.replace("$", "");
        System.out.println(s1);

        Double totalPric = Double.valueOf(ff) + Double.valueOf(s1);
        System.out.println(totalPric);

        String kase = "$350";
        String tabak = "$500";

        String b = kase.replace("$", "");
        System.out.println(b);

        String c = tabak.replace("$", "");
        System.out.println(c);

        Double total = Double.valueOf(b) + Double.valueOf(c);
        System.out.println(total);

        String kazak = "$500";
        String Jean = "$700";

         String kk = kazak.replace("$", "");
         String ss = Jean.replace("$", "");


         Double aa = Double.valueOf(kk) + Double.valueOf(ss);
        System.out.println(aa);


        // Beyza Yukel isminin ikl ve soyisminin ilk harflerini yazdır.
        String ee = " beyza yusKel ";
       char ilkHarf= ee.trim().toUpperCase().charAt(0);
        System.out.println(ilkHarf);

        char ikinciHarf = ee.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(ikinciHarf);

        System.out.println("" + ilkHarf + ikinciHarf);//BY

        String cc = "";

        boolean ff1 = cc.length()==0;
        System.out.println("String bos mu?" +ff1);

        boolean jj1 = cc.isEmpty();
        System.out.println("String bos mu?" + jj1);

        String dd = "      ";

        boolean ffr = dd.replace(" ", "").length()==0;
        System.out.println("Sadece space mi var?" + ffr); //true

        boolean kkk = dd.replace(" ", "").isEmpty();
        System.out.println("Sadece space mi var?" + kkk);//true

        boolean lll = dd.replace(" ", "").isBlank();
        System.out.println("Sadece space mi var?" + lll); //true


        //Stringte a, e, i character'lerinin ilk gorunumlerinin indexleri toplamını yazdırınız.
        String zz = "Java is easy to learn";
        int rr  = zz.indexOf('a');
        System.out.println(rr);

        int yy = zz.indexOf('e');
        System.out.println(yy);

        int pp = zz.indexOf('i');
        System.out.println(pp);

        System.out.println("İndex'lerinin toplamı"+ (rr + yy + pp));



        //String'te a, e, i characterlerinin son gorunumlerinin indexleri toplamını yazdırınız.
        String nnn = "Java is easy to learn";

        int vv = nnn.lastIndexOf('a');
        System.out.println(vv);

        int jkl = nnn.lastIndexOf('e');
        System.out.println(jkl);

        int mlk = nnn.lastIndexOf('i');
        System.out.println(mlk);

        System.out.println("Son indexleri toplamı" + (vv + jkl + mlk));


        //Bir String'teki tekrarsız character'leri ekrana yazdırınız,
       String z = "aacb";
       char zs1 = z.charAt(0);
       if(z.indexOf(zs1)==z.lastIndexOf(zs1)){
           System.out.println(zs1);

       }

       char zs2 = z.charAt(1);

       if(z.indexOf(zs2)==z.lastIndexOf(zs2)){
           System.out.println(zs2);
       }
       char zs3 = z.charAt(2);

       if(z.indexOf(zs3)==z.lastIndexOf(zs3)){
           System.out.println(zs3);
       }
       char zs4 = z.charAt(3);
       if(z.indexOf(zs4)==z.lastIndexOf(zs4)){
           System.out.println(zs4);
       }






































    }

}