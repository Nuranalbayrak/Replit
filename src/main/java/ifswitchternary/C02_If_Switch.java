package ifswitchternary;

import java.util.Scanner;

public class C02_If_Switch {
    public static void main(String[] args) {
         /*
     * Ask user Name, Surname and credit card numbers than convert it to special form. (Initials for name and surname should be uppercase)


        (Check credit card number, if there aren’t 16 digit print “Invalid credit card number”

        Input :

        John White 1234234534561478

        Output :

        Name : J*** W****

        CCN  : **** **** **** 1478

      */


        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen isminizi,soyisminizi ve kart numaranizi giriniz.");
        String isim=input.next();
        String soyisim=input.next();
        String kartNo=input.next();

        int IsimBoy=isim.length();
        int soyBoy=soyisim.length();
        int kartnobo=kartNo.length();

        System.out.println(isim.substring(0,1).toUpperCase()+isim.substring(1,IsimBoy).replaceAll("[A-Za-z]","*"));
        System.out.println(soyisim.substring(0,1).toUpperCase()+soyisim.substring(1,soyBoy).replaceAll("[A-Za-z]","*"));

        if (kartNo.length()!=16) {
            System.out.println("Lutfen 16 haneli kart numaranizi giriniz.");
        }else {
            String newKart=(kartNo.substring(0,12).replaceAll("[0-9]","*")+kartNo.substring(12));
            System.out.println(newKart);
        }
    }

}

