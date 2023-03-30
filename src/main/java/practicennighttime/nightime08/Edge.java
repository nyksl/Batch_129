package practicennighttime.nightime08;

public class Edge extends Browser{

    String adresCubugu;
    public Edge() {
    }

    public Edge(String adresCubugu) {
        this.adresCubugu=adresCubugu;
    }

    public void search(){
        System.out.println("Edge Web sayfasinda arastirma yapar");
    }

    public void sifreKaydetme(){
        System.out.println("Edge cook isleri kabul edilenlerin" +
                " istenildiginde sifresini kaydeder");
    }

}//class
