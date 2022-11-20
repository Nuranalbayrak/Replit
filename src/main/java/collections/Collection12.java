package collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Collection12 {
    public static void main(String[] args) {
      /*
      Bir HashSet oluşturalım ve HashSet elemanlarını TreeSet e dönüştürelim. Tree Set elemanlarını tektek yazdıralım.

HashSet elemanları: sari,mavi,yesil,turuncu,kirmizi

```
Beklenen Çıktı:
```

```
Tree Set Elemanlari:
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
turuncu
```
       */
        HashSet<String> myList = new HashSet<>();
        myList.add("sari");
        myList.add("mavi");
        myList.add("kirmizi");
        myList.add("yesil");
        myList.add("mor");

        TreeSet<String> list = new TreeSet<>(myList);
        System.out.println(list);

        for (String w: list) {
            System.out.println(w);
        }
    }
}
