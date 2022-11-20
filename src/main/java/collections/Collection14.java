package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class Collection14 {
    public static void main(String[] args) {
        /*
        Bir TreeSet yapalım ve elemanlarını önce normal yazdıralım ve ardından  descendingIterator()  fonksiyonunu kullanarak ters sıradan yazdıralım.

TreeSet elemanları:  yesil,sari,mavi,turuncu,kirmizi

```
Beklenen Çıktı:
```

```
Orjinal Tree sonucu: [kirmizi,mavi,sari,turuncu,yesil]
```

```
Tersten Siralanisi:
```

```
yesil
```

```
turuncu
```

```
sari
```

```
mavi
```

```
kirmizi
```

         */
        TreeSet<String> list = new TreeSet<>();
        list.add("kirmizi");
        list.add("mavi");
        list.add("sari");
        list.add("turuncu");
        list.add("yesil");
        System.out.println(list);
        Iterator<String> yeniList= list.descendingIterator();
       while (yeniList.hasNext()) {
           System.out.println("Ters cevrilmis hali ==>"+yeniList.next());
       }

    }
}
