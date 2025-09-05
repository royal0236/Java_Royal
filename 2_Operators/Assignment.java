import java.util.*;
public class Assignment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Basic problems of add,sub,mul,div
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        n +=5;
        System.out.println("After addition, x = " + n);
        n -=7;
        System.out.println("After subtraction, x = " + n);
        n *=10;
        System.out.println("After multiplication, x = " + n);
        n /=2;
        System.out.println("After didvision, x = " + n);
        n %=2;
         System.out.println("After remainder, x = " + n);
         //Input a number x. Add 10, then subtract 3, multiply by 2, divide by 4, and finally take remainder 5. Print the final result.
         int x=sc.nextInt();
         x +=10;
         x -=3;
         x *=2;
         x /=4;
         x %=5;
         System.out.println(x);
         //Input a number num. Double it using *= and then subtract 7 using -=. Print the result.
         int a =sc.nextInt();
         a *=2;
         a -=7;
         System.out.println(a);
         //Input two numbers a and b. Update a as a += b, then b *= 2, then a %= b. Print both a and b.
         int a1=sc.nextInt();
         int b1=sc.nextInt();
          a1 +=b1;
          b1 *=2;
          a1 %=b1;
          System.out.println(a1);
          System.out.println(b1);          
         //Shopping Cart 🛒
         System.out.println("Shopping Cart ");
         System.out.print("Enter the item price: ");
         int price=sc.nextInt();
         price +=50; // delivery charge
         price -=2; // festival discount
         price *=2; // because 2 items bought
        System.out.println("The final price is:" + price);
  
        } 
}
