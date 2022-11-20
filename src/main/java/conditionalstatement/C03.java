package conditionalstatement;

import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {
        /*
        Girilen 3 sayıdan en büyüğünü bulan Java Kodunu yazınız.

```
Test Data:
```

```
12
```

```
34
```

```
23
```

```
Beklenen Çıktı:
```

```
En Buyuk Sayi: 34
```

         */
        Scanner input=new Scanner(System.in);
        System.out.println("uc tane sayi giriniz");
        int s1=input.nextInt();
        int s2=input.nextInt();
        int s3=input.nextInt();

        int sonuc=(Math.max(s1,s2));
        int sonuc2=(Math.max(s3,sonuc));
        System.out.println("Girilen sayilardan en buyugu==>"+sonuc2);
           
       }
    }

