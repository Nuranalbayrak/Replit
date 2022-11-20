package collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class Collection09 {
    public static void main(String[] args) {
       /*
       Bir LinkedList oluşturalım ve Iterator yöntemi ile tersten yazdıralım.

LinkedList elemanları: sari,mavi,yesil,kirmizi,beyaz,mor

```
Beklenen Çıktı:
```

```
Orijinal linked list: [sari,mavi,yesil,kirmizi,beyaz,mor]
```

```
LinkedList Tersi:
```

```
mor
```

```
beyaz
```

```
kirmizi
```

```
yesil
```

```
mavi
```

```
sari
```
        */
        LinkedList<String> myList = new LinkedList<>();
        myList.add("sari");
        myList.add("mavi");
        myList.add("mor");
        myList.add("yesil");
        myList.add("beyaz");
        System.out.println(myList);
        ListIterator<String> iterator=myList.listIterator();
        System.out.println("Baştan sona doğru yazdıralım...");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("\nSondan başa doğru yazdıralım...");
        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
    }
}
