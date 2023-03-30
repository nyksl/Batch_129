package day30exceptionsinterface;

     /*
     Bazen kendi exception'imizi kendimiz uretiriz.
     Neden oyle bir seye ihtiyac duyariz?
     Normalde Java kendisi bir suru "exception" uretmistir. Java kurallari bildigi icin, olabilecek hatalarla
     ilgili exception uremistir.
     Java bu noktada hata yapmamizi engelliyor.
     Exceptionslar kirimizi isiklar gibidir java kurallar kurar o kurallar disina cikmamizi engeller.

     Ama kendimiz app olustururken javanin uretttiginin disinda kurallara ihtiyacimiz olabilir. (Okul app deki double note gibi negatif ve >100 olmamamli)
     Bu durumlar icin biz kendimiz exception olustururuz.

     */

public class CustomExceptions03 {

    public static void main(String[] args) {

        getStudentGrade(87);

        getTheNumberOfStudents(-45);

    }

    public static void getStudentGrade(int grade){
        if(grade<0 || grade>100){
            try {
                throw new InvalidStudentGradeException("Student's grades cannot be less than zero or greater than 100");
            } catch (InvalidStudentGradeException e) {
                e.printStackTrace();
            }
        }else{
            System.out.println(grade);
        }
    }

    public static void getTheNumberOfStudents(int numOfStudents){
        if (numOfStudents<0){
            try {
                throw new InvalidNumberException("Student number cannot be negative");
            }catch (InvalidNumberException e){
                System.err.println(e.getMessage());//System.err.println(e.getMessage());
                // err. hata mesajlarini kirmizi gostermek icin kullanilir.
            }
        }else {
            System.out.println(numOfStudents);
        }
    }
}
