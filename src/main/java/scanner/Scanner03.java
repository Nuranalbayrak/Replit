package scanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        //Kullanıcıdan dikdörtgenin kenar uzunluklarını alın ve dikdörtgenin alanını ve çevresini konsola yazdıran bir program yazın.
        Scanner input=new Scanner(System.in);
        System.out.println("dikdörtgenin iki kenar uzunluğunu giriniz..");
        int k1=input.nextInt();
        int k2=input.nextInt();
        System.out.println("Alan:"+(k2*k1));;
        System.out.println("çevresi:"+(k2+k1)*2);
    }
}
