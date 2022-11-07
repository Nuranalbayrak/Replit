package ifswitchternary;

import java.util.Scanner;

public class C08_If_Switch_Ternary {
    public static void main(String[] args) {
     /*
         Kullanıcıdan bir isim girmesini isteyin ve son 2 harfinin 3 kopyasından oluşan yeni bir String yazdırın

        Kullanicidan alinan isim uzunluğu en az 2 olacaktır.

        INPUT   : Mustafa

        OUTPUT  : fafafa
      */

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir isim giriniz");
        String isim = input.nextLine();
        isim = isim.substring(isim.length() - 2);
        System.out.println(isim.repeat(3));













    }
}
