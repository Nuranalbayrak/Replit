package list;

import java.util.Arrays;
import java.util.Scanner;

public class C09_list {
    public static void main(String[] args) {
       /*
        Kullanıcıdan girdi olarak bir String alacak bir Java programı yazın ve o karakter dizisinde oluşan maksimum karakteri bulun.(Büyük/küçük harf duyarlılığını yoksayın).

Girdi: Java öğrenmek kolaydır

Çıktı: oluşan maksimum karakter: a
        */
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");
        String cumle =input.nextLine();
        String arr[] = cumle.split("");
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
