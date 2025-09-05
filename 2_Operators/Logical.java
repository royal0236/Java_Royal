import java.util.*;
public class Logical {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         //Loan Approval System
         System.out.println("Loan Approval System");
         System.out.print("Enter your income: ");
         int income = sc.nextInt();
         System.out.print("Enter your credit score: ");
         int creditScore = sc.nextInt();
         System.out.print("Enter your age: ");
         int age = sc.nextInt();
         if ((income >= 30000 && creditScore >= 700) && age >= 21 && age <= 60){
            System.out.print("Loan Approved");
         }
         else {
              System.out.println("Loan Rejected ");
         }
          // Online Exam Login 🖥️
           sc.nextLine();
          System.out.println("Online Exam Login");
//         sc.nextLine();
          System.out.print("Enter your username: ");
          String userName1=sc.nextLine();
          System.out.print("Enter your password: ");
           String password=sc.nextLine();
          System.out.print("Enter the otp: ");
          int otp=sc.nextInt();
          if (userName1.equals("Student") && password.equals("Java123")&& otp == 9999) {
             System.out.println("Login Successful! Welcome to Online Exam!");
          }
          else {
            System.out.println("Login Failed");
          }
         //📝 Login System Requirements: Username - should be at least 4 characters , Password - should be at least 8 characters , OTP - should be exactly 6 digits
         String correctUsername = "admin123";
        String correctPassword = "password123";
        String correctOtp = "123456";
        System.out.println("=== WELCOME TO LOGIN SYSTEM ===");
         sc.nextLine();
         System.out.print("Enter your username: ");
         String userName=sc.nextLine();
        if ( userName.length() < 4){
        System.out.println("Username must be at least 4 characters long!");
        return;
        }
        System.out.print("Enter your password: ");
        String userPassword=sc.nextLine();
        if ( userPassword.length() < 5){
            System.out.println("Password must be at least 5 characters long!");
         return ;
        }
        System.out.print("Enter the otp received to your mobile: ");
        String userOtp=sc.nextLine();
        if ( userOtp.length() !=6 ){
        System.out.println("OTP must be exactly 6 digits!");
       return ;
        }
        if (correctUsername.equals(userName) && correctPassword.equals(userPassword) && correctOtp.equals(userOtp)){
            System.out.println(" Login Successful! Welcome, " + correctUsername + "!");
        }
        else {
            System.out.println("Login Failed! Invalid credentials.");
        }
        //College Admission 🎓  Input: marks, sportsQuota, recommendationLetter.
        System.out.println("College Admission");
        System.out.print("Enter your Marks: ");
        int marks = sc.nextInt();
        System.out.print("Sport Quota (true/false): ");
        boolean sportsQuota=sc.nextBoolean();
        System.out.print("recommendationLetter( true/false): ");
        boolean recommendationLetter=sc.nextBoolean();
        if ((marks >= 90) || (marks >= 70 && sportsQuota) || (recommendationLetter)){
            System.out.println("Admission granted.");
        }
        else {
          System.out.println("Admission rejected.");
        }
    }
}
