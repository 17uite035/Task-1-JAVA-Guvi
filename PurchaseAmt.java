import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	float amount=0,temp=0,temp1=0;
	System.out.println("Enter the Purchase Amount");
	Scanner sc=new Scanner(System.in);
	amount = sc.nextFloat();
	if(amount< 500)
	{
	   System.out.println("No discount!!\nFinal payable amount: "+amount);
	}else if(amount>=500 && amount<=1000){
	    temp = amount -((amount*10)/100);
	    System.out.println("10% discount!!\nFinal payable amount: "+temp);
	}else{
	    temp1 =amount- ((amount*20)/100);
	    System.out.println("20% discount!!\nFinal payable amount: "+temp1);
	}
	}

}
