package arraymethod;

import java.util.Arrays;

public class C08_Method_Array {
    public static void main(String[] args) {
        /*
        2 tamsayı Diziyi parametre olarak kabul eden ve yeni bir Diziye 2 dizi ekleyen ve yazdıran bir dönüş yöntemi yazın.

        Girdi1={1,2,3,4,}

        Giriş2={5,6}

        Çıktı={1,2,3,4,5,6}
         */
        int d1[]={1,2,3,4};
        int d2[]={5,6};
        System.out.println(Arrays.toString(ekle(d1,d2)));


    }public  static int[] ekle( int [] a,int []b){
        int [] c=new int[a.length+b.length];//a ve b yi yerlestirecegimiz yeni bir array olusturduk
        for (int i = 0; i < a.length; i++) {//once a deki harfleri cekip c ye koyduk
            c[i]=a[i];
        }
        System.out.println(Arrays.toString(c));
        for (int i =0;i<b.length;i++){
            c[a.length+i]=b[i]; // a'nin uzunlugunun i kadar fazla index'ine koy
        }
            return c;
    }
}
