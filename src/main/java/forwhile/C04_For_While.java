package forwhile;

import java.util.Scanner;

public class C04_For_While {
    public static void main(String[] args) {
/*
Write a return method that accepts an integer as input and calculates factorial and prints like output.

Input : 6

Output: 6!=6*5*4*3*2*1=720
 */

        Scanner input=new Scanner(System.in);
        System.out.println("lutfen bir tam sayi giriniz.");
        int sayi=input.nextInt();

        int faktoriyel=1;

        for (int i=1; i<=sayi;i++){
            faktoriyel=faktoriyel*i;
        }
        System.out.println(faktoriyel);
    }
}
