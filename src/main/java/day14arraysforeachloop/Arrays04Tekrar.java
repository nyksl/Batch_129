package day14arraysforeachloop;

public class Arrays04Tekrar {
    public static void main(String[] args) {

        //Example 1: String bir array olusturnuz, 6 eleman ekleyiniz, Siyah'tan onceki elemanlari yazdiriniz

        String renkler[] = new String[6];

        renkler[0] = "Mavi";
        renkler[1] = "Kırmızı";
        renkler[2] = "Beyaz";
        renkler[3] = "Siyah";
        renkler[4] = "Turuncu";
        renkler[5] = "Yesil";

        for (String w : renkler){

            if (w.equals("Siyah")){
                break;


            }System.out.println(w);

        }
        System.out.println();

        //Example 2: String bir array olusturnuz, 6 eleman ekleyiniz, "Siyah" tan sonraki elemanlari yazdiriniz

        String yrenkler[] = new String[6];

        yrenkler[0] = "Mavi";
        yrenkler[1] = "Kırmızı";
        yrenkler[2] = "Beyaz";
        yrenkler[3] = "Siyah";
        yrenkler[4] = "Turuncu";
        yrenkler[5] = "Yesil";

        //1.Yol:
        //Note: Elemanlari almaya son elemandan baslayacagim icin for-each loop kulanamam,
        // bu yuzden for-loop kullandim.
        for (int i=yrenkler.length-1; i>=0; i--) {

            if (yrenkler[i].equals("Siyah")) {
                break;
            }
            System.out.println(yrenkler[i]);
        }
        System.out.println();

        //2.Yol:
        //Siyah elemaninin index'ini bul ve o index'den daha buyuk index'e sahip olan elemanlari yazdir.

        int sayac = 0;

        for(String w : yrenkler){
            if(w.equals("Siyah")){
                break;
            }
            sayac++;
        }
        for(int i=sayac+1; i<yrenkler.length; i++ ){
            System.out.println(yrenkler[i]);

        }



    }
}
