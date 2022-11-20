package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Arrays07 {
    public static void main(String[] args) {
       /*
       Array i ARRAYLIST e çeviren Java Kodunu yazınız.

Array : [ "Python", "JAVA", "PHP", "Perl", "C#", "C++" ]

```
Beklenen Çıktı:
```

```
[Python, JAVA, PHP, Perl, C#, C++]
```
        */
        String arr[]={"Python", "JAVA", "PHP", "Perl", "C#", "C++"};
        ArrayList<String> brr=new ArrayList<String>(Arrays.asList(arr));
        System.out.println(brr);
    }
}
