package practicennighttime.nighttime07;

import static practicennighttime.nighttime07.MyExceptions.str;

public class RunnerExceptions {

    public static void main(String[] args) {


        MyExceptions my= new MyExceptions(str);


        int x = 100, y = 5;


        try {
          float  ortalama = (float ) x/(float) y;
            if (ortalama<50){
                throw new IllegalArgumentException(" Ortalama cok dusuk");
            }
        } catch (Exception e) {
            System.out.println("Sorunun kaynagi==> "+e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println(str);
        }



    }
}
