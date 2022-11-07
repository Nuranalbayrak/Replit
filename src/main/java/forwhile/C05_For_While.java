package forwhile;

public class C05_For_While {
    public static void main(String[] args) {
      /*
      Print even numbers from 20 to 0 but do not use decrement (i--).

       OUTPUT  : Even Numbers from 100 to 0 are: 20 18 16 14 12 10 8 6 4 2 0
       */
        for (int i = 20; i >=0 ; i=i-2) {
            if (i%2==0){
                System.out.print(i+" ");


        }

    }}}
