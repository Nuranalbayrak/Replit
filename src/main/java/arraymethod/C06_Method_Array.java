package arraymethod;

public class C06_Method_Array {
    public static void main(String[] args) {
        /*
        Girdi olarak bir tamsayı dizisini kabul eden ve verilen diziden minimum ve maksimum sayıları yazdıran bir yöntem yazın

        Giriş : {3,2,5,4,1,6}

        Çıktı :

dk: 1

maksimum: 6
         */
       int sayi[]={3,2,5,4,1,6,7,-9};
        max(sayi);
        min(sayi);

    }public static void max(int []a){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            max=Math.max(max,a[i]);
        }
        System.out.println("Max deger :"+max);

    }public static void min(int []b){
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < b.length; i++) {
            min=Math.min(min,b[i]);
        }
        System.out.println("Min deger :" + min);

    }
}
