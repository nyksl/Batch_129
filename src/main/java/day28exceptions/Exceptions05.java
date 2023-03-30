package day28exceptions;

public class Exceptions05 {

    public static void main(String[] args) {

        int a = 12;
        int b = 4;
        String s = "My Java";

        getCharFromString(s, a, b);

    }

    //try kisminda birden fazla Exception olusturma ihtimali olan kod varsa,coklu "cath" kullanabilirsiniz.
    //Coklu "cath" kullandiginizda Exception Class'lar arasinda "parent-child" iliskisi yoksa, catch'lerin sirasi
    //onemli degildir. Ama kod'daki siralamaya uymak tavsiye edilir.
    //Coklu "cath" kullandiginizda Exception Class'lar arasinda "parent-child" iliskisi varsa, catch'lerin sirasi
    //onemlidir, child olan class ustte olmalidir.

    // Exception Class'lar arasinda "parent-child" iliskisi varsa, ya child class'i uste yazarak child ve parent class'lar
    //icin ozellestirilmis codlar yazarsniz. (hirsiz icin 155, hasta icin 112'yi ararsiniz')
    //Veya child'i hic kullanmaz sadece parent ile exception'lari handle
    // etmeye calisirsiniz.(Hirsiz icin 911, hasta icin 911 gibi)
    public static void getCharFromString(String s, int a, int b){

        try {
            int idx = a / b;//12'yi 4'e bolduk =3

            char ch = s.charAt(idx);//charAt ile idx 3'ü aldık atama operatoru 3'u ch'nin icine koydu

            System.out.println(ch);//ch yi yazdirinca My Javanin index'i 3 olan J'yi yazdıracak

        }catch (ArithmeticException e){
            System.out.println("Do not divide by zero");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Olmayan index kullandiniz");

        }
    }
}
