package constructors;

import java.util.Scanner;

import static constructors.StringEkleme.sonKelime;

public class OyunDongusu {
    static int puan1 = 0;
    static int puan2 = 0;

    static void oyunDongusu(String name1, String name2, String kelime) {
        System.out.println(name2 + "," + kelime + "kelimesini kabul ediyor musun? Evet icin E'ye,hayir icin H'ye bas");
        Scanner input = new Scanner(System.in);
        char kelimeKabulMu = input.next().toUpperCase().charAt(0);
        if (kelimeKabulMu == 'E') {
            puan1 += kelime.length();
            System.out.println(name1 + ", icin guncel puan " + puan1);
            System.out.println(name2 + ", oyuna devam etmek istiyir musun?Evet icin E'ye,hayir icin H'ye");
            char devamMi = input.next().toUpperCase().charAt(0);
            if (devamMi == 'E') {
                System.out.println(kelime + "'sine ekleyecegin eki yaziniz");
                String ek = input.next().toUpperCase();
                kelime = sonKelime(kelime, ek);
                System.out.println(name1 + kelime + "bu kelimeyi kabul ediyor musun.Evet icin E'ye,hayir icin H'ye bas");
                kelimeKabulMu = input.next().toUpperCase().charAt(0);
                if (kelimeKabulMu == 'E') {
                    puan1 += kelime.length();
                    System.out.println(name1 + ", icin guncel puan " + puan1);
                    System.out.println(name2 + ", oyuna devam etmek istiyir musun?Evet icin E'ye,hayir icin H'ye");
                    devamMi = input.next().toUpperCase().charAt(0);
                    if (devamMi == 'E') {
                        System.out.println(kelime + "'sine ekleyecegin eki yaziniz");
                        ek = input.next().toUpperCase();
                        kelime = sonKelime(kelime, ek);
                        oyunDongusu(name1, name2, kelime);
                    }
                }
            }
        }
    }
}
