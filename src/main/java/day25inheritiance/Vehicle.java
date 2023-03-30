package day25inheritiance;

public class Vehicle {

    /*
    Ortak kullanima acik methodlar (İnheritiance)
        1)Child Class'dan bir object olusturdugunuzda Constructor'lar en ustteki
          parent class'dan baslatilarak alta dogru calistirilir.
        2)Child Class'daki constructorden Parent Class'daki constructor'a gidebilmek icin "super()" kullanilir.
        3)Parent Class'da birden fazla constructor varsa istenilen constructor,super() ifadesinin icine yazilan
          parametreler yardimi ile secilebilir.
        4)Ayni class icindeki constructor'lari secmek icin "this()" kullanilir.
         Ayni Class'da birden fazla constructor varsa istenilen constructor,"this()" ifadesinin icine yazilan
         parametreler yardimi ile secilebilir.
        5)"super()" ifadesini yazmak istege baglidir, yazmasaniz da Java sanki "super()" varmis gibi davranir.
         Ama kodunuzu daha okunur kilmak icin yazmaniz tavsiye edilir.
        6)"super()" ve "this()" ifadeleri constructor icinde her zaman ilk satirda olmalidir.
        7)Bir constructor icinde "super()" ve "this()" ifadeleri sadece bir kere kullanilabilir.Bakiniz 6. kural...
        8)Inheritance'da variable'lari ve method'lari cagirmak icin "this" veya "super" kullanilir.
          "this" ayni class icindeki variable'lari ve method'lari cagirmak icin kullanilir.
          "super" parent class icindeki variable'lari ve method'lari cagirmak icin kullanilir.
        9)Inheritance'da object kullanarak variable cagirirsaniz, object;in data type'ini temsil eden class'dan
          variable'i aramaya baslayiniz. O class'da yoksa parent'lara bakiniz.
        10)Inheritance'da object kullanarak method cagirirsaniz, object'in constructor'ini temsil eden class'dan
          method'u aramaya baslayiniz. O class'da yoksa parent'lara bakiniz.

          OOP Principals:
          i)Inheritance +
          ii)Polymorphism: Method Overloading + Method Overriding
          iii)Encapsulation -
          iv)Abstraction -
     */

    int price = 1200;

    public void engine(){
        System.out.println("Vehicle engine...");
    }
    public Vehicle(){
        System.out.println("Vehicle 1");
    }

    public Vehicle(int price){
        System.out.println("Vehicle 2: " + price);
    }

     /*
        Inheritance Faydalari (miras)
        1-Tekrar tekrar ayni kodu yazmaktan kurtarir
        2-Bir kodu degistirmek kolay olur
        3-Kod tamiri kolay olur
        4- Eger child classlara herseyi yerlestirirsek yavas olur. Ortaklari parent'a koyarsak child atomic olur, hizli calisir
     */


}
