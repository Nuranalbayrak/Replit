package arraymethod;

import java.util.Arrays;

public class C02_Method_Array {
    public static void main(String[] args) {
        /*

        Array (tüm boşluklar ve özel karakterlerle) kullanarak bir cümleyi tersine çeviren bir Java programı yazın.

        Girdi : Coding is greate.

        Çıktı: .etaerg si gnidoC
         */
        String str="Coding is greate.";
        System.out.println(str);
        String []arr=str.split("");
        System.out.println(Arrays.toString(arr));

        String brr[]=new String[arr.length];
        System.out.println(Arrays.toString(brr));

        for (int i=arr.length-1;i>=0;    i--){

            brr[i]=arr[arr.length-1-i];
        }
        System.out.println(Arrays.toString(brr));


        }

        }


