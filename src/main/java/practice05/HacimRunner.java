package practice05;

public class HacimRunner {
    public static void main(String[] args) {

        //Küp, kare prizma ve dikdörtgen prizmanın
        // hacmini hesaplayan bir method oluşturunuz.(Method overloading kullanınız

        Hacim hacim = new Hacim();//burada obje olusturduk

        int kup=hacim.HacimHesapla(5);
        int karePrizma=hacim.HacimHesapla(5,6);
        int dikdortgenPrizma=hacim.HacimHesapla(5,6,7);

        System.out.println("kup = " + kup);
        System.out.println("karePrizma = " + karePrizma);
        System.out.println("dikdortgenPrizma = " + dikdortgenPrizma);



    }
}


