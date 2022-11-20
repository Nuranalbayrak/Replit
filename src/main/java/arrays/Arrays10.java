package arrays;

import java.util.Arrays;

public class Arrays10 {
    public static void main(String[] args) {

        /*
        Bir String değişkeni cümlesi verildiğinde, her sözcüğü almak için kod yazın ve tersine ters çevrilmiş String'e atayın.

    Test Data:

    sentence -> "Java is fun"

    reversed **-> "**fun is Java**"*
         */
        String cumle="Java is fun";
        String yeni[]=cumle.split(" ");
        System.out.println(Arrays.toString(yeni));

        String ters="";
        for (int i = yeni.length-1;i>=0; i--) {
            ters +=yeni[i]+" ";

        }
        System.out.println(ters);
    }
}
