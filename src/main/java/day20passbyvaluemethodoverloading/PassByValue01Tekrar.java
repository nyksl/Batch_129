package day20passbyvaluemethodoverloading;

public class PassByValue01Tekrar {

      /*
  1) Java "pass-by-value" sayesinde variable'larin orjinal degerlerini koruma altina alir.
   */

    public static void main(String[] args) {
        double gomlek=100;

        double ogrenciGomlekFiyati = inirim("ogrenci",gomlek);
        double gaziGomlekFiyati= inirim("gazi",gomlek);
        double yasliGomlekFiyati=inirim("yasli",gomlek);

        System.out.println(gomlek);
        System.out.println(ogrenciGomlekFiyati);
        System.out.println(gaziGomlekFiyati);
        System.out.println(yasliGomlekFiyati);

    }//stete durum demek hangi durumda indirim yapacagimizi belirlemek icin
    public static double inirim(String state, double gomlek){

        switch (state) {
            case "ogrenci":
                gomlek = gomlek * 0.90;
                break;

            case "gazi":
                gomlek = gomlek * 0.80;
                break;

            case "yasli":
                gomlek = gomlek * 0.70;
                break;

            //ogrenci, gazi ve yasli disinda bir sey yazilirsa indirim yapılmayacak
            // o yzden default diyoruz
            default:
                gomlek = gomlek;//indirim yapma
        }
        return gomlek;

    }
}
