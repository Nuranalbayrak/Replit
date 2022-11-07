package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_list {
    public static void main(String[] args) {
       /*
       Girdi olarak verilen listedeki isimlerden 'a' harflerini silen bir program yazınız.

          GİRİŞ :
          list1={"Ali","Veli","Ayse","Fatma","Ömer"}

          ÇIKTI :

          [Veli,Ömer]
        */
        List<String> list=new ArrayList<>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));
        String harf="a";

        for (int i = 0; i < list.size() ; i++) {
           if (list.get(i).contains(harf.toUpperCase()) || list.get(i).contains( harf )) {
               list.remove(i);
               i--;
           }
        }
        System.out.println(list);















    }
}
