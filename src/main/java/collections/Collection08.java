package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Collection08 {
    public static void main(String[] args) {
        /*
        Bir LinkedList oluşturalım ve ilk ve son elemanlarını iterator özelliğini kullanarak yazdıralım

LinkedList: sari,mavi,turuncu,siyah,yesil,beyaz

```
Beklenen Çıktı:
```

```
Orjinal list elemanlari: [sari,mavi,turuncu,siyah,yesil,beyaz]
```

```
Listenin ilk elemani: sari
```

```
listenin son elemani: beyaz
```
         */
        LinkedList <String> list = new LinkedList<String>();
        list.add("sari");
        list.add("mavi");
        list.add("turuncu");
        list.add("siyah");
        list.add("yesil");
        list.add("beyaz");

        System.out.println("Orjinal list elemanlari: " + list);
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
