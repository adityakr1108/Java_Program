package OOP;

import javax.sound.sampled.SourceDataLine;

public class Inheritance {
    public static void main(String[] args) {

        System.out.println("From Single Inheriatnce");
        fish f = new fish();
        f.eat();
        f.sleep();
        f.swims();
        System.out.println();
        // multi level inheritance
        tuna t = new tuna();
        System.out.println("Multi-Level");
        t.eat(); // from Animal class
        t.sleep(); // from Animal class
        t.swims(); // from fish class
        t.weight(); // from tuna class
        System.out.println();
        System.out.println("hierarchial-level");
        // hierarchial inheritance
        pet p = new pet();   
        p.eat(); // from Animal class
        p.sleep(); // from Animal class
        p.home(); // from pet class

        widls w = new widls();
        w.eat();  // from Animal class
        w.sleep(); // from Animal class
        w.house(); // from wilds class

    }

}

class Animal{
    String color;
    void eat(){
        System.out.println("East");
    }
    void sleep(){
        System.out.println("Sleeps");
    }
}

// Single level inheritance
class fish extends Animal{  // extends keyword is used to inherit from base class to derived class 
    int fins;
    void swims(){
        System.out.println("Swims in water");
    }
}

// Multi level inheritance
class tuna extends fish{  // multi level inheritance - inherit properties from derived class which has been derived from parent
    void weight(){
        System.out.println("Weight = 2 kg");
    }
}


// Hierarchial inheritance - from a single base class, multiple derived classs being inherits properties from that base class

class pet extends Animal{
    void home(){
        System.out.println("Lives in home");
    }
}
class widls extends Animal{
    void house(){
    System.out.println("Lives in forest");
    }
}