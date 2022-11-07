package arraymethod;

public class C07_Method_Array {
    public static void main(String[] args) {
        /*
        Bir diziyi parametre olarak kabul eden ve dizideki tüm öğelerin toplamını döndüren bir yöntem yazın. Ardından sonucu ana yöntemde yazdırın.

        Örneğin :

        giriş : {1,2,3,4,5,6,7,8};

        çıktı: 36
         */
        int arr[]={1,2,3,4,5,6,7,8};
        toplamayap(arr);

    }public static void toplamayap(int a []){
       int sum=0;
        for (int i = 0; i <a.length ; i++) {
            sum=sum+a[i];

        }
        System.out.println(sum);
    }

}
