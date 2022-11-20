package scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //Kullanıcıdan bir sayı alın ve sayının küpünün yarısını konsola yazdıran bir program yazın.
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen bir sayı giriniz.");
        double sayi=input.nextInt();
        System.out.println((Math.pow(sayi,3))/2);
    }
}
