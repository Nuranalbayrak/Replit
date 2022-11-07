package stringbuilders;

public class C01_StringBuilder {
    public static void main(String[] args) {
        /*
        StringBuilder'ı kullanarak cümleyi tersine çevirmek yerine bir cümleyi parametre olarak kabul eden bir java programı yazın
    ve cümlenin palindrom olup olmadığını kontrol eder
    (büyük/küçük harf duyarlılığı olmadan)
    Örneğin: girdi: Java'yı seviyorum
    Çıktı: "Ters cümle : avaJ evol I .
    Bu bir palindrom değil"
         */
        StringBuilder cumle=new StringBuilder("runnur");
        System.out.println("ilk hali :" + cumle);
        StringBuilder arr=new StringBuilder(cumle.reverse());
       System.out.println("son hali :"+ arr);

      if (cumle.reverse().toString().equalsIgnoreCase(arr.toString())){
          System.out.println("palindrom");
      }else System.out.println("palindrom degil");






    }

}
