package day27encapsulationabstraction;

public class StudentRunner {

    public static void main(String[] args) {


        Student myStd = new Student();

        //student 1


        String stdId = myStd.getStdId();
        System.out.println(stdId);

        //Student 2
        myStd.setGpa(4.0);

        System.out.println(myStd.getGpa());//4.0

        Student yourStd = new Student();
        System.out.println(yourStd.getGpa());//3.99



    }
}
