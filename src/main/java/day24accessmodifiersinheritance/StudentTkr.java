package day24accessmodifiersinheritance;

public class StudentTkr {

    //name herkes tarafindan bilinebilir, o yuzden "public" yaptim.
    public String name = "Tom Hanks";

    //student Id okul yonetimindeki insanlar tarafindan bilinebilir, o yuzden "default" yaptim.
    String stdId = "TH2023HU12001";

    //account number ben, esim ve cocuklarim tarafindan bilinebilir, o yuzden "protected" yaptim.
    protected int accountNum = 76512345;

    //hesabimdaki para miktari sadece benim tarafimdan bilinmelidir, bu yuzden "private" yaptim.
    private int balance = 123000;
}
