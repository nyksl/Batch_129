package day36lambda;

public class Utils {

    //Utils = Kullanilacak Seyler Demek = Bu classin icine tekrar tekrar lazim olacak methodlari koyariz
    //tek sefer kullanilacak methodlarda kullanmamiza gerek yoktur.

    //Lambda ile kod yazarken once Javanin bize verdigi methodlari method reference icinde kullanmamiz tavsiye edilir
    //Eger method reference yetmiyorsa Util Class a koyup oradan kullaniriz
    //Util tekrar tekrar kullanacagimiz methodlarda kullanilir. Surekli kullanmayacagimiz methodlar kullanilarak Util i kalabaliklastirmak iyi degildir
    //Birseyi Util'e koydugumuzda bu herkesin isine yarayacak mi diye dusunmeliyiz!!

    public static int getLengthSquare(String s){
        return s.length()*s.length();
    }
    public static boolean isLenghtEven(String s){
       return s.length()%2==0;
    }
    public static String getLastChar(String s ){
        return s.substring(s.length()-1);
    }
    public static void printInTheSameLineWithSpace(Object obj){
        System.out.println(obj + " ");
    }
    public static boolean isNumberEven(int x){
        return x%2==0;
    }
    public static int getSumOfDigits(int x){
        int sum = 0;

        while (x!=0){
           sum = sum + x%10;

           x=x/10;
        }
        return sum;
    }





}
