package collections;

import java.util.LinkedList;

public class Collection06 {
    public static void main(String[] args) {
      /*
        Bir likedList oluşturalım ve tüm elemanlarını tek tek yazdıralım.

LinkedList elemanları: sari,mavi,mor,yesil,beyaz

```
Beklenen Çıktı:
```

```
sari
```

```
mavi
```

```
mor
```

```
yesil
```

```
beyaz
       */
        LinkedList<String> myList = new LinkedList<>();
        myList.add("sari");
        myList.add("mavi");
        myList.add("mor");
        myList.add("yesil");
        myList.add("beyaz");
        System.out.println(myList);
        for (int i = 0; i <myList.size() ; i++) {
            System.out.println(myList.get(i));
        }
    }
}
