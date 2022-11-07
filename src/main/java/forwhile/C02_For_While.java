package forwhile;

import java.util.Scanner;

public class C02_For_While {
    public static void main(String[] args) {


    /*
    Ask user to enter 2 integer then find GCD (Greatest Common Divisor) and LCM (Least Common Multiple)
    Input :

            30 and 40

    Expected OutPut:

    GCD for 30 and 40 = 10

    LCM for 30 and 40 = 120

     */

        Scanner input = new Scanner(System.in);

        System.out.println("lutfen iki tam sayi giriniz");
        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();

        int ebob=1;
        int ekok=1;

        for (int i=1;i<=sayi1 && i<=sayi2;i++){
            if (sayi1%i==0 && sayi2%i==0){
                ebob=i;
            }
            ekok=sayi1*sayi2/ebob;
        }
        System.out.println("sayilarin ebobu:"+ ebob);
        System.out.println("sayilarin ekoku:"+ ekok);


}}