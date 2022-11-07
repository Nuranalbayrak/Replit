package arraymethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C04_Method_Array {
    /*
    Özel bir dönüş türü oluştur yöntemi, bir adı parametre olarak kabul eder ve adı bir karakter dizisi olarak yazdırır.

        (toCharArray() yöntemini kullanmayın)


            Girdi: John

            Çıktı :[J, o, h, n]
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen bir isim girin");
        String isim=input.nextLine();
        charArrayMethod(isim);

    }public static void charArrayMethod(String a){//method olusturduk
        char ch[]=new char[a.length()];//char data tipinde bir Array olusturduk.
        for (int i = 0; i < a.length(); i++) {

            ch[i]=a.charAt(i);//string a dan aldigim harfleri teker teker charArray'e ekledim
        }
        System.out.println(Arrays.toString(ch));
    }
}
