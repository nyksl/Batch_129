package practicennighttime.nighttime07;

public class Test2 {
    String str = "a";

    void a() {//3. adim ter gidebilir diye try almış
        try {
            str = str + "b";//4. adim
            b();//5.adim
        } catch (Exception e) {
            str = str + "c";
        }
    }

    void b() throws Exception {//6. adim
        try {
            str = str + "d";//7.adim
            c();//8. adim
        } catch (Exception e) {//11.adim
            str = str + "e";//12.adim
        } finally {//13.adim
            str = str + "f";//14.adim
        }
        str = str + "g";
    }

    void c() throws Exception {//9. adim
        System.out.println(12 / 0);//10. adim
    }

    void display() {
        System.out.println(str);
    }

    public static void main(String[] args) {
        Test2 object = new Test2();//1. adım
        object.a();//2.adim a methoduna git
        object.display();//abdefg
    }
}
