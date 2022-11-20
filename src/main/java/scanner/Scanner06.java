package scanner;

import java.util.Scanner;

public class Scanner06 {
    public static void main(String[] args) {
        //Kullanıcıdan bir Float değer girmesini isteyin, bu sayıyı short değişken tipine dönüştürün ve konsolda yazdırın.
        Scanner input=new Scanner(System.in);
        System.out.println("float türünden bir değer giriniz");
        float d=input.nextFloat();
        short yeni=(short)d;
        System.out.println(yeni);
    }
}
