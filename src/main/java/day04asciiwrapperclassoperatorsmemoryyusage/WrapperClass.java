package day04asciiwrapperclassoperatorsmemoryyusage;

public class WrapperClass {

    public static void main(String[] args) {
        //primitive:        char - boolean - byte - short - int - long - float - double
        //Wrapper Class: Charater - Boolean - Byte -Short - İnteger - Long - Float - Double
        //Wrapper Class'lar non-primitive'dir o yuzden memory'de cok yer kaplar,o yuzden sart degilse
        // Wrapper Class kullanmayı tercih etmeyiz.

        int n = 12;//   "n" yazıp nokta koyarsanı hic metod goremezsiniz cunku primitivler metod icermez.

        Integer m = 12; //"m" yazıp nokta koyarsanız bircok metod görursunuz, cunku "wrapper class"lar metod icerir

        byte p = 23;

        Byte r = 43;
       //Example 1: short data taype'nin minumum ve maximum degerlerini kod yazarak bulunuz

       short maxShort = Short.MAX_VALUE;
        System.out.println(maxShort);//32767
       short minShort = Short.MIN_VALUE;
        System.out.println(minShort);//-32768

        //Example 2: int data taype'nin minumum ve maximum degeri ile byte data type'nin maximum degerinin toplamını bulunuz
       int intMin =  Integer.MIN_VALUE;
       byte byteMax = Byte.MAX_VALUE;
        System.out.println("Toplam:" + (intMin + byteMax));//-2147483521

        //Example 3: i) Primitive int'i Wrapper İnteger'a ceviriniz (Autoboxing)
        int num = 22;

        Integer wrapperNum = num;
        System.out.println(wrapperNum);//22

        //    ii)Wrapper Byte'i primitive byte'a ceviriniz.(Unboxing)

        Byte k = 43;
        byte primitiveK = k;
        System.out.println(primitiveK);

        //Example 4: i)i)Primitive char'ı Wrapper Character'e ceviriniz(Autoboxing
        //           ii)Wrapper Boolean'i primitive boolean'a ceviriniz.(Unboxing)

        char initial = 'T';
        Character initialWrapper = initial;
        System.out.println("T");

        Boolean isOld = true;
        boolean isOldWrapper = isOld;
        System.out.println(isOldWrapper);

// Example 5: Size String olarak verilen iki fiyayın toplamını ekrana yazdırınız
        String shirt = "2300";
        String shoes = "5200";

        //Java'da "+" sembolu iki sayı arasında kullanılırsa toplama işlemi olur.
        // Java'da "+" sembolu iki String arasında kullanılırsa "concatenation" islemi olur.
        //Concatenation islemlerinde Java matametikteki islem onceligi kurallarını kullanır.
        //Islem onceligi kuralları: i)Once uslu sayılar ii) Parantez ici islemler yapılır iii) Carpma ve bolme iv) Toplama ve cıkarma
        System.out.println(shirt + shoes);//23005200

        int toplamFiyat = Integer.valueOf(shirt) + Integer.valueOf(shoes);
        System.out.println(toplamFiyat); // 7500

        //Example 6: Size string olarak verilen iki fiyat'ın toplamını ekrana yazdırınız.
        //Note: volueOf metodu tum karakterleri rakam olan String'leri sayılara cevirir.
        //Eger volueOf metodu kullanırken String içine rakam olmayan bir karakter koyarsanız hata alırsınız.
        String tv = "$11000";
        String radio = "$3000";

        System.out.println(tv + radio);
        int totalPrice = Integer.valueOf(tv) + Integer.valueOf(radio);


    }
}
