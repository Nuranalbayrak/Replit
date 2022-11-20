package scanner;

import java.util.Scanner;

public class Scanner07 {
    public static void main(String[] args) {
        //Kullanıcı tarafından girilen DOUBLE sayıyı tam sayıya çeviren bir program yazınız.
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen double türünden bir sayı giriniz.");
        double sayı=input.nextDouble();
        int yeni=(int)sayı;
        System.out.println(yeni);
    }
}
