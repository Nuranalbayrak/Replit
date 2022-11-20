package constructors;

import java.util.Scanner;

public class StringEkleme {
     static String sonKelime;

    static String sonKelime(String kelime, String ek){
        Scanner input=new Scanner(System.in);
        System.out.println(ek+"ekini kelimenin basina mi sonuna mi ekleyeceksin. Bas icin B' ye son icin S ye bas");
        char basMiSonMu=input.next().toUpperCase().charAt(0);
        if (basMiSonMu=='B'){
           sonKelime=ek+sonKelime;
        }else if (basMiSonMu=='S'){
            sonKelime=sonKelime+ek;
        }
        System.out.println("cevabinizi b veya s olarak girin");
        sonKelime(kelime, ek);
        return sonKelime;
    }
}
