package day26overriding;

public class AnimalTkr {

    private void eat(){
        System.out.println("Animals eat...");
    }
    private void drink(){
        System.out.println("Animals drink...");
    }
    public Animal create(){
        return new Animal();
    }
    public int add(int a, int b){
        return a+b;

    }
    public int multiplay(int a, int b){
        return a*b;
    }


}
