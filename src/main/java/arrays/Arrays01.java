package arrays;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class Arrays01 {
    public static void main(String[] args) {
        /*Karışık verilen sayıları  ve kelimeleri  sıralayan   Java kodunun yazınız.
          not: Test datadaki değerleri kullanınız.
        Test Data:
[1232, 1134,2345,1022]
```

```
[Java, Python, PHP, C#, C Programming, C++]
```

```
        Beklenen Çıktı:
```

```
[1022,1134,1232,2345]
```

```
[C Programming, C#, C++, Java, PHP, Python]
```
*/
        int number[]= {1232,1134,2345,1022};
        sort(number);
        System.out.println(Arrays.toString(number));
        String kelime[]={"Java", "Python", "PHP", "C#", "C Programming", "C++"};
        sort(kelime);
        System.out.println(Arrays.toString(kelime));
    }
}
