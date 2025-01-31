package OOP;

public class nestedClass {
public static void main(String[] args) {
    

    A a = new A();
    a.schoolName = "STDMHS";  // since we uses static as keyword so it remians same for all class unitil we will not going to update it..
    
    

}    
}

class A{
    String name;
    int marks;
    static String schoolName;
    class B{
        String name1;
        int roll;
    }
}