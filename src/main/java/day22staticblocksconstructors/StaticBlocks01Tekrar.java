package day22staticblocksconstructors;

public class StaticBlocks01Tekrar {

    static double pi;
    static String shope;

    static {
        pi= 3.14;
        System.out.println("Static block");
    }
    static {
        shope = "Circle";
        System.out.println("Static block2");
    }

    public static void main(String[] args) {
        System.out.println(pi);
        System.out.println("main method");
    }


}
