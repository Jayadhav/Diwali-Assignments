package Practice_Questions;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter teh Number : ");
		int num =sc.nextInt();
		long fact = 1;
		for ( int i=1;i<=num;i++)
		{
			fact= fact*i;
			
		}
		System.out.println("Factorial )Of  "+num +"is :" +fact);
				
		
	
	}

}
