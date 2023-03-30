package day01deneme01;

public class DenemeRunner {
    public static void main(String[] args) {

        DenemeScanner youCar = new DenemeScanner();
        System.out.println(youCar.model);
        System.out.println(youCar.fiyat);
        youCar.hareket();
        youCar.durur();

        Student01 aliCann = new Student01();
        System.out.println(aliCann.name);
        System.out.println(aliCann.grade);
        System.out.println(aliCann.address);

        aliCann.study();
        aliCann.feed();


    }


}
