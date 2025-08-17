
import java.util.Scanner;
public class  Basics {
public static void main(String[] args) {
    System.out.println("Hello World");
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your numbers");
    System.out.print("Enter your First number:");
    int n1=sc.nextInt();
    System.out.print("Enter your Second number:");
    int n2=sc.nextInt();
    System.out.println("Sum of two mumbers is:" + (n1+n2));
}   
}