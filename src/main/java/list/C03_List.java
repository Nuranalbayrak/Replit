package list;

import java.util.Scanner;

public class C03_List {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir cümle alın. Kullanıcıdan alınan cümleyi parametre olarak kabul edin,
        Array kullanarak cümleyi ters çevirin ve sonucu ana metoda String olarak döndüren bir Method yazın.

         Not: Büyük ve küçük harfler, boşluklar ve özel karakterler değiştirilmeyecektir.
        Giriş :

        Kod yazmak çok güzel.

        Çıktı :

        .edoc etirw ot ecin yrev si tI
         */
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");
        String cumle=input.nextLine();
        cevir(cumle);


    }public static void cevir(String a){
        char arr[]=a.toCharArray();
        String bos= "";
        for (int i = arr.length-1; i>=0; i--) {
            bos=bos+arr[i];

        }
        System.out.println(bos);

    }
}
