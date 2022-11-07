package ifswitchternary;

public class C07_If_Swicth_Ternary {
    public static void main(String[] args) {
     /*
     2 kelime oluşturun: isim1 ve isim2

        // isim1 çift sayıda karakter içeriyorsa,

        // ikinci kelimeyi ilk adın ortasına yerleştirin

        // ilk kelime tek sayida karakter iceriyorsa

        // “isim1, isim2 ye eklenemiyor” yazdırın

        // Örneğin:
        // isim1= mehmet
        // isim2= ahmet
        // Yazdır ==> mehahmetmet

        // isim1= memet
        // isim2= ahmet
        // Yazdır ==> isim1, isim2 ye eklenemiyor
      */
        String isim1="mehmet";
        String isim2="nur";
        int isimlen=isim1.length();//ismin uzunluguna bakabilmek icin olusturdum

        int name1orta=isimlen/2;//eger isim uzunlugu cift ise nameortadan ikinci ismi yerlestirmek icin

        if (isimlen%2==0){
            System.out.println(isim1.substring(0,name1orta)+isim2+isim1.substring(name1orta));
        }else System.out.println("eklenme yok");
    }
}
