package constructors;

import java.util.Scanner;

public class Runner {
    static String kelime;
    static String name1;
    static String name2;
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("1. oyuncunun ismini girin.");
        name1=input.next().toUpperCase();
        System.out.println("2. oyuncunun ismini girin");
        name2=input.next().toUpperCase();

        System.out.println(name1+", oyunu baslatmak icin bir kelime girin.");
        kelime=input.next().toUpperCase();
        System.out.println(kelime);




    }
}
