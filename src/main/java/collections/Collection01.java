package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collection01 {
    public static void main(String[] args) {
        /*
        Bir ArrayList oluşturun ve array elemanlarını tek tek yazdırın.

Array elemanları:  siyah,sari,mavi,turuncu

```
Beklenen Çıktı:
```

```
siyah
```

```
sari
```

```
mavi
```

```
turuncu


         */
        List<String> myList = new ArrayList<String>();
        myList.add("siyah");
        myList.add("sari");
        myList.add("mavi");
        myList.add("turuncu");
        System.out.println(myList.get(0));
        System.out.println(myList.get(1));
        System.out.println(myList.get(2));
        System.out.println(myList.get(3));

    }
}
