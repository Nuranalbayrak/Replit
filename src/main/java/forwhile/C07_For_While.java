package forwhile;

public class C07_For_While {
    public static void main(String[] args) {
       /* Numaranın Mükemmel sayı olup olmadığını kontrol eden Java kodunu yazın.

        * Sayının kendisi hariç pozitif bölenlerinin toplamı o sayıya eşitse, herhangi bir sayı Java Mükemmel Sayısı olabilir.

        Giriş :6
        Çıktı:6 Mükemmel Sayıdır
        Giriş :7
        Çıktı:7 Mükemmel Sayı değil
        */
        int sayi = 6;
        int sum = 0;
        for (int i = 1; i < sayi; i++) {
         if (sayi % i == 0) {
             sum += i;
         }}
        if (sayi==sum){
            System.out.println("mukemmel");
        }else {
            System.out.println("mukemmel degil");



    }}}
