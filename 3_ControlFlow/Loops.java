import java.util.*;
public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    //    Print numbers 1 to 10
//         System.out.println("Print numbers 1 t0 10");
//           for ( int a=1; a <= 10; a++){
//                 System.out.println(a); 
//         }
//     //    Print multiplication table of a number
//         System.out.println("Multiplication Table");
//         System.out.print("Enter a number:");
//         int b = sc.nextInt();
//         for ( int b1 = 1; b1 <= 10 ; b1++){
//             System.out.println(b + "*" + b1 + "=" + b*b1 );
//         }
//         // Sum of first N natural numbers
//         System.out.println("Sum of first N natural numbers");
//         System.out.print("Enter a number: ");
//         int c = sc.nextInt();  
//            // System.out.println(c*(c+1)/2);
//         int sum = 0;
//         for ( int c1 = 1; c1 <= c ; c1 ++){
//             //  sum = sum + c1;
//              sum += c1;
//         }
//         System.out.println("sum = " + sum);
//     //   Sum of Even Numbers
//      System.out.println("Sum of Even Numbers");
//      System.out.print("Enter a number: ");
//      int d1 = sc.nextInt();
//      int sum1 = 0;
//      for ( int d=2;  d <= d1 ; d+=2){
//         sum1 = sum1 + d;
//      }
//      System.out.println("Sum of even number up to " + d1 + ": " + sum1);
//             //  Sum of Odd Numbers
//           System.out.println("Sum of Odd Numbers");
//         System.out.print("Enter a number: ");
//         int e1 = sc.nextInt();
//         int sume1 = 0;
//           for (int e=1; e <= e1 ; e+=2){
//             sume1 = sume1 + e;
//           }
//       System.out.println("Sum of odd number up to " + e1 + ": " + sume1);
//         // Sum of Squares of First n Numbers
//     System.out.println("Sum of Squares of First n Numbers");
//       System.out.print("Enter a number: ");
//          int f1 = sc.nextInt();
//          int sumf1 = 0;
//          for ( int f=1; f <= f1 ; f++ ){
//             sumf1 += f*f;
//          }
//          System.out.println(sumf1);
//      System.out.println("Sum of Squares of First n numbers" + f1 + ": " + sumf1);

// //          Sum of Cubes of First n Numbers
//         System.out.println("Sum of Cubes of First n Numbers");
//           System.out.print("Enter a number: ");
//          int g1 = sc.nextInt();
//            int sumg1 = 0;
//            for ( int g = 1 ; g <= g1; g++){
//             sumg1=sumg1+(g*g*g);
//            }
//          System.out.println("Sum of Cubes of First n Numbers" + g1 + ": " + sumg1);
// // Sum of Multiples of a Number (like 5) up to n
//  System.out.println("Sum of Multiples of a Number (like 5) up to n");
//             System.out.print("Enter a number: ");
//             int h1 = sc.nextInt();
//             int sumh1 = 0;
//             for( int h = 0; h <= h1 ; h+=5){
//                 sumh1 +=h;
//             }
//           System.out.println("Sum of Multiples of a Number (like 5) up to n" + h1 + ": " + sumh1);
                //  Factorial of n
        //       System.out.println("Factorial of n");
        //     System.out.print("Enter a number: ");
        //     int i1 = sc.nextInt();
        //  int  factorial = 1;
        //  for ( int i = 1; i <= i1 ; i++){
        //     factorial =  factorial*i;
        //  }
        //  System.out.println("Factorial of " + i1 + ": " + factorial);
//            Fibonacci Series (first n terms)
             System.out.println("Fibonacci Series");
             System.out.print("Enter a number: ");
           int j1 = sc.nextInt();
           int Fibonacci = 0;
           for ( int j = 0 ; j <= j1; j++){
                    Fibonacci = Fibonacci + j;
           }
              System.out.println(Fibonacci);
// Input: n = 7 → Output: 0 1 1 2 3 5 8


        







    }
}
