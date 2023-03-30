package day13whileloopdowhileloop;

import java.util.Arrays;

public class ArraysTekrar {
    public static void main(String[] args) {

        int a =12;//Bu yapinin icinde sadece bir tane data depolanabilir
        //Amam biz kd yazarken bir yapinin icinde coklu data depolama ihtiyaci hissederiz.
        //Bir yapinin icinde coklu data depolayabilmek icin Java "Array" yapisini olusturmustur.

        //Array nasil olusturulur?
        //Array olusturmak icin Array elemanlarinin "data type"i ve "eleman sayisi" mutlaka yazilmalidir.
        String stdName[] =new String[5];

        System.out.println(Arrays.toString(stdName));//[null, null, null, null, null]
        //
        stdName[2]= "Ajda";
        stdName[0]= "Cuneyt";
        stdName[1]= "Kemal";
        stdName[3]= "Ezel";
        stdName[4]= "Besir";

        System.out.println(Arrays.toString(stdName));//[Cuneyt, Kemal, Ajda, Ezel, Besir]

        //Array'den specific bir elemani almak
        System.out.println(stdName[2]);//Ajda

        //Ex 1: Array'deki elemani sonuna "!" isareti kayarak ekrana yazdiriniz.

        for (int i=0; i<stdName.length; i++){

            System.out.println(stdName[i] + "!");

        }









    }
}
