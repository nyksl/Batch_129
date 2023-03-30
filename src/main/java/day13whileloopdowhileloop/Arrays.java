package day13whileloopdowhileloop;

public class Arrays {
    public static void main(String[] args) {

        int a =12;//Bu yapinin icinde sadece bir tane data depolanabilir
        //Amam biz kodu yazarken bir yapinin icinde coklu data depolama ihtiyaci hissederiz.
        //Bir yapinin icinde coklu data depolayabilmek icin Java "Array" yapisini olusturmustur.

        //Array nasil olusturulur?
        //Array olusturmak icin Array elemanlarinin "data type"i ve "eleman sayisi" mutlaka yazilmalidir.
        String stdNames[]=new String[5];
        //Array console'a nasil yazdirir?
        //toString() metho'unu kullanmadan sadece Array ismi ile yazdirirsaniz Java o Array'in adresini yazdirir
        System.out.println(java.util.Arrays.toString(stdNames));//[null, null, null, null, null,

        //Array'e eleman nasil yapilir?
        stdNames[2] ="Ajda";
        System.out.println(java.util.Arrays.toString(stdNames));

        //Array' eleman ekleme nasil yapilir?
        stdNames[2]= "Ajda";
        stdNames[0]= "Cuneyt";
        stdNames[1]= "Kemal";
        stdNames[3]= "Ezel";
        stdNames[4]= "Besir";
        System.out.println(java.util.Arrays.toString(stdNames));//[Cuneyt, Kemal, Ajda, Ezel, Besir]
        //Array'den specific bir elemani almak
        System.out.println(stdNames[2]);

        //Ex 1: Array'deki elemani sonuna "!" isareti kayarak ekrana yazdiriniz.
        for(int i=0; i<stdNames.length; i++){

            System.out.println(stdNames[i] + "!");
        }

















    }
}
