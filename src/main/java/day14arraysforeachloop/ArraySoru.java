package day14arraysforeachloop;

import java.util.Arrays;

public class ArraySoru {

    public static void main(String[] args) {

        char arrCh[] = {'a', 'C', 'c', 'A', 'b'};

        Arrays.sort(arrCh);

        //Not: Aşağıdakilerden hangisi verilen Arrays'in en büyük elemanını consoleda yazdırır?() yöntem parantezine array'in adını yazarsanız, array elemanları artan sırada sıralanacaktır.

        //A
         //       [A, a, b, C, c]

       // B
       //         [a, b, c, A, C]

       // C
        //        [a, C, c, A, b]

       // D
          //      [A, C, a, b, c]


        //Not: Dizinin adını method'un() yöntem parantezine yazarsanız, array öğeleri artan düzende sıralanır.

        int arr[] = {2, 11, 0, 23, 7};

        Arrays.sort(arr);

        for(int i=4; i>=0; i--) {

            System.out.print(arr[i] + " ");





        }
    }
}
