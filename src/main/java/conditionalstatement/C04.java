package conditionalstatement;

import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {
        /*
        1 ile 7 arasında girilen bir tamsayı ile haftanın gününün adını gösteren bir Java kodu yazın.

```
Test Data :
```

```
3
```

```
Beklenen Çıktı:
```

```
Carsamba
```

```
Test Data:
```

```
1
```

```
Beklenen Çıktı:
```

```
Pazartesi
```
         */
        Scanner input = new Scanner(System.in);
        System.out.println("1 'ile 7 arasinda bir sayi giriniz");
        int sayi = input.nextInt();
        switch (sayi) {
            case 1:
                System.out.println("pazartesi: ");
                break;
            case 2:
                System.out.println("sali");
                break;
            case 3:
                System.out.println("carsamba");
                break;
            case 4:
                System.out.println("persembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
                break;
            default:
                System.out.println("hatali giris yaptiniz tekrar deneyiniz.");
        }
    }
}
