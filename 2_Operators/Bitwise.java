import java.util.*;
public class Bitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Odd or Even Checker
        System.out.println("Odd or Even Checker");
        System.out.print("Enter the number: ");
        int number=sc.nextInt();
         if ( (number & 1) == 0){
            System.out.println("It is a even number.");
         }
         else {
          System.out.println("It is a odd number.");

         }
        // Swap Two Numbers (Without Temp Variable)
        System.out.println("Swap Two Numbers");
        System.out.print("Enter the first number: ");
        int firstNumber=sc.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = sc.nextInt();
        System.out.println("Before swap: firstNumber = " + firstNumber + ", secondNumber = " + secondNumber);
         firstNumber = firstNumber ^ secondNumber;
         secondNumber = firstNumber ^ secondNumber;
         firstNumber = firstNumber ^ secondNumber;
         System.out.println("After swap: firstNumber = " + firstNumber + ", secondNumber = " + secondNumber);
        // Multiply/Divide by 2 (Efficient Trick)
        System.out.println("Multiply/Divide");
       System.out.print("Enter a number: ");
       int number1 = sc.nextInt();
         int multiply = number1 >> 1 ;
         int divide = number1 << 1 ;
         System.out.println("Multiply by 2 = " + multiply);
          System.out.println("Divide by 2 = " + divide);
        //   Find Unique Element
        System.out.println("Enter 3 numbers (two same, one unique): ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
         int  unique = a ^ b ^ c;
    System.out.println("Unique element is:" + unique);

  




    }
}
