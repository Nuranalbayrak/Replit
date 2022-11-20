package constructors;
 /*
 Create 2 constructors one is with parameters, the other one is without parameter.
  By using that constructors create at least 2 objects then print their features on the console.
  */

public class C02_Constructor {
   String model="Corolla";
   String marka="Toyoto";
   int year=2020;
   public C02_Constructor(String model){
       this.model = model;

   }public C02_Constructor(){

    }

    public static void main(String[] args) {
        C02_Constructor c = new C02_Constructor();
        System.out.println(c.marka);
        System.out.println(c.year);
        System.out.println(c.marka);
        System.out.println();
        C02_Constructor c1=new C02_Constructor("Accord");
        System.out.println(c1.marka);
        System.out.println(c1.year);
        System.out.println(c1.model);

    }


}
