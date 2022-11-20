package arrays;

import java.util.Scanner;

public class Arrays06 {
    public static void main(String[] args) {
      /*
      Aranan değerin Array içerisinde kaçıncı eleman olduğunu bulan Java Kodu yazınız.

Array: [12,15,43,23,56,76,78,90,77,43]

```
Aranan değer:56
```

```
Beklenen Çıktı:
```

```
56 sayısı arrayin 4. elemanı
```
       */
        int sayi [] = {12,15,43,23,56,76,78,90,77,43};
        boolean varMi= false;
        int idx=0;

        Scanner input=new Scanner(System.in);
        System.out.println("lutfen aradidiginiz sayiyi giriniz");
        int aranandeger=input.nextInt();

        for (int i = 0; i < sayi.length ; i++) {
            if (sayi[i] == aranandeger){
                varMi=true;
                idx=i;
                break;
            }else varMi=false;
            System.out.println("sayi bulunmuyor");
            break;

        }
        System.out.println(aranandeger+" "+"sayisi array'in "+ idx+ ". elemani");
    }
}
