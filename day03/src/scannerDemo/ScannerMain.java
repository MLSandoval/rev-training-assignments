package scannerDemo;
import java.util.*;

public class ScannerMain {
    public static void main(String args[]){
  	  Scanner in = new Scanner(System.in);
        System.out.println("--------Enter Your Details-------- ");
        System.out.print("Enter your name: ");
        String name = in.next();
        System.out.print("Enter your age: ");
        int age = in.nextInt();
        System.out.print("Enter your salary: ");
        double sal = in.nextDouble();
        System.out.println("Name : "+name+" , Age : "+age +" , Salary: " + sal);
        in.close();
        }
}
