package ifswitchternary;

import java.util.Scanner;

public class C04_If_Switch_Ternary {
    public static void main(String[] args) {
     /*
     Char değişken yanıtının değerini test eden ve aşağıdaki işlemleri gerçekleştiren bir switch ifadesi yazın:
     yanıt a ise,
    "Talebiniz işleniyor" mesajı yazdırılır
        yanıt b ise,
        "yine de ilgilendiğiniz için teşekkür ederiz" mesajı yazdırılır
        yanıt c ise,
        "Üzgünüz, şu anda herhangi bir yardım yok" mesajı yazdırılır
         herhangi bir yanıt değeri için,
        "Geçersiz giriş, lütfen tekrar deneyin!" yazdırılır
      */


        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir char degeri giriniz");
        char degisken = input.next().charAt(0);
        switch (degisken) {
            case 'a':
                System.out.println("Talebiniz işleniyor");
                break;
            case 'b':
                System.out.println("yine de ilgilendiğiniz için teşekkür ederiz");
                break;
            case 'c':
                System.out.println("Üzgünüz, şu anda herhangi bir yardım yok");
                break;
            default:
                System.out.println("gecersiz giris");

        }


    }
}
