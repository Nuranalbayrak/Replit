package collections;

import java.util.PriorityQueue;

public class Collection18 {
    public static void main(String[] args) {
      /*
      Bir Priority Queue  oluşruralım, elemanlarını ekleyim priority queue yazdıralım.

priority queue elemanları: sari,yesil,mavi,kirmizi

```
Beklenen Çıktı:
```

```
Priority Queue elemanlari: [kirmizi, mavi, sari, yesil]
```

       */
        PriorityQueue<String> myList = new PriorityQueue<>();
        myList.add("sari");
        myList.add("yesil");
        myList.add("mavi");
        myList.add("kirmizi");
        System.out.println(myList);

    }
}
