package day13whileloopdowhileloop;

public class DoWhileLoop01 {

    public static void main(String[] args) {
        //1)while-loop
        int i = 1;

        while ( i< 1) {
            System.out.println("Sen bir while loopsun");//while bodyhic calismadi
            i++;                                        //while-loop'da zero execution mumkundur

        }
        //2) do-while-loop
        int k = 1;
        //do yap demektir.
        //do while-loop kullandigimizda body en az bir kere calisir
        //Do while-loop'da zero execution mumkun degildir
        do {
            System.out.println("Sen bir while loopsun");
            k++;
        } while( k< 1);
    }
}
