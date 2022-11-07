package list;

public class C08_List {
    public static void main(String[] args) {
        /*
        Cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi ters çeviren ve cümlenin palindrom olup olmadığını (büyük/küçük harf duyarlılığı olmadan)
        kontrol eden bir Java programı yazınız. StringBuilder kullanın.
        Giriş :

        Java'yı seviyorum.
        Çıktı:
             Ters çevrilmiş cümle: avaJ evol I.
            Bu bir palindrom değil"
         */

        String str = "I love java";//once cumleyi olusturduk
        StringBuilder arr=new StringBuilder();//bos bir stringbuilder olusturup cumleyi buraya ekliyoruz
        arr.append(str);
        String tercevrilmis=arr.reverse().toString();//ekledigimiz cumleyi ters ceviriyoruz.

        if (str.equalsIgnoreCase(tercevrilmis)){
            System.out.println(tercevrilmis +" cumlesi"+ " :"+"palindrome bir ifadedir.");
        }else
            System.out.println(tercevrilmis +" cumlesi"+ " :"+"Palindrome bir cumle degildir");

    }

}
