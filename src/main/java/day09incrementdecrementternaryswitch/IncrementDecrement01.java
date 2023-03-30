package day09incrementdecrementternaryswitch;

public class IncrementDecrement01{
    public static void main(String[] args) {

        // İncrement 1:

        int a = 5;
        System.out.println(a);//5

        a = a + 2;// veya a += 2;
        System.out.println(a);//7

        //Ex 1: Bir tane integer variable olusturun ve onu iki sekilde 5 artirin.

        int f = 10;
        System.out.println(f);//10

        f = f +5;
        System.out.println(f);//15

        f += 5;
        System.out.println(f);//20

        //Decrement:
        int c = 8;
        System.out.println(c);// 8
        c = c-3;
        System.out.println(c);// 5

        c -= 3;
        System.out.println(c);// 2

        // İncrement 2:
        int d = 6;
        System.out.println(d);// 6
        d = d*2;
        System.out.println(d);// 12

        d *= 2;
        System.out.println(d);

        //Decrement 2:
        int e =24;
        System.out.println(e);// 24

        e = e/2;
        System.out.println(e);// 12

        e /= 2;
        System.out.println(e);// 6

        //"1" ile increment
        int m = 15;// 15

        //m = m + 1;
       //m += 1;
        m++; // 16
        System.out.println(m);

        //"1" ile decrement
        int h = 15;
        h = h- 1;
        h -= 1;
        h--;

        //"post-increment" ve "pre-increment"
        int i = 10;
        int k = i++;// post increment cunku increment veriab'in ismin'den sonra yazildi.
        System.out.println(k);// 10 ==> "i" artirilmadan "k" ya konuldugu icin "k"nin degeri 10 olur.
        System.out.println(i);// 11 ==>"i"  satir sonunda artirildigi icin "i" nin degeri 11 olur


        int s = 15;
        int n = ++s;// pre-increment cunku increment veriable'in isminden once yazildi.
        System.out.println(s);// 16 ==>"s" satir sonunda artirildigi icin "n" nin degeri 16 olur.
        System.out.println(n);// 16 ==>"n" artiriltikdan sonra "n" konuldugu icin "n" nin degeri 16 olur

        //"post-decrement" ve "pre-decrement"
        int p = 17;
        int r = p--;
        System.out.println(p);//16
        System.out.println(r);//17

        int y = 20;
        int t = --y;
        System.out.println(y);//19
        System.out.println(t);//19









    }
}
