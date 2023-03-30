package interfacesoru;

public class Test01 implements IO2 {
    int x = 3;
    char c = 'B';
    public void myMethod() {
        System.out.println("No parameter: " + IO2.c + x);
    }
    public void myMethod(char c, int x) {
        System.out.println("One parameter: " + c + IO2.x);
    }
    public static void main(String[] args) {
        Test01 obj = new Test01();
        obj.myMethod();
        obj.myMethod('Z', 7);
    }

}
