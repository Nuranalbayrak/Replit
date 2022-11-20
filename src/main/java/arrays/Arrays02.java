package arrays;

public class Arrays02 {
    public static void main(String[] args) {
        /*
        Array deki sayıları toplayan Java kodunu yazınız.

array  [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

```
Beklenen Çıktı:
```

```
Array toplamı: 55
         */
        int sayilar[]={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int toplam=0;
        for (int i = 0; i <sayilar.length; i++) {
          toplam+= sayilar[i];

        }
        System.out.println(toplam);
    }
}
