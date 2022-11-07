package arraymethod;

import java.sql.Array;

public class C01_Method_Array {
    public static void main(String[] args) {
        /*
        Write a return method to reverse number.

Input  : 12345

Output : 54321
         */
        String num="12345";
        System.out.println(num);

        System.out.println(sayiyiTersCevir("12345"));

    }
    public static String sayiyiTersCevir(String a) {
        String bos = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            bos += a.charAt(i);
        }
        return bos;
    }
}
