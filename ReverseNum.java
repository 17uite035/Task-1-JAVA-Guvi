import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
       int num,reverse =0;
       Scanner sc=new Scanner(System.in);
       num = sc.nextInt();
       while(num!=0)
       {
       int temp= num%10;
       reverse = reverse *10+temp;
       num =num/10;
       }
       System.out.println(reverse);
    }
}
