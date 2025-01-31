package OOP;

public class Basics {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;
        Student s2 = new Student(s1); 
        s2.passs = "xyz";
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.passs);
        System.out.println(s2.marks[0]);
        System.out.println(s2.marks[1]);
        s1.marks[2] = 34;   
        System.out.println(s2.marks[2]);
        System.out.println(s1.marks[2]);


    }
}
class Student{  
    String name;
    int age;
     String passs;
     int marks[];
     Student(){
        this.name = "Aditya";
        this.age = 20; 
        marks = new int[3];
        
     }
     // Shallow copy constructor - Value after change in arrays is visible to new one also
    //  Student(Student s1){
    //     this.name = s1.name;
    //     this.age = s1.age;
    //     marks = new int[3];
    //     this.marks = s1.marks;
        
    // }

    // Deep Copy Constructor - 
    Student(Student s1){
        this.name = s1.name;
        this.age = s1.age;
        marks = new int[3];
         for(int i = 0;i<3;i++){
            this.marks[i] = s1.marks[i];
         }
    }

    String getName(String name){
        return this.name;
    }
    int getAge(){
        return this.age;
    }
    void setName(String name){
        this.name = name;
    }
    void getAge(int age){
        this.age = age;
    }
}
