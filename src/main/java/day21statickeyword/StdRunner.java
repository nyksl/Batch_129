package day21statickeyword;

import java.util.Arrays;
import java.util.List;

public class StdRunner {
    public static void main(String[] args) {
        //stdNmae static oldugundan ona ulasmak icin object olusturmadim
        //Sadece clas ismini kullanmak yeterlidir.
        System.out.println(Student.stdName);

        //age non-satic oldugundan ona ulasmak icin object olusturmak
        //zorundayiz.
        Student std1 = new Student();//Obje
        System.out.println(std1.age);

        String initials = Student.getInitials("Sefa Eyer");
        System.out.println(initials);//SE

        int vowels = std1.countVowels("Tom Cruise");//countVowels() kac tane sesli harf varsa onu veriyor.
        System.out.println(vowels);//4

        //static olanlari object(std1) ile cagirmak tavsiye edilmez.
        String s = std1.getInitials("Ali Can");
        System.out.println(s);//AC
        //List olusturmada yeni bir method.
        List<String>names = List.of("Ali","Veli","Can","Kemal");//
        System.out.println(names);//[Ali, Veli, Can, Kemal]


    }

}
