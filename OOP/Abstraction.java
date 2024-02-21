package OOP;


public class Abstraction {
    public static void main(String[] args) {
      

         Horse h = new Horse();
         h.eat();
         h.walk();
         chicken c = new chicken();
         c.eat();
         c.walk();
    }
}

abstract class Animals{
    void eat(){
        System.out.println("Animal eats");
    }
    abstract void walk();  // we do not have to define the properties of horse class beacuse we use abstact keyword here, but we have to define its properties in sub class;

}

class Horse extends Animals{
    void walk(){
        System.out.println("Horse walks on 4 legs");
    }
}
class chicken extends Animals{
    void walk(){
        System.out.println("Chicken walks on two legs");
    }
}
