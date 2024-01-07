import java.util.Scanner;
public class NumCheck{
    public static void main(String[] args) {
       int num;
       Scanner sc=new Scanner(System.in);
       num = sc.nextInt();
       if (num>0)
       {
           System.out.println("The Given Number is positive");
       }
       else if (num<0)
       {
           System.out.println("The Given Number is Negative");
       }
       else
       {
           System.out.println("Given number is Zero");
       }
    }
}
