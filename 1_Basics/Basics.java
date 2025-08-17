import java.util.Scanner;
public class  Basics {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
//    Area of a Rectangle and Triangle
   System.out.println("Calculateing the Area of a Rectangle");
   System.out.print("Enter the length of a Rectangle:");
   int length=sc.nextInt();
   System.out.print("Enter the width of a Rectangle:");
   float width=sc.nextFloat();
   System.out.println("Area of a Rectangle is:" + length*width);
   System.out.print("Enter the Base of a Triangle:");
   double base=sc.nextDouble();
   System.out.print("Enter the Height of a Triangle:");
   double height=sc.nextDouble();
   System.out.println("Area of a Triangle is:" + (0.5*base*height));
   //Simple Interest Calculator 
   System.out.println("Calculateing the Simple Interest Calulator");
    System.out.print("Enter the value of Principle:");
    double Principle=sc.nextDouble();
    System.out.print("Enter the value of Rate:");
    double Rate=sc.nextDouble();
    System.out.print("Enter the value of Time:");
     float Time=sc.nextFloat();
     System.out.println("Simple Interest is:" + (Principle * Rate * Time) / 100);
      //Temperature Conversion. Converting  Celsius to Fahrenheit.
    System.out.println("Temperature Conversion");
      System.out.print("Enter the value of celsius:");
      float celsius=sc.nextFloat();
      double Fahrenheit=(celsius * 9/5) + 32;
      System.out.println("Temperature Conversion Converting  Celsius to Fahrenheit is:" + Fahrenheit);
    //   Swap Two Numbers.
         System.out.println("Swaping of Two numbers");
         System.out.print("Enter your First number:");
         int first=sc.nextInt();
         System.out.print("Enter your Second number:");
         int second=sc.nextInt();
         int temp=first;
         first=second;
         second=temp;
         System.out.println("First number is swaped to second number:" + first +  "\nSecond number is swapped to first number:" + second);
    //   ASCII Value of a Character
          System.out.println("ASCII value of a character");
          System.out.print("Enter the character:");
          char character = sc.next().charAt(0);
          int ASCII_value=(int)character;
        System.out.println("The ASCII value of '" + character + "' is: " +  ASCII_value);
        // Find Largest of Three Numbers
        System.out.println("Find the largest number");
        System.out.print("Enter the first number:");
        int first_number=sc.nextInt();
        System.out.print("Enter the second number:");
        int second_number=sc.nextInt();
        System.out.print("Enter the third number:");
        int third_number=sc.nextInt();
        int largest_number=Math.max(first_number , Math.max(second_number, third_number));
        System.out.println("The Largest Number is:" + largest_number);
        int smallest_number=Math.min(first_number , Math.min(second_number, third_number));
        System.out.println("The Smallest Number is:" + smallest_number);
}   
}