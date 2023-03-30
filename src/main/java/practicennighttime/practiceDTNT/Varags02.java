package practicennighttime.practiceDTNT;

public class Varags02 {
    public static void main(String[] args) {
        //Verilen sayilardan ilki haric tüm sayilari toplayip ilksayi
        // ile carpan bir method olusturunuz
        int sayi1=5;
        int sayi2=7;
        int sayi3=2;
        int sayi4=4;
        int sayi5=9;

        sonuc(sayi1,sayi2,sayi3,sayi4,sayi5);



    }//main

    private static void sonuc(int carpilacakSayi,int... toplanacakSayi) {

        int toplam=0;

        for (int w : toplanacakSayi) {
            toplam += w;

        }
        System.out.println("toplam = " + toplam);//22

        int sonuc=toplam*carpilacakSayi;
        System.out.println("sonuc = " + sonuc);//110






    }
}
