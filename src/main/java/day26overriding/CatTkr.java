package day26overriding;

public class CatTkr extends Mammal{
    public void meow(){
        System.out.println("Cats meow...");
    }

    @Override
    public void eat() {
        System.out.println("Cats eat...");
    }

    @Override
    public void drink() {
        System.out.println("Cats drink...");
    }

    @Override
    public Cat creat() {
        return new Cat();
    }

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public Integer multiply(int a, int b) {
        return a*b;
    }
}
