package day31collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {
     /*
      1)interface'lerden object olusturulamaz cunku interface'lerin constructor'i yoktur.
      2)Abstract Class'lardan object olusturulamaz, constructor'lari vardir ama constructor object olusturmada kullanilamaz.
      3)interface'lerin constructor'lari olmadigindan collection olustururken interface isimleri "new" keyword'unden sonra kullanilamaz.
      4)*Bir class'ı --> class'ın childe'ı yapmak icin ==> extends kullanıyoruz
       class'ı --> interface'in childe yapmak icin ==> implements kullanıyoruz.
       *interface --> interface'in childe'i yapmak icin ==> extends
       interface --> class'ın childe olamaz ==> Bu mumkun degildir.

      5)ArrayList'ler eleman silme ve eleman eklemede basarisizdirlar. O yuzden eleman silme ve ekleme islemleri coklukla
        yapilacaksa ArrayList kullanmak tavsiye edilmez.
      6)LinkedList'ler index kulanmadiklarindan eleman silme ve eklemede re-index yapilmasina gerek yoktur. Bu da LinkList
        leri eleman ekleme ve silmede cok basarili hale getirir. Bu yuzden eleman ekleme ve silmenin cok yapilmasi gereken
        durumlarda LinkList kullanmak tavsiye edilir.
        ==>//LinkedListler "Node"lerden olusur."Node"demek iki parçadan olusur. "data bolumu" ve "pointer" bolumu pointer bir sonraki elemani gösterir
      7)ArrayList'lerde "search" islemi kolay yapilir cunku index'ler adres gibidir.
      8)LinkedList'lerde "search" islemi zor yapilir cunku LinkedList'ler index kullanmaz index kullanmayinca herhangi
        bir elemani bulmak icin en bastan tum elemanlar kontrol edilir bu da cok fazla is demektir.
     */

    public static void main(String[] args) {

        List<String>citynames = new LinkedList<>();

        LinkedList<String> names = new LinkedList<>();

        names.add("Steve");
        names.add("Ajda");
        names.add("Raj");
        names.add("Megan");
        names.add("Brandon");

        System.out.println(names);//[Steve, Ajda, Raj, Megan, Brandon]

        names.addFirst("Cuneyt");//ilk basa eleman ekler
        System.out.println(names);//[Cuneyt, Steve, Ajda, Raj, Megan, Brandon]

        names.addLast("Ajda");//addLast(); is equivalent to add.(Bu yontem add yontemle aynı)
        System.out.println(names);//[Cuneyt, Steve, Ajda, Raj, Megan, Brandon, Ajda]

        names.add(3,"Suleyman");//List index kullanmaz ama biz 3 yazdigimizda 3. kutudan sonrasina
                                             // ekleme yapar
        System.out.println(names);//[Cunet, Steve, Ajda, Suleyman, Raj, Megan, Brandon, Ajda]

        names.remove("Ajda");//remove(object);  İlk Ajda'yi siler ve loop'u kirar.
        System.out.println(names);//[Cuneyt, Steve, Suleyman, Raj, Megan, Brandon, Ajda]

        names.remove(4);//remove(int ) indexile siler Megan silindi
        System.out.println(names);//[Cuneyt, Steve, Suleyman, Raj, Brandon, Ajda]

        names.add("Suleyman");
        names.add("Suleyman");
        System.out.println(names);//[Cuneyt, Steve, Suleyman, Raj, Brandon, Ajda, Suleyman]

        String r1 = names.remove();//Retrieves and removes the head (first element) of this list.(Cut Paste)
                       // (ilk elemani siler alır ve size verir)
        System.out.println(r1);//Cuneyt' isildi
        System.out.println(names);//[Cunet, Steve, Suleyman, Raj, Brandon, Ajda, Suleyman]

        names.removeFirstOccurrence("Suleyman");//İlk gorunumunu siler
        System.out.println(names);//[Steve, Raj, Brandon, Ajda, Suleyman, Suleyman]

        names.removeLastOccurrence("Suleyman");//Son gorunumunu siler
        System.out.println(names);//[Steve, Raj, Brandon, Ajda, Suleyman]

        //Retrieves, but does not remove, the head (first element) of this list.(Copy + Paste)
        //Returns: the head of this list, or null if this list is empty
        String r2 = names.peek();//pee(); ilk elemani silmeden kopyalayip veriyor
        System.out.println(r2);//Steve
        System.out.println(names);//[Steve, Raj, Brandon, Ajda, Suleyman]

        //Retrieves and removes the head (first element) of this list.(Cut + Paste)
        //Returns: the head of this list, or null if this list is empty
        //(bu listenin başı veya bu liste boşsa null)
        //remove();==>bos LinkedList'te kullanilirsa "hata verir", poll();==>bos "LinkedList'te kullanilirsa "null" verir
        names.poll();


        //Pops an element from the stack represented by this list.(Copy + Paste)
        //This method is equivalent to removeFirst().
        // Returns: the element at the front of this list (which is the top of the stack represented by this list)
        //pop() ile remove() ayni isi goruyor
        names.pop();









    }
}
