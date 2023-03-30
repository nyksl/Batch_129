package day20passbyvaluemethodoverloading;

public class PassByValue01 {

    /*
  1) Java "pass-by-value" sayesinde variable'larin orjinal degerlerini koruma altina alir.
   */
    public static void main(String[] args) {
       double shirt = 100;

        double studentShirtPrice = discount("student", shirt);
        double veteranShirtPrice = discount("veteran", shirt);
        double seniorShirtPrice = discount("senior", shirt);

        System.out.println(shirt);
        System.out.println(studentShirtPrice);//90
        System.out.println(veteranShirtPrice);//80
        System.out.println(seniorShirtPrice);//95

    }
    public static double discount(String state, double shirt){

        switch (state){

            case "student":
                shirt = shirt*0.90;
                break;

            case "veteran":
                shirt = shirt*0.80;
                break;

            case "senior":
                shirt=shirt*0.95;
                break;

            default:
                shirt=shirt;

        }
        return  shirt;
    }







}
