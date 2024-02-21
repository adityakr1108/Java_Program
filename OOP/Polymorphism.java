package OOP;

public class Polymorphism {
    public static void main(String[] args) {

        //  // Example of method overloading

        // Sum s1 = new Sum();
        // System.out.println(s1.sum(5, 6));
        // System.out.println(s1.sum(5, 7, 9));
        // System.out.println(s1.sum(3.5, 2.6));
      
      // //example of Method Overriding
        //   System.out.println(s1.sum((float)3.50 ,(float)6.6,(float) 9.5));  // // by default it take input as double whicgh gives error so we type cast into float.
        //  Father f = new Father();
        //  System.out.println(f.sum(3, 5,8));


        //  child c = new child();
        //  System.out.println(c.sum(5, 6,9));
        //  System.out.println(c.sum(8,9));

        Father f = new Father();
        f.eat();
        child c = new child();
        c.eat();


    }
}

 // Method Overloading - fuction with same name but with differenct arguments either with data type or with count
class Sum{
 double sum(double a, double b ){
    return a+b;
 }
 int sum(int a, int b){
    return a+b;
 }
 int sum(int a ,int b , int c){
    return a + b + c;
 }

 float sum(float a , float b,float c){
    return a+b+c;
 }
}

 // Method Overriding = parent and child having same function but with different arguments
class Father{
    int sum(int a, int b,int c){
        return a+b+c;
    }
    void eat(){
        System.out.println("Eats Chicken");
    }

}

class child extends Father{
 int sum(int a ,int b){
    return a+b;
 }
 void eat(){
    System.out.println("Eats roti");
 }
}