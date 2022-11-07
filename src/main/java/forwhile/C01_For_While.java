package forwhile;

import java.util.Scanner;

public class C01_For_While {
    public static void main(String[] args) {
      /*
      Ask user to enter a name and a character, then check how many times the character is repeated in the name using loops in the name
      e.g:
      char ch1= 'a' ;
      String name =“John came late"
      Expected Output: Number of a = 2
       */
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        String isim=input.nextLine();
        System.out.println("lutfen isimde gecen bir karakter giriniz");
        char harf=input.next().charAt(0);

        int counter=0;
        for (int i=0;i<isim.length();i++){
            if (isim.charAt(i)==harf){
                counter++;

            }
        } System.out.println(" cumlede "+ counter + " tane "+ harf+" var....");
















    }
}
