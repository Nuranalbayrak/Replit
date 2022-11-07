package list;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C07_list {
    public static void main(String[] args) {
        /*
        bir diziden belirli bir elemanı çıkarmak ve kalan elemanları yeni bir diziye koymak ve yeni diziyi basmak için bir Java programı yaz

        Giriş :{1,2,3,4,5,6}

        eleman:6

            Çıkış : [1,2,3,4,5]
         */

       int [] sayi={1,2,3,4,5,6};
        System.out.println(Arrays.toString(sayi));

       int kaldir=6;

       List<Integer> yeni=new ArrayList<Integer>();

        for (int w:sayi) {
            if (w!=kaldir){
                yeni.add(w);
            }
        }
        System.out.println(yeni);



    }

    }

