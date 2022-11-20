package conditionalstatement;

import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {
        /*
        iki sayıyı kıyaslayan Java kodunu yazınınz.

**Kullanılacak Operatörler**

```
**Büyüktür >**
```

```
**Küçüktür <**
```

```
**Büyük yada eşit =>**
```

```
**Küçük yada eşit =<**
```

```
**Eşittir ==**
```

```
**Eşit değildir !=**
```
         */
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz ");
        int s1=input.nextInt();
        System.out.println("lutfen bir sayi giriniz ");
        int s2=input.nextInt();
        if (s1==s2){
            System.out.println("sayilar esittir");
        } else if (s1>s2) {
            System.out.println(s1+"daha buyuktur");
        } else if (s1 <s2) {
            System.out.println(s2+"daha buyuktur");
        }

    }
}
