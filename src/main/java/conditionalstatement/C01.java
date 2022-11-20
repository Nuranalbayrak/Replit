package conditionalstatement;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {
     /*   Girilen sayının pozitif,  negatif veya sıfır olup olmadığını yazdırın Java Kodunu yazınız.

```
        Test data :21
```

```
        Beklenen Çıktı:
```

```
        Sayı Pozitif
```

```
        Test data :-15
```

```
        Beklenen Çıktı:
```

```
        Sayı Negatif
```

```
        Test data :0
```

```
        Beklenen Çıktı:
```

```
        Sayı Sıfır
```*/
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi=input.nextInt();
        if (sayi<0){
            System.out.println("girilen sayi negatif");
        } else if (sayi==0) {
            System.out.println("sayi sifira esit");

        }else System.out.println("girilen sayi pozitiftir.");
    }
}
