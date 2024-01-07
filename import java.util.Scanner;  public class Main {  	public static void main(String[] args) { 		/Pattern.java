import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int num,i,j;
	System.out.println("Enter no of rows");
	Scanner sc=new Scanner(System.in);
	num = sc.nextInt();
	for(i=num;i>=1;i--)
	{
	    for(j=num;j>=1;j--)
	    {
	        System.out.print(i>j?i:j);
	    }
	    System.out.println();
	}

}
}
