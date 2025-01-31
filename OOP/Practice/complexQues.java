package OOP.Practice;
import java.util.Scanner;
public class complexQues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        complex c1 = new complex();
        c1.real = sc.nextInt();
        c1.imaginary = sc.nextInt();

        complex c2 = new complex();
        c2.real = sc.nextInt();
        c2.imaginary = sc.nextInt();
        System.out.println("Add: " + (c1.real + c2.real) + " + " + (c1.imaginary+c2.imaginary) + "j");
        System.out.println("Product: " + (c1.real * c2.real) + " + " + (c1.imaginary*c2.imaginary) + "j");
       
       

    }

}

class complex{
    int real;
    int imaginary;
    public complex(int r,int i){
        real = r;
        imaginary = i;
    }
    public static complex add(complex a,complex b){
        return new complex(a.real+b.real,a.imaginary+b.imaginary);

    }
    public static complex diff(complex a,complex b){
        return new complex(a.real-b.real,a.imaginary-b.imaginary);
    }
    public static complex mul(complex a,complex b){
        return new complex(a.real-b.real,a.imaginary-b.imaginary);
    }
    pub
 }

