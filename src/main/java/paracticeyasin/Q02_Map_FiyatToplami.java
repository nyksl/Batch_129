package paracticeyasin;

import java.util.*;

public class Q02_Map_FiyatToplami {

    /*
    Bir map içerisinde verilen fiyatların toplamını bulan bir kod yazınız.(for each loop kullanınız)
    Örn: {Kemer=19.99, Gömlek=29.99, Ayakkabı=89.99, Kazak=24.99, Kravat=19.99} ==> Toplam: 184.95
    */

    public static void main(String[] args) {

        Map<String,Double> urunlerFiyatlar = new HashMap<>();
        urunlerFiyatlar.put("Kemer",19.99);
        urunlerFiyatlar.put("Gomlek",29.99);
        urunlerFiyatlar.put("Ayakkabı",89.99);
        urunlerFiyatlar.put("Kazak",24.99);
        urunlerFiyatlar.put("Kravat",19.99);

        System.out.println(fiyatToplami(urunlerFiyatlar));


    }
    public static double fiyatToplami(Map<String,Double>map){
        System.out.println("Urunler ve fitatlari: "+map );

       Collection<Double> fiyatlar = map.values();
        System.out.println("= " + fiyatlar);

        double toplam=0;
        for (double w : fiyatlar){
            toplam += w;

        }


        return toplam;

    }

}
