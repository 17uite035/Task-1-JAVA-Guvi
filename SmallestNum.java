import java.util.Scanner;

public class Javatask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3;
	       Scanner sc=new Scanner(System.in);
	       num1 = sc.nextInt();
	       Scanner sc1=new Scanner(System.in);
	       num2 = sc1.nextInt();
	       Scanner sc2=new Scanner(System.in);
	       num3 = sc2.nextInt();
	       if (num1<=num2 && num1<=num3)
	       {
	           System.out.println(num1+"is Smallest");
	       }
	       else  if(num2<=num1 && num2<=num3)
	       {
	           System.out.println(num2+"is Smallest");
	       }
	       else{
	           System.out.println(num3+"is Smallest");
	       }
	}

}
