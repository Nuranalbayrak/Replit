package list;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_list {
    public static void main(String[] args) {
        /*
                İki String Dizisi arasındaki ortak öğeleri bulan bir program yazın (büyük/küçük harf duyarlılığı olmadan)

        Girdi1 : {John,Brad,Ange,Sofia,Emily}

        Girdi2 : {sofia,brad,zarafet,emily,hazel}


        Çıktı: [sofya,brad,emily]
         */
        String [] girdi1 = {"John","Brad","Ange","sofia","Emily"};
        System.out.println(Arrays.toString(girdi1));

        String [] girdi2 = {"Sofia","brad","zarafet","emily","hazel"};
        System.out.println(Arrays.toString(girdi2));

        List<String> list = new ArrayList<String>();

        for (int i = 0; i < girdi1.length; i++) {//girdi1'in indeksini sabitleyip girdi 2 de o ondeks+girdi 2 nin butun indekslerine teker teker bak
            for (int j = 0; j < girdi2.length; j++) {
                if (girdi1[i].equalsIgnoreCase(girdi2[j])) {
                    list.add(girdi1[i]);
                }
            }
        }
        System.out.println(list);






    }
}
