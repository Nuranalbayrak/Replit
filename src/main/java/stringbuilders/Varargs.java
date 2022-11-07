package stringbuilders;

public class Varargs {
    public static void main(String[] args) {
        /*
        Birden fazla tam sayıyı parametre olarak kabul eden ve tam sayıların toplamını yazdıran bir dönüş yöntemi yazın
  Yöntem adı = toplam
böyle bir yöntem çağırırsanız
toplam(1,2,3) çıktı =6
toplam(1,2,3,4,5) çıktı =15
toplam(1,2) çıktı=3
         */

      toplam(5,7,8,89);

    }
    public static void toplam(int...sayi){
       int toplam=0;
        for (int w:sayi) {
        toplam+=w;

        }
        System.out.println(toplam);



    }
}
