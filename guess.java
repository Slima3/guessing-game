import java.util.*;

public class guess {
   public static void main(String [] args){
   Scanner input = new Scanner(System.in);
   Random rand = new Random();
   int x = rand.nextInt(50);  
   System.out.println("enter a number between 0 and 49");
   int user = input.nextInt();
   if(user < x){
   System.out.print("too low try higher");
   }
   else if (user > x){
   System.out.print("too high try lower");
   }
   else
   {
   System.out.println("congrats");
   }
   }
}