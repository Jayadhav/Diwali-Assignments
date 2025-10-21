package Practice_Questions;

import java.util.Scanner;

public class ReverseNumber 
{

	public static void main(String[] args) 
	{
		System.out.println("ENter the number :");
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		
		int rev =0;
		int temp =num;
		
		while(num!=0)
		{
			int digit = num %10;
			rev = rev * 10 +digit;
			num = num /10;
			
		}
		
		System.out.println(" Original number IS  " + temp);
		System.out.println(" Reverse Of number is "+ rev);
		sc.close();

	}

}
