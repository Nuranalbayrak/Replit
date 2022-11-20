package scanner;

import java.util.Scanner;

public class Scanner09 {
    public static void main(String[] args) {
        //Girilen zamanı saniyeye çeviren bir program yazınız.
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen  saat yazınız");
        int saat = input.nextInt();
        System.out.println("lütfen dakika giriniz");
        int dakika = input.nextInt();
        System.out.println((saat*3600)+(dakika*60));

    }
}
