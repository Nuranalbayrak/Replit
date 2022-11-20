package collections;

import java.util.ArrayList;
import java.util.List;

public class Collection03 {
    public static void main(String[] args) {
      /*
      Bir ArrayList oluşturalım ve birinci ve üçüncü elemanlarını yazdıralım.

ArrayList elemanları:  beyaz,siyah,sari,kirmizi,turuncu

```
Beklenen Çıktı:
```

```
Arrayin 1. elemani: beyaz
```

```
Arrayin 3. elemani: sari
```
       */
        List<String> myList = new ArrayList<String>();
        myList.add("beyaz");
        myList.add("siyah");
        myList.add("sari");
        myList.add("kirmizi");
        myList.add("turuncu");
        System.out.println("Array'in 1. elemani==> "+myList.get(0));
        System.out.println("Array'in 3. elemani==>"+myList.get(2));


    }
}
