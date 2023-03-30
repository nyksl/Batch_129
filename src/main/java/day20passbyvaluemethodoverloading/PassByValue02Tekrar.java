package day20passbyvaluemethodoverloading;

public class PassByValue02Tekrar {

    public static void main(String[] args) {

        String name = "Tom Hanks";

       String updateName= updateName(name, "Jr");

        System.out.println(name);//Tom Hanks
        System.out.println(updateName);//Tom Hanks Jr
    }
    public static String updateName(String name, String add){

        name= name+ " "+add;

        return name;

    }


}
