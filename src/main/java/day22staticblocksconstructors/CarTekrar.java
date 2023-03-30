package day22staticblocksconstructors;

public class CarTekrar {

    String make = "Honda";
    String model="Accord";
    int year = 2023;
    boolean hybrid = true;

    public CarTekrar(String make,String model,int year, boolean hybrid) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.hybrid = hybrid;

}
   public CarTekrar(String make, String model){
        this.make=make;
        this.model=model;
        if (year==2023){
            this.year=0;
        }
        if (hybrid==true){
            this.hybrid=false;
        }
}

    public CarTekrar(String make, int year) {
        this.make = make;
        this.year = year;
    }

    @Override
    public String toString() {
        return "CarTekrar{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }
}
