package day09incrementdecrementternaryswitch;

public class Switch01Tekrar {

    public static void main(String[] args) {


        //Ex 1: Gun isimlerini verince kacinci gun oldugunu yazdıran kodu yazin.
        //           Pazartesi==>1   .  .  . Pazar==>7

        String gunİsmi = "sali";


        switch (gunİsmi){
            case "pazaresi":
                System.out.println(1);
                break;

            case "sali":
                System.out.println(2);
                break;
            case "carsamba":
                System.out.println(3);
                break;
            case "persembe":
                System.out.println(4);
                break;
            case "cuma":
                System.out.println(5);
                break;
            case "cumartesi":
                System.out.println(6);
                break;
            case "pazar":
                System.out.println(7);
                break;
            default:
                System.out.println("Lütfen gecerli bir gun ismi girini...");
        }














    }
}
