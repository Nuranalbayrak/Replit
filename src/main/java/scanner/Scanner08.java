package scanner;

import java.util.Scanner;

public class Scanner08 {
    public static void main(String[] args) {
        //Kullanıcıdan üç basamaklı bir sayı girmesini ve bu sayının basamaklarının toplamını bulmasını isteyin.
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen üç basamaklı bir sayı giriniz");
        int sayi=input.nextInt();
        int toplam=0;
        int rakam=0;
        rakam=sayi%10;
        toplam+=rakam;
        sayi/=10;
        rakam=sayi%10;
        toplam+=rakam;
        sayi/=10;
        rakam=sayi%10;
        toplam+=rakam;
        sayi/=10;
        System.out.println(toplam);





    }
}
