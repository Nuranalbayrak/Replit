package list;

import java.util.*;

public class C01_list {
    public static void main(String[] args) {
        /*
        Kullanıcıdan girdi olarak bir Dize almak için bir Java programı yazın ve bu dizede oluşan maksimum karakteri bulun. (Büyük/küçük harf duyarlılığını yoksay)
        giriş: "Java öğrenmek kolaydır."
        çıktı:oluşan maksimum karakter: a
         */

        String str = "Java ogrenmek kolaydir.";
        String arr[] = str.split("");
        System.out.println(Arrays.toString(arr));

        int sayac = 0;
        int maxsayac = 0;
        String encokTekrarEden = "";

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    sayac++;
                }
            }
            if (sayac > maxsayac) {
                maxsayac = sayac;
                encokTekrarEden = arr[i];
            } else if (sayac == maxsayac) {
                encokTekrarEden += " , " + arr[i];
            }
            sayac = 0;
        }
        if (encokTekrarEden.length() > 1) {
            System.out.println("olusan maksimum sayilar  : " + encokTekrarEden);
        } else {
            System.out.println("olusan maksimum sayilar : " + encokTekrarEden);
        }
    }
}


