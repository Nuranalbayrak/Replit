package arraymethod;

public class C03_Array_Method {
    /*
   Bir String'i parametre olarak kabul eden ve verilen string'de bulunan rakamların toplamını yazdıran bir metot yazın.
    girdi: ade1r4d3
    çıktı : 8
          İpucu :
          Karakter.isDigit() kullanın
          Tamsayı.değerOf()
     */
    public static void main(String[] args) {
        String deger = "ade1r4d3";
        System.out.println(toplamayap(deger));

    }

    public static int toplamayap( String s ){//method olusturuyoruz.
        int sum=0;
        for (int i=0;i<s.length();i++){
            if (Character.isDigit(s.charAt(i))){//karakterin rakam olup olmadigini kontrol ediyorum
                sum=sum+Integer.valueOf(s.substring(i,i+1));
            }
        }
        return sum;

    }
}
