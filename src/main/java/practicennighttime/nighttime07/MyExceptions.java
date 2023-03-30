package practicennighttime.nighttime07;

public class MyExceptions extends Exceptions{

    static final String str = " Sen degerlsin";

    public MyExceptions(String str){
        super(str);

        System.out.println("Oyun oynadi ");

    }

    public MyExceptions() {
        super(str);
    }
}
