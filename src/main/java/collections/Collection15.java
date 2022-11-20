package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class Collection15 {
    public static void main(String[] args) {
        /*
        Bir TreeSet oluşturalım ve ilk ve son elemanlarını yazdıralım.

TreeSet elemanları: sari,mavi,yesil,kirmizi,turuncu,pembe

```
Beklenen Çıktı:
```

```
Orjinal Tree: [kirmizi,mavi,pembe,sari,turuncu,yesil]
```

```
ilk elemen: kirmizi
```

```
son eleman: yesil
```
         */
        TreeSet<String> list = new TreeSet<>();
        list.add("kirmizi");
        list.add("mavi");
        list.add("sari");
        list.add("turuncu");
        list.add("yesil");
        System.out.println(list);
        Iterator<String> iterator = list.iterator();

        for (int i = 0; i < list.size(); i++) {
            if (i==0) {
                System.out.println("Listenin ilk elemani: " + iterator.next());
            } else if (i==list.size() - 1) {
                System.out.println("Listenin son elemani: " + iterator.next());
            } else iterator.next();

        }
    }
}
