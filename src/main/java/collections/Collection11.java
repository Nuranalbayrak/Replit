package collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Collection11 {
    public static void main(String[] args) {
       /*
       HashSet ile list oluşturalım ve  TreeSet ile sıralayalım ve listeyi yazdıralım.

HashSet List: sari,mavi,kirmizi,yesil,mor

```
Beklenen Çıktı:
```

```
TreeSet elements:
```

```
kirmizi
```

```
mavi
```

```
mor
```

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

    }
}
