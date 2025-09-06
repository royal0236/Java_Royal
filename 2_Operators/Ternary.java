import java.util.*;
public class Ternary {
   public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
    //    Pass or Fail Result 📚
      System.out.println("Pass or Fail Result");
      System.out.print("Enter your marks: ");
      int marks1 = sc.nextInt();
      String finalResult=(marks1 >= 40) ? "Pass" : "Fail" ;
      String message=(marks1 >= 40) ? "Congratulations" : "Better luck next time" ;
      System.out.println("Result: " + finalResult );
      System.out.println("Message: " + message);
      System.out.println("Marks obtained: " + marks1 + "/100");
    //    Find Maximum  and Minimum of Two Numbers 
    System.out.println("Maximum of Two numbers");
    System.out.print("Enter the first number: ");
    int firstNumber = sc.nextInt();
    System.out.print("Enter the second number: ");
    int secondNumber = sc.nextInt();
String result = (firstNumber > secondNumber) ? "First number is bigger (" + firstNumber + ")" :
                (secondNumber > firstNumber) ? "Second number is bigger (" + secondNumber + ")" :
                "Both numbers are equal (" + firstNumber + ")";
    String result2= (firstNumber < secondNumber) ? "First number is smaller (" + firstNumber + ")" :
                (secondNumber < firstNumber) ? "Second number is smaller (" + secondNumber + ")" :
                "Both numbers are equal (" + firstNumber + ")";            
    System.out.println("Maximum of between two numbers is: "+ result);
     // Grade Calculator 🏆
   System.out.println("Grade Calculator");
   System.out.print("Enter your marks: ");
  int marks = sc.nextInt();
      String grades = (marks < 0 || marks > 100) ? "Invalid Result" : marks >= 90 ? "A Grade" :  marks >= 75 ? "B Grade" : marks >= 50 ? "C Grade" : "Fail" ;
      System.out.println("Final Grades: " + grades);
     System.out.println("Marks: " + marks + "/100");


   } 
}
