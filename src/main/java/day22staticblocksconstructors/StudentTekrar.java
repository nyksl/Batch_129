package day22staticblocksconstructors;

public class StudentTekrar {

    String name;
    int age;
    int grade;
    String stdId;
    String address;

    public StudentTekrar(String name, int age, int grade, String stdId, String address) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.stdId = stdId;
        this.address = address;
    }

    public StudentTekrar(String name, int age, String stdId) {
        this.name = name;
        this.age = age;
        this.stdId = stdId;
    }

    @Override
    public String toString() {
        return "StudentTekrar{" +
                "Name='" + name + '\'' +
                ",Age=" + age +
                ",Grade=" + grade +
                ",stdId='" + stdId + '\'' +
                ",Address='" + address + '\'' +
                '}';
    }
}
