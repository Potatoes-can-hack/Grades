import java.util.Scanner;

public class grades {
   public static void main(String[] args) {
       System.out.println("Enter your marks");
       Scanner sc = new Scanner(System.in);
       int i = sc.nextInt();
       if (i>=60) {
           System.out.println("A grade for you");
       }
       else{
           System.out.println("B grade for you");
       }
   }
}
