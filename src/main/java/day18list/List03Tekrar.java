package day18list;

import java.util.ArrayList;
import java.util.List;

public class List03Tekrar {

    public static void main(String[] args) {

        //Example 2: Bir Integer List'teki 7 haric tum elemanlarin degerlerini 3 artiriniz
        List<Integer> nms = new ArrayList<>();
        nms.add(12);
        nms.add(13);
        nms.add(7);
        nms.add(12);
        nms.add(11);

        //1.Yol for each- loop
        for (Integer w : nms){

            if (w==7){
                continue;
            }
            nms.set(nms.indexOf(w),w+3);
        }
        System.out.println(nms);

        //2.Yol foor-loop

        for (int i=0; i<nms.size(); i++){
            int eleman = nms.get(i);
            if (nms.get(i)==7){
                continue;
            }
            nms.set(i,nms.get(i)+3);
        }
        System.out.println(nms);




    }
}
