package forwhile;

public class C10_For_While {
    public static void main(String[] args) {
       /*
       1'den 100'e kadar olan doğal sayıların toplamını bulan programı yazınız.
        OutPut:

            Sayilarin Toplami : 5050
        */
        int sum=0;
        for (int i = 1; i <101 ; i++) {
            sum+=i;

        }
        System.out.println(sum);
    }
}
