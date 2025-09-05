import java.util.*;
public class Unnary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Like Counter (Social Media)
        System.out.println("Like Counter");
        System.out.println("Social Media Like Counter");
        int likes = 0;
        System.out.println("User1 liked your post!");
        likes ++;
        System.out.println("User2 liked your post!");
        likes ++;
        System.out.println("User3 liked your post!");
        likes ++;
        System.out.println("User4 liked your post!");
        likes ++;
        System.out.println("User5 liked your post!");
        likes ++;
        System.out.println("Total likes" + likes );
        if ( likes >= 5){
                System.out.println("Total likes" + likes );
        } 
        else {
            System.out.println("Need more likes " + likes);
        }
       // Problem 2: Bus Ticket Counter 🚌
        System.out.println("Bus Tickets");
        System.out.println("Total 10 tickets are avaliable.");
        int tickets=10;
        System.out.println(" passenger bought one ticket no:" + tickets--);
        System.out.println(" passenger bought one ticket no:" + tickets--);
        System.out.println(" passenger bought one ticket no:" + tickets--);
        System.out.println("Remaining tickets are:" + tickets);
//          Elevator Floor Counter 🏢
         System.out.println("Elevator floor counter");
           int floor = 0;
          System.out.println("UP button pressed elevator at floor no: " + floor++);
          System.out.println("UP button pressed elevator at floor no: " + floor++);
           System.out.println("UP button pressed elevator at floor no: " + floor++);
           System.out.println("DOWN button pressed elevator at floor no: " + floor--);
          System.out.println("The final floor is : " + floor);


















    }
}
