import java.util.*;
public class Shift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Salary Doubler 
        System.out.println("Salary Doubler");
        System.out.print("Enter your salary: ");
        int salary = sc.nextInt();
        int salaryDoubled= salary << 1;
        System.out.println("Salary is Doubled: " + salaryDoubled);
// Take an integer and perform left shift (<<) by 1, 2, 3 bits. Print results.
      System.out.println("Perform of left shift.");
      System.out.println("Enter a number: ");
      int n1=sc.nextInt();
      int leftShift = n1 << 1;
      int leftShift1= n1 << 2;
      int leftShift2=n1 << 3;
      System.out.println(leftShift);
      System.out.println(leftShift1);
      System.out.println(leftShift2);
// Take an integer and perform right shift (>>) by 1, 2, 3 bits. Print result
      System.out.println("Perform of right shift.");
      System.out.println("Enter a number: ");
      int n2=sc.nextInt();
      int rightShift = n1 >> 1;
      int rightShift1= n1 >> 2;
      int rightShift2=n1 >> 3;
      System.out.println(rightShift);
      System.out.println(rightShift1);
      System.out.println(rightShift2);


    }
}
