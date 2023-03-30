package day04asciiwrapperclassoperatorsmemoryyusage;

public class AsciiValues {

    //Java'da her karakterin bir sayısal degeri vardır.
    //Bu degerler ASCII Deger'ler olarak adlandırılır.
    //Bu degerler tamamının bulundugu tabloya ASCII Table denir.

    public static void main(String[] args) {

        //Herhangi bir character'in ASCII degerini bulmak için o karakteri "int" data taype'inda
        // bir variable'in icine koyunuz.

       int ch = 'A';
        System.out.println(ch);

        int unlem = '!';
        System.out.println(unlem);

        char c1 = 'K';
        char c2 = '?';
        //Java'da char'ları matematiksel isleminde kullanırsanız Java o char'ların ASCII degerlerini kullanır.
        System.out.println(c1 + c2); //138



    }
}
