package day27encapsulationabstraction;

public class StudentRunnerTkr {

    public static void main(String[] args) {

       Student myStd = new Student();

       String stdId= myStd.getStdId();
        System.out.println(stdId);

        myStd.setGpa(4.0);

        System.out.println(myStd.getGpa());//4.0

    }
}
