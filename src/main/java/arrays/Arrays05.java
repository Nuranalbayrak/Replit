package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays05 {
    public static void main(String[] args) {
       /*
       yazılan değerin array içerisinde arayan Java Kodu yazınız.

Array: [1551,1223,1443,1267,1789,1023,2020]

```
Aranan Değer:2020
```

```
Beklenen Çıktı:**True**
```

```
Aranan Değer:2010
```

```
Beklenen Çıktı :**False**
```
        */
        int sayi[] = {1551, 1223, 1443, 1267, 1789, 1023, 2020};
        boolean varmi = false;
        Scanner input = new Scanner(System.in);
        System.out.println("aradiginiz degeri giriniz");
        int aranan = input.nextInt();

        for (int i = 0; i < sayi.length; i++) {
            if (sayi[i] == aranan) {
                varmi = true;
                break;
            }

        }
        if (varmi) {
            System.out.println("****TRUE*****");
        } else System.out.println("*****False*****");

    }
}
