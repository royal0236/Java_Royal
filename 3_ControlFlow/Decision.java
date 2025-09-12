import java.util.*;
public class Decision {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Check Positive, Negative, or Zero
       System.out.println("Check Positive Negative Zero");
       System.out.print("Enter a number: ");
       int i=sc.nextInt();
       if ( i == 0){
        System.out.print("Entered zero: " + i);
       }
       else if (i > 0){
        System.out.println("Entered Positive number: " + i);
       }
    else 
        System.out.println("Entered Negative number: " + i);
    // Check Even or Odd
    System.out.println("Check Even or Odd");
    System.out.print("Enter a number:");
    int n = sc.nextInt();
    if ( n % 2 == 0){
        System.out.println("Entered even number:" + n);
    }
    else {
                System.out.println("Entered odd number:" + n);
    }
    // Check Largest of Two Numbers
    System.out.println("Check Largest of Two Numbers");
    System.out.print("Enter the first number: ");
    int firstNumber = sc.nextInt();
    System.out.print("Enter the second number: ");
     int secondNumber = sc.nextInt();
     if ( firstNumber == secondNumber ){
        System.out.println("First Number is equals to the second Number: " + firstNumber + secondNumber);
     }
     else  if (firstNumber > secondNumber){
           System.out.println("First Number is Largerst to the second Number: " + firstNumber);
     }
     else {
         System.out.println("Second Number is Largerst to the First Number: " + secondNumber);
     }
    //  Leap Year Check
     System.out.println("To Check Leap year OR not");
     System.out.print("Enter a year: ");
     int year = sc.nextInt();
      System.out.print("Enter a year to checkLeap OR not: ");
     int LeapYearCheck = sc.nextInt();
     if ( (year % 400 == 0) || year % 4 == 0 && year % 100 != 0 ){
        System.out.println("It's a Leap year: " + year);
     }
     else {
          System.out.println("It's not a Leap year: " + year);
     }
     String LeapYearCheck1 = (year % 400 == 0) ? "Leap year" : year % 4 == 0 && year % 100 != 0 ? "Leap year" : "Its not a leap year:" ;
     System.out.println( LeapYearCheck1 + LeapYearCheck);
    //  Electricity Bill Calculator
    System.out.println("Electricity Bill Calculator");
    System.out.print("Enter your number of units cousumed: ");
    int units = sc.nextInt();
    int totalbill = 0;
    if ( units <= 100){
      totalbill = units * 5;
        System.out.println("The cost 0f first  units:" + totalbill); 
    }
     else if ( units <= 200){
     int first100 = 100 * 5;
     int remaining = (units - 100) * 7;
     totalbill = first100 + remaining;
        System.out.println("The cost 0f next 100 units:"+ first100); 
         System.out.println("Cost of next " + (units - 100) + " units: " + remaining);
    }
     else  {
        int first100 = 100 * 5;
        int next100 = 100 * 7;
        int remaining = (units - 200)* 10;
        totalbill = first100 + next100 + remaining;
      System.out.println(" cost 0f first 100 units:"+ first100);
      System.out.println("Cost of next 100 units: " + next100);
    System.out.println("Cost of remaining " + (units - 200) + " units: " + remaining); 
    }
     System.out.println("Total bill: " + totalbill);
//      Student Grade Calculator
     System.out.println("STUDENT Grade Calculator");
    System.out.print("Enter your marks: ");
     int marks=sc.nextInt();
     if ( marks < 0 || marks > 100){
       System.out.println("Invalid Marks entered: " + marks);
     }
     else if (marks >= 90 ) {
                System.out.println("You have got A grade: " + marks);
     }
      else if (marks >= 75) {
                System.out.println("You have got B grade: " + marks);
     }
 else if (marks >= 50) {
                System.out.println("You have got C grade: " + marks);
     }
  else {
    System.out.println("You are failed the exam: " + marks);
  }
//   Smallest of Three Numbers
System.out.println("Smallest of Three Numbers");
System.out.print("Enter the first number: ");
int firstNumber1 = sc.nextInt();
System.out.print("Enter the secoond number: "); 
int secondNumber1 = sc.nextInt();
System.out.print("Enter the third number: "); 
int thirdNumber1 = sc.nextInt();
if (firstNumber1 == secondNumber1 && secondNumber1 == thirdNumber1) {
    System.out.println("All numbers are equal: " + firstNumber);
}
else if ( firstNumber1 < secondNumber1 && firstNumber1 < thirdNumber1){
    System.out.println("First Number is the smallest Number: " + firstNumber);
}
 else if ( secondNumber1 < thirdNumber1 && secondNumber1 < firstNumber1){
    System.out.println("Second Number is the smallest Number: " + secondNumber1);
}
else {
        System.out.println("Third Number is the smallest Number: " + thirdNumber1);
}
int smallest = Math.min(firstNumber1, Math.min(secondNumber1, thirdNumber1));
System.out.println("Smallest number is: " + smallest);
//  Traffic Signal 🚥
    System.out.println("Traffic Signal Control.");
String signal = sc.next();
            System.out.print("Enter signal (red/yellow/green): ");
     if (signal.equals("red")) {
    System.out.println("STOP");
} else if (signal.equals("yellow")) {
    System.out.println("READY");
} else if (signal.equals("green")) {
    System.out.println("GO");
} else {
    System.out.println("Invalid signal");
}

// Problems On Switch
// Basic calculator using Switch
System.out.println("Basic Calculator");
// char operator = sc.next().charAt(0);
System.out.print("Enter the first number: ");
int a = sc.nextInt();
System.out.print("Enter the first number: ");
int b = sc.nextInt();
System.out.print("Enter operator (+, -, *, /): ");
  char operator = sc.next().charAt(0);
switch(operator){
    case '+' : System.out.println("Result: " + (a+b));
   break;
   case '-' : System.out.println("Result: " + (a-b));
   break;
   case '*' : System.out.println("Result: " + (a*b));
   break;
   case '/' : System.out.println("Result: " + (a / b));
   break;
   default:
        System.out.println("Invalid operator");
}
    double result;
    switch(operator){
        case '+': 
        result = ( a + b);
        System.out.println("Result: " + result);
        break;
         case '-':
         result = ( a - b);
         System.out.println("Result: " + result);
         break;
         case '*' : result = ( a * b); System.out.println("Result: " + result); break;
                  case '/' : result = ( a / b); System.out.println("Result: " + result); break;
         default :
                 System.out.println("Invalid operator");
    }
                 //  Days of the Week
                 System.out.println("Days of the Week");
                 System.out.print("Enter the days(1-7): ");
                 int day=sc.nextInt();
                 switch(day){
                    case 1 : System.out.println("1.Monday");break;
                    case 2 : System.out.println("Tuesday"); break;
                    case 3 : System.out.println("wednesday"); break;
                    case 4 : System.out.println("Thursday"); break;
                    case 5 : System.out.println("Friday"); break;
                    case 6 : System.out.println("Saturday"); break;
                    case 7 : System.out.println("Sunday"); break;
                    default : System.out.println("Invalid number entered.");
                 }
//                  Problem 3: Cinema Snacks 🎬🍿
                 System.out.println("Cinema Snaks");
                 System.out.println("Menu we have: \n1.Popcorn \n2.Coke \n3. Nachos \n4.Burger");
                 System.out.print("Enter your snack number: ");
                 int snack=sc.nextInt();
                 switch(snack){
                    case 1 : 
                    System.out.println("You Have Choosed Popcorn.");
                    break;
                    case 2 : 
                    System.out.println("You have selected Coke.");
                    break;
                    case 3 :
                    System.out.println("You have selected Nachos.");
                    break;
                    case 4:
                    System.out.println("You have selected Burger.");
                    break;
                    default:
                    System.out.println("Invalid data entered.");
                 }
//                Banking Menu 💰
                 System.out.println("Banking menu");
                 System.out.println("Menu Driven: \n1.Deposit \n2.Withdraw \n3.Check Balance");
                int balance = 10000;
                 System.out.println("Your Balance: " + balance);
                  System.out.print("Enter your choice (1-3): ");
                  int choice=sc.nextInt();
                  switch(choice){
                    case 1 : 
                    System.out.println("Enter the Deposited Amount: ");
                    int depositAmount = sc.nextInt();
                     balance = balance + depositAmount;
//                  balance += depositAmount;
                    System.out.println("Deposited Amount: " + depositAmount);
                    System.out.println("New Balance: " + balance);
                    break;
                    case 2 :
                    System.out.println("Enter withdrawal amount: ");
                    int withdrawalAmout = sc.nextInt();
                     balance = balance - withdrawalAmout;
                      System.out.println("Withdrawal Amount: " + withdrawalAmout);
                    System.out.println("New Balance: " + balance);
                       break;
                    case 3 : 
                    System.out.println("Check Balance: " + balance );
                    break ;
                    case 4:
            System.out.println("Thank you for banking with us!");
            return; 
                    default:
                    System.out.println("Invalid information provided.");
            
                  }

            
  









       



    }
}
