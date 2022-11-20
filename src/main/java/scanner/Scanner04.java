package scanner;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
//Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun. Yılda kaç kg şeker kullandığını hesaplayın ve yazdırın.
        Scanner input=new Scanner(System.in);
        System.out.println("günde kaç bardak çay içiyorsunuz");
        int çay=input.nextInt();
        System.out.println("günde kaç tane şeker kullanıyorsunuz");
        int şeker=input.nextInt();
        System.out.println("yılda toplam içilen çay miktarı==>"+(çay*365));
        System.out.println("Yılda toplam tüketilen şeker = " + (şeker*365));
    }
}
