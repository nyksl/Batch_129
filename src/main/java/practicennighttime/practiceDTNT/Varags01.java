package practicennighttime.practiceDTNT;

public class Varags01 {
    public static void main(String[] args) {
         /*
        1) Bir metotta parametre sayısını esnek hale getirmek istiyorsanız, "varargs" kullanın.
        2) Varargs oluşturmak için "Veri Tipi + ... + boşluk + varargslar için bir isim"
        3) "Varargs", arkasında Array kullanır. Varargs ile çalışırken Array ile çalıştığınızı düşünebilirsiniz.
        4) "Varargs" sıfır veya daha fazla öğe kabul edebilir
        5)"Varargs"dan sonra başka bir normal parametre kullanabilir miyim?
        Hayır, "Varargs" tam yapılamayacağı için ikinci parametreye ulaşılamayacak, hata verecektir.
        "Varargs" her zaman son parametre olmalıdır.

        6)"Varargs"dan önce başka bir normal parametre kullanabilir miyim?
        Evet, "Varargs" dan önce birçok normal parametre kullanabilirsiniz.

        7)Bir metotta birden fazla "Varargs" parametresi kullanabilir miyim?
                Hayir .Cunku sondaki Varargs'a unreachable code olur
                */

            // Varargs kullanarak verilen String datalari birlestiren code;u yaziniz

            String str1 = "Safran";
            String str2 = "Bolu";
            String str3 = "Evleri";
            String str4 = "Cok";
            String str5 = "Guzel";

            concat(str1, str2, str3, str4, str5);
        }//main

        private static void concat (String...str){

            String sonuc = "";
            for (String w : str
            ) {
                sonuc += w + " ";


            }
            System.out.println(sonuc);


        }
    }


