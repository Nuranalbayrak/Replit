package collections;

import java.util.TreeSet;

public class Collection13 {
    public static void main(String[] args) {
       /*
       Bir TreeSet oluşturalım ve tüm elemanlatını tektek yazdıralım.

TreeSet elemanları: yesil,mavi,kirmizi,sari,beyaz,siyah

```
Beklenen Çıktı:
```

```
beyaz
```

```
kirmizi
```

```
mavi
```

```
sari
```

```
siyah
```

```
yesil
        */
        TreeSet<String> list = new TreeSet<String>();
        list.add("beyaz");
        list.add("kirmizi");
        list.add("mavi");
        list.add("sari");
        list.add("siyah");
        list.add("yesil");
        for (String w : list) {
            System.out.println(w);
        }
    }
}
