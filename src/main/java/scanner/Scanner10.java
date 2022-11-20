package scanner;

import java.util.Scanner;

public class Scanner10 {
    public static void main(String[] args) {
        //Kullanıcıdan dakika girmesini isteyin, Dakikaları birkaç yıl ve gün sayısına dönüştürmek için bir Java programı yazın.
        //
        //INPUT:
        //
        //Dakika sayısı: 3456789
        //
        //OUTPUT :
        //
        //3456789 dakika yaklaşık 6 yıl 210 gündür
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen dakika giriniz.");
        int dakika=input.nextInt();
        int yil = dakika / (60 * 24 * 365);
        int gun = (dakika - (yil * 60 * 24 * 365)) / (60 * 24);

        System.out.println(dakika + " dakika yaklasik olarak " + yil + " yil " + gun + " gundur.");
    }
}
