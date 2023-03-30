package day22staticblocksconstructors;

public class StaticBlocks01 {

    //Bir variable olsuturdugunuz da , deger atamazsaniz o variable'i initialize etmediniz demektir.
    //sattic veriable'ler static black'laricinde initialize edilirse o clas'in icinde herseyden once hazir hale getirilmis olur
    //bazen main method calistirilmadan once veriable'lerin hazir hale getirilmesi gerekir bu yuzden static blac'lar kullanilir.

    //Note 1: "static block'lar" static veriable'leri initizalize etmek icin kullanilirlar
    //Note 2:  "static block'lar" clas icinde "herseyden once" calistirilirlar
    static double pi;
    static String shape;

    static {
        pi = 3.14;
        System.out.println("Static block 1");
    }
    static {
        shape = "Circle";
        System.out.println("Static block 2");
    }

    public static void main(String[] args) {
        System.out.println("main method");

    }








}
