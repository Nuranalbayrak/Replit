package forwhile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static java.util.Arrays.sort;

public class C03_For_While {
    public static void main(String[] args) {
        /*
        Write a code that returns the duplicate chars in a String array.(interview Question)
        Input :
        String str=“Javaisalsoeasy”
        Output: [a, s]
         */

        String str = "Javaisalsoeasy";
        String[] arrayStr = str.split("");
        System.out.println(Arrays.toString(arrayStr));
        sort(arrayStr);
        System.out.println(Arrays.toString(arrayStr));

        List<String> yeniStr = new ArrayList<>();

        for (int i =0 ; i <arrayStr.length-1; i++) {

            if (arrayStr[i].equals(arrayStr[i+1]) ) {

                if(!yeniStr.contains(arrayStr[i])) {
                    yeniStr.add(arrayStr[i]);
                }

            }

        }
        System.out.println(yeniStr);





    }
}
