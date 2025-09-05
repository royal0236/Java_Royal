import java.util.*;
public class Relational {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //  Write a program to check if a number entered by the user is greater than 100.
         System.out.println("To check if a number entered by the user is greater than 100");
         System.out.print("Enter your number:");
         int number=sc.nextInt();
         if ( number > 100){
            System.out.println("The number is greater than 100");
         }
         else {
            System.out.println("The number is smaller than 100");
         }
        //  Check if two numbers are equal or not.
           System.out.println("Two numbers equal or not");
           System.out.print("Enter the first number:");
           int First_Number=sc.nextInt();
           System.out.print("Enter the second number:");
            int Second_Number=sc.nextInt();
            if ( First_Number == Second_Number){
                System.out.println("The two numbers are equal");
            }
            else {
                System.out.println("The two numbers are not equal");
           }
//  Take two numbers and print the larger one using relational operators.
        System.out.println("Two numbers and print the larger one");
        System.out.print("Enter the first number:");
        int num1=sc.nextInt();
          System.out.print("Enter the second number:");
        int num2=sc.nextInt();
       if  ( num1 == num2){
       System.out.println("The two numbers are equal");
       }
       else if ( num1 > num2) {
       System.out.println("The first number is larger");
       }
       else {
               System.out.println("The second number is larger");
       }
// Write a program to check if a person is eligible to vote.
     System.out.println("To check if a person is eligible to vote");
       System.out.print("Enter your age:");
       int age=sc.nextInt();
       if ( age >= 18){
        System.out.println("Your Eligible to Vote");
       }
       else {
                System.out.println("Your Not Eligible to Vote");
       }
// Check if a number is positive, negative, or zero.
   System.out.println("If a number is positive, negative, or zero");
   System.out.print("Enter the number:");
       int number1=sc.nextInt();
       if (number1 == 0){
        System.out.println("You have entered zero.");
       }
else if ( number1 > 0){
            System.out.println("You have entered positive number.");
}
else 
            System.out.println("You have entered negative number.");
            // Check if a given year is a leap year.
            System.out.println("To check year is leap year or not");
            System.out.print("Enter the year:");
            int year=sc.nextInt();
            if ( year % 400 == 0 || year % 100 != 0 || year  % 4 == 0){
                System.out.println("Entered leap year");
            }
            else {
               System.out.println("Not a leap year");

            }
            //Scholarship Eligibility
            System.out.println("Scholarship Eligibility");
            System.out.print("Enter your marks:");
            int marks=sc.nextInt();
            System.out.print("Enter your attendance:");
             int attendance=sc.nextInt();
             if ( marks  >= 75 && attendance >= 85 ){
                      System.out.println("Your eligible for the scholarship");
             }
             else  {
                System.out.println("Your not eligible for the scholarship");
             }
            //Job Eligibility
            System.out.println("Job Eligibility");
            System.out.print("Enter your age:");
            int age1=sc.nextInt();
            System.out.print("Enter your experiences:");
            int experiences=sc.nextInt();
            if ( (age1 >= 21 && age1 <= 35) && experiences >= 2 ) {
                System.out.println("Your eligible");
            }
            else {
              System.out.println("Your not eligible");
            }
            // Cinema Ticket Discount 🎟️
            System.out.println("Cinema Ticket Discount 🎟️");
            System.out.print("Enter your Age:");
            int Age=sc.nextInt();
            System.out.print("Do you have membership card? (true/false):");
            boolean membershipCard=sc.nextBoolean();
            int discount = 0;
            if ( Age < 12){
                discount = 50;
                System.out.println("Congratulations! You get " + discount + "% discount.");}
            else if (Age >= 12 && Age <= 18){
                  discount = 25;
                  System.out.println("Congratulations! You get " + discount + "% discount.");
            }
            else if ( Age >= 60){
                discount = 30;
                 System.out.println("Congratulations! You get " + discount + "% discount.");

            }
            else if ( membershipCard){
                discount = 5;
              System.out.println("Congratulations! You get " + discount + "% discount.");
            }
            else {
                   System.out.println("Sorry, no discount available");
            }
            //Festival Discount
            System.out.println("Festival Discount");
            System.out.print("Enter the Price of Purchased items:");
            int items_purchased = sc.nextInt();
             System.out.print("Do you have a membershipcard? (true/false): ");
            boolean membership_card=sc.nextBoolean();
            if (items_purchased > 5000 || membership_card){
                System.out.println("Congratulations! Discount applied");
            }
            else {
              System.out.println("Sorry no Discount applied");
            }
            //Exam Promotion
            System.out.println("Exam Promotion");
            System.out.print("Enter the subject1 marks:");
            int subject1_marks=sc.nextInt();
            System.out.print("Enter the subject2 marks:");
            int subject2_marks=sc.nextInt();
            System.out.print("Enter the total marks:");
            int total_marks=sc.nextInt();
            if ((subject1_marks >= 35 && subject2_marks >= 35) || total_marks >= 100){
                System.out.println("Pass");
            }
            else {
                System.out.println("Fail");
            }
             }
             
    }

