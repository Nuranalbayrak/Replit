package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arrays08 {
    public static void main(String[] args) {
      /*
      Array listesindeki 2. en büyük sayıyı bulan Java Kodunu yazınız.

Array: [1232,2345,5467,678,3454,2312,3451]
       */
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(1232);
        arr.add(2345);
        arr.add(5467);
        arr.add(3454);
        arr.add(2312);
        arr.add(3451);
        arr.add(678);
        Collections.sort(arr);
        System.out.println(arr);
        System.out.println(arr.get(arr.size() - 2));

    }
}
