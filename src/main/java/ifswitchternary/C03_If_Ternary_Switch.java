package ifswitchternary;

import java.util.Scanner;

public class C03_If_Ternary_Switch {
    public static void main(String[] args) {
          /*
     Write a Java program to compute and print sum of two given numbers (more than or equal to zero).
    If given integers or the sum have more than 10 digits, print "overflow".
    EXAMPLE:
    INPUT      :
    Input two integers:
    25
    46
    OUTPUT :
    Sum of the numbers: 71
      */
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen iki sayi giriniz");
        float sayi1=input.nextFloat();
        float sayi2=input.nextFloat();
        float sum=sayi2+sayi1;
        if (sum>=1000000000){
            System.out.println("overflow");
        }else {
            System.out.println(sum);
        }




    }
}

