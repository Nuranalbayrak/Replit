package constructors;

import java.util.Scanner;

/*
    Ana yöntemde bir öğrencinin değişkenlerini oluşturun ve bu değişkenleri atamayı kullanın
    Changename, parametre olarak öğrenci adında bir yöntem oluşturun
    bilgileri alın ve yöntemdeki tüm bilgileri değiştirin ve yeni bilgileri ekleyin  yazdır
    Main yönteminde Rename yöntemini çağırdığımız satır hemen ardından öğrenci bilgilerini yeniden yazdırır.
    changesurname adında bir yöntem oluşturun, bu yöntem parametre değişkeni alırken "lastname" dir. Yöntemde, kullanıcıdan yeni bir soyadı girmesini isteyin ve
    eski soyadını değiştir (yani can).
    */
public class C03_Constructor {
    static Scanner scanner=new Scanner(System.in);
    String isim="nur";
    String stdId="1234";
    String soyisim="albay";

    public static void main(String[] args) {
        C03_Constructor c1 = new C03_Constructor();
        String yeni=c1.setIsim("nuran");
        System.out.println(yeni);
        System.out.println(c1.stdId);
        System.out.println(c1.soyisim);

    }
    public String setIsim(String isim) {
        this.isim = isim;
        return isim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

}
