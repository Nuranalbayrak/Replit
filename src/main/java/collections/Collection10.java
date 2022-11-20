package collections;

import java.util.Collections;
import java.util.LinkedList;

public class Collection10 {
    public static void main(String[] args) {
       /*/
       Bir LinkedList oluşturalım ve ilk eleman ile 4. elemanı yerdeğiştiren java kodunu yazınız.

LinkedList: mavi,kirmizi,beyaz,siyah,yesil,turuncu

**hint:  Collections.swap();**

```
Beklene Çıktı:
```

```
Orjinal LinkedList: [mavi,kirmizi,beyaz,siyah,yesil,turuncu]
```

```
Swap sonrası durum: [**siyah**,kirmizi,beyaz,**mavi**,yesil,turuncu]
```

        */
        LinkedList<String> myList = new LinkedList<>();
        myList.add("sari");
        myList.add("mavi");
        myList.add("mor");
        myList.add("yesil");
        myList.add("beyaz");
        System.out.println(myList);

    }
}
