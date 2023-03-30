package day32collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {

        /*
          "Queue"larda ilk gelen lk isleme girer.(First In First Out==> FIFO)
           Bazende son gelen ilk isleme girer. (Last In First Out ==> LİFO)
          "Deque"  "Double Ended Queue" hem "FİFO" hem de "LİFO" icin kullanilir.

          "Queue" bir interface'dir, bu yuzden construcor'i yoktur dolayisiyla object olustururken "new" keyword'unden sonra kullanilamaz
           Data Type'i "Queue" olan bir object oluşturmak için "new" keyword'unden sonra
           i)LinkedList veya ii)PriorityQUeue Class'ları kullanılabilir

            "Queue" olustururken constructor olarak "PriorityQueue" kullanirsaniz, elemanlari kendi belirleyeceginiz kurala gore
          siralama hakkiniz olur.


        */

    public static void main(String[] args) {

        Queue<String> myQueue = new LinkedList();
        myQueue.add("Milk");
        myQueue.add("Butter");
        myQueue.add("Jam");
        myQueue.add("Egg");
        myQueue.add("Luxury water");

        System.out.println(myQueue);//[Milk, Butter, Jam, Egg, Luxury water]

        //Retrivies and removes the "head of this queue", or returns "null" if this queue is empty.
        //"Bu kuyruğun başını" alır ve kaldırır veya bu sıra boşsa "null" değerini döndürür.
        myQueue.poll();//cut paste yapar. ilk elemanı verir. boşsa null verir.

        myQueue.remove();//cut paste yapar. ilk elemanı verir. boşsa exception atar.


        //Retrieves, but does not remove, the head of this queue.
        // This method differs from peek only in that it throws an exception if this queue is empty.
        //Throws: NoSuchElementException - if this queue is empty
        //Bu kuyruğun başını alır, ancak kaldırmaz. Bu yöntem, yalnızca bu sıra
        // boşsa bir istisna atması bakımından gözetlemeden farklıdır.
        // Atar: NoSuchElementException - bu sıra boşsa
        myQueue.element();//copy paste yapar.ilk elemanı verir.peek metodundan farkı boş olduğunda exception atmasıdır.

        //Queue dolu ise ikisi de (element-peek) ayni isi yapar.
        // Bossa peek null verir.Element exception atar

        //Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
        //Bu kuyruğun başını alır, ancak kaldırmaz veya bu sıra boşsa null değerini döndürür.
        //null verirse exceptions verir.
        myQueue.peek();//copy paste yapar.ilk elemanı verir.boşsa null verir.

        /*
        poll() ile remove() ikiside ilk elemani silmeden size verir.
        poll() bos "Queue" lar icin "null" verir, remove() ise bos "Queue" ler icin Exception atar.
        */

        /*
        element() ile peek() ikiside ilk elemani silmeden size verir.
        peek() bos "Queue" lar icin "null" verir, element() ise bos "Queue" ler icin Exception atar.
        */

        /*
        Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions.
        When using a capacity-restricted queue, this method is generally preferable to add,
        which can fail to insert an element only by throwing an exception.

        Returns:true if the element was added to this queue, else false
        Throws:ClassCastException – if the class of the specified element prevents it from being added to this queue
        NullPointerException – if the specified element is null and this queue does not permit null elements
        IllegalArgumentException – if some property of this element prevents it from being added to this queue
         */

       boolean r =  myQueue.offer("Avocado");//
        System.out.println(r);//true


        /*
         "Queue" olustururken constructor olarak "PriorityQueue" kullanirsaniz, elemanlari kendi belirleyeceginiz kurala gore
          siralama hakkiniz olur.
        */
        Queue<String> yourQueue = new PriorityQueue<>();
        yourQueue.add("Butter");
        yourQueue.add("Jam");
        yourQueue.add("Egg");
        yourQueue.add("Luxury water");

        System.out.println(yourQueue);//[Butter, Jam, Egg, Luxury water]












    }
}
