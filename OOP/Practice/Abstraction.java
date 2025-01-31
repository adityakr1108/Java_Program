package OOP.Practice;

import BasicsProgram.sdp;

public class Abstraction {
    public static void main(String[] args) {
        //  Horse h = new Horse();
        //  h.eat();
        //  h.walk();
        // System.out.println(h.color);
        // h.changeColor();
        // System.out.println(h.color);
        //  chicken c = new chicken();
        //  c.eat();
        //  c.walk(); 
        //  System.out.println(c.color);
        //  c.changeColor();
        //  System.out.println(c.color);


    // Constructor alsways called in series from first parent to that that from where we created the object

    Mustang ms = new Mustang();
    // Animals Constructor called
    // Horse Constructor called
    // Mustang constructor called

    }
}

abstract class Animals{

    String color;
    Animals(){
        System.out.println("Animals Constructor called");
    }
    void eat(){
        System.out.println("Animal eats");
    }
    abstract void walk();  // we do not have to define the properties of horse class beacuse we use abstact keyword here, but we have to define its properties in sub class;

}

class Horse extends Animals{
    Horse(){
        System.out.println("Horse Constructor called");
    }
    void changeColor(){
        color = "White";
    }
    void walk(){
        System.out.println("Horse walks on 4 legs");
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called");
    }
}
class chicken extends Animals{
    void changeColor(){
        color = "Black";
    }
    void walk(){
        System.out.println("Chicken walks on two legs");
    }
}
