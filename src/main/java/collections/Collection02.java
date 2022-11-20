package collections;

import java.util.ArrayList;
import java.util.List;

public class Collection02 {
    public static void main(String[] args) {
        /*
        Array list oluşturun daha sonra aşağıda belirtilen yerlere yebi array elemanlarını ekleyen java kodunu yazınız.

Array List:  siyah,mavi,kirmizi,beyaz

en başa: **pembe**

mavi-kirmizi arasına **yesil**  renk eklenecek.

```
Beklenen Çıktı:
```

```
[pembe,siyah,mavi,yesil,kirmizi,beyaz]
```
         */
        List<String> myList = new ArrayList<String>();
        myList.add("siyah");
        myList.add("sari");
        myList.add("mavi");
        myList.add("turuncu");
        myList.add(0,"pembe");
        myList.add(3,"yesil");
        System.out.println(myList);
    }
}
