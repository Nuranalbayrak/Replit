package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_List {
    public static void main(String[] args) {
        /*
       10 elemanlı bir liste oluşturun. 8. öğeyi 3. öğeyle değiştirin.
        GİRİŞ :
        String[] isimler={"Ümit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
    Çıktı:

    [Ümit,Emin,Furkan,Kerem,Taylan,Orhan,Sinan,Kemal,Ahmet,Ali]
         */
        String isim[]={"Ümit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
        List<String> yeni=new ArrayList<>();
        yeni.add(isim[7]);//ismin 7. indexini yeniye ekle
        System.out.println(yeni);
        isim[7]=isim[2];//isimdeki 2. indexteki elemani ismin 7. indexine koy
        System.out.println(Arrays.toString(isim));
        isim[2]=yeni.get(0);//yeni de 0. indexteki elemani al ismin 2. indexine koy
        System.out.println(Arrays.toString(isim));





    }
}
