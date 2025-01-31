package BasicsProgram;
import java.util.*;
class pract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [] id = new int[a];
        String[] name = new String[a];
        int i = 0;
        while(i<a){
            System.out.print("Id: ");
            int b = sc.nextInt();
            System.out.print("Name: ");
            String nam = sc.next();
            name[i] = nam;
            i++;
        }
        int j= 0;
        while(j<a){
        System.out.println("Employer" + id[j] + "Name: "+name[j]);
        j++;
        }
    }
}
