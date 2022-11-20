package collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class Collection07 {
    public static void main(String[] args) {
       /*
       bir LinkedList oluşturalım ve Iterator methodunu kullanarak listedeki elemanlardan istenilen pozisyondan başlayarak listeyi yazdıralım.

LinkedList elemanlari: sari,beyaz,mavi,yesil,turuncu

1. elemandan itibaren yazdıralım.

```
 Beklenen Çıktı:
```

```
beyaz
```

```
mavi
```

```
yesil
```

```
turuncu
```
        */
        LinkedList<String> myList = new LinkedList<>();
        myList.add("sari");
        myList.add("mavi");
        myList.add("mor");
        myList.add("yesil");
        myList.add("beyaz");
        System.out.println(myList);
        ListIterator<String> list = myList.listIterator();


        while (list.hasNext()){
            System.out.println(list.next());
        }

    }
}
