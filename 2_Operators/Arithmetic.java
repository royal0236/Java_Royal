
import java.util.*;
public class Arithmetic {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    // Take two numbers as input → print sum, difference, product, quotient, remainder.
    // System.out.println("Checking of Different Arithmetic Operators");
    // System.out.print("Enter the first number:");
    //   double first_number=sc.nextDouble();
    //  System.out.print("Enter the second number:");
    //   double second_number=sc.nextDouble();
    //   System.out.println("Sum of Two Numbers is:" +(first_number + second_number));
    //   System.out.println("Difference of Two Numbers is:" +(first_number - second_number));
    //   System.out.println("Product of Two Numbers is:" +(first_number * second_number));
    //   System.out.println("Quotient of Two Numbers is:" +(first_number / second_number));
    //   System.out.println("Remainder of Two Numbers is:" +(first_number % second_number));
    //   // Write a program to calculate the area of a triangle.(b*h)/2.
    //   System.out.println("calculate the area of a triangle");
    //   System.out.print("Enter the base value:");
    //   float base=sc.nextFloat();
    //   System.out.print("Enter the value of height:");
    //   float height=sc.nextFloat();
    //   System.out.println("The Area of a Triangle is:" + (base/height)/2);
    //   //  Input marks of 5 subjects, calculate total & average
    //   System.out.println("Marks Calculation of a student");
    //   System.out.print("Enter the subject1_marks:");
    //   int subject1_marks=sc.nextInt();
    //   System.out.print("Enter the subject2_marks:");
    //   int subject2_marks=sc.nextInt();
    //   System.out.print("Enter the subject3_marks:");
    //   int subject3_marks=sc.nextInt();
    //    System.out.print("Enter the subject4_marks:");
    //   int subject4_marks=sc.nextInt();
    //    System.out.print("Enter the subject5_marks:");
    //   int subject5_marks=sc.nextInt();
    //   int Total_marks=(subject1_marks + subject2_marks + subject3_marks + subject4_marks + subject5_marks);
    //   System.out.println("Total Marks:" + Total_marks);
    //   System.out.println("Average marks:" + Total_marks/5);
      // Convert Minutes into Hours & Minutes
      System.out.println("Converting Minutes into Hours & Minutes.");
      System.out.print("Enter The Minutes:");
      int minutes=sc.nextInt();
      int hour=minutes / 60;
      int remaining_minutes=minutes % 60;
      System.out.println("The Minutes Converted into Hours and minutes: "+ hour + " hour " + remaining_minutes + " minutes");
    //  Take two integers and show both int division and float division.
       System.out.println("Two integers and show both int division and float division");
       System.out.print("Enter your first number:");
       int number_1=sc.nextInt();
       System.out.print("Enter your second number:");
       int number_2=sc.nextInt();
       System.out.println("Both Integers in Division: " + number_1 / number_2);
       System.out.println("Both Integers in Division: " + (float)number_1 / number_2);

  }
}