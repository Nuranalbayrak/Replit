package arraymethod;

public class C05_Meyhod_Array {
    /*
    Dizi elemanlarının ortalama değerini hesaplayan bir java programı yazınız.

    girdi[]= {1,2,3,4,5,6,7}

      Çıkış : 4
     */
    public static void main(String[] args) {
        int  dizi[]={1,2,3,4,5,6,7,8,9,10,11};//diziyi olusturduk
        int sum=0;//toplami alabilmek icin bir container olusturduk
        for (int i = 0; i <dizi.length ; i++) {
            sum=sum+dizi[i];

        }double ortalama=sum/ dizi.length;
        System.out.println(ortalama);


    }


}
