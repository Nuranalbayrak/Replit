package collections;

import java.util.ArrayList;
import java.util.List;

public class Collection04 {
    public static void main(String[] args) {
       /*
       Bir ArrayList oluşturalım ve istenen sıradaki elemanı güncelleyelim.

Array Elemanları: sari,yesil,mavi,pembe

**mavi rengini turuncu ile değiştirelim.**

```
Beklene Çıktı:
```

```
[sari,yesil,mavi,pembe]
```

```
[sari,yesil,turuncu,pembe]
```

        */
        List<String> myList = new ArrayList<String>();
        myList.add("sari");
        myList.add("yesil");
        myList.add("mavi");
        myList.add("pembe");
        System.out.println(myList);
        myList.set(2,"turuncu");
        System.out.println(myList);
    }
}
