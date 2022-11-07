package forwhile;

import java.util.Scanner;

public class C09_For_While {
    public static void main(String[] args) {
        /*
        Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız. (Mulakat Sorusu)

        Input  :1238

        Output :Girilen Numananin Tersi: 8321
         */
        Scanner input=new Scanner(System.in);
        System.out.println("...lutfen bir sayi giriniz...");
        String sayi=input.nextLine();
        StringBuilder sayi2=new StringBuilder(sayi);
        System.out.println(sayi2);
        sayi2.reverse();
        System.out.println(sayi2);

    }
}
