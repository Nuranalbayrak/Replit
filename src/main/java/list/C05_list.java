package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C05_list {
    public static void main(String[] args) {
      /*
      Girdi olarak bir tamsayı kabul eden ve girdiden büyük ilk 10 asal sayıyı ekrana yazdıran bir program yazınız.
        Bir dönüş yönteminde sayıların çift olup olmadığını kontrol edin.

        Giriş : 5

        Çıktı : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]
       */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi=scan.nextInt();

        List<Integer> list=new ArrayList<>();
        System.out.println(list);

        int sayac=0;

        sayi++;//sayiyi bir artirip donguye sokuyor
        while (list.size()<10){//listin uzunlugu kontrol ediyoruz
            for (int i=2; i<sayi; i++) {//burada ki mantik sayiyi bir artir ve dongue sok. asal sayilar 2 den basladigi icin i 2 den
                                        //baslat ve sayiya kadar teker teker bol. hic birine bolunmuyorsa sayac 0'dir liste ekle,
                                        //eger bolunuyorsa sayiyi bir artir sayaci da sifirla devam et. size 10 dan kucuk olana kadar devm
                if (sayi%i==0){
                    sayac++;
                }
            }if (sayac==0){
                list.add(sayi);

        } sayi++;
            sayac=0;
        }
        System.out.println(list);

    }

    }

