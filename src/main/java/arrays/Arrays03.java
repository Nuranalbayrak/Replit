package arrays;

public class Arrays03 {
    public static void main(String[] args) {
      /*
      Arraydeki sayıların ortalamasını hesaplayan Java Kodunu yazınız.

Array =  [20, 30, 25, 35, -16, 60, -100 ]

```
Beklenen Çıktı:
```

```
Array Sayılarının ortalaması: 7.0
```
       */
        double sayilar[]={20,30,25,35,-16, 60,-100};
        double ortalama=1;
        int toplam=0;
        for (int i = 0; i < sayilar.length; i++) {
            toplam+=sayilar[i];
            ortalama=toplam/ sayilar.length;
        }
        System.out.println(ortalama);
    }
}
