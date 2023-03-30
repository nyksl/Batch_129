package day04asciiwrapperclassoperatorsmemoryyusage;

public class WrapperClassTekrar {

    public static void main(String[] args) {
        short maxShort = Short.MAX_VALUE;
        System.out.println(maxShort);

         short minShort = Short.MIN_VALUE;
        System.out.println(minShort);

       int intMin= Integer.MIN_VALUE;
        System.out.println(intMin);

       int intMax = Integer.MAX_VALUE;
        System.out.println(intMax);

        byte byteMin = Byte.MIN_VALUE;
        System.out.println(byteMin);

        byte byteMax = Byte.MAX_VALUE;
        System.out.println(byteMax);

        // Example : Size String olarak verilen iki fiyayın toplamını ekrana yazdırınız

        String gomlek = "2500";
        String ayakkabi = "5200";
        System.out.println(gomlek + ayakkabi);

        int topla = Integer.valueOf(gomlek) + Integer.valueOf(ayakkabi);

        System.out.println(topla);

        //Example : Size string olarak verilen iki fiyat'ın toplamını ekrana yazdırınız.

        String tv = "$1500";
        String radio = "$500";
        System.out.println(tv + radio);//$1500$500

        int toplaFiyat = Integer.valueOf(tv) + Integer.valueOf(radio);












    }
}

