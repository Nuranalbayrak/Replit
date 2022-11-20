package scanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        //Kullanıcıdan karenin kenar uzunluğunu alın ve karenin alanını ve çevresini konsola yazdıran bir program yazın.
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen karenin bir kenar uzunluğunu giriniz.");
        int kenar=input.nextInt();
        System.out.println("Alan:"+ (kenar*kenar));
        System.out.println("karenin çevresi:"+ (kenar*4));
    }
}
