package collections;

import java.util.TreeSet;

public class Collection16 {
    public static void main(String[] args) {
        /*
Bir TreeSet oluşturalım ve Tree Listesini ve listedeki eleman sayısını yazdıran java kodunu yazdıralım.

TreeSet elemanları: yesil,sari,mavi,kirmizi,pembe

```
Beklenen Çıktı:
```

```
Orjinal TreeSet: [kirmizi,mavi,pembe,sari,yesil]
```

```
Tree eleman sayısı: 5
```*/
        TreeSet<String> list = new TreeSet<>();
        list.add("yesil");
        list.add("sari");
        list.add("mavi");
        list.add("kirmizi");
        list.add("pembe");
        System.out.println("TreeSet'in eleman sayisi :"+list.size());

    }
}
