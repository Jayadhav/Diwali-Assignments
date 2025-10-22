package Practice_Questions;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the Number : ");
		int num = sc.nextInt();
		int table =0;
		
		for(int i=1; i<=10;i++)
		{
			int temp = i*num ;
			System.out.println(i + " * " + num + " are  "+ temp ) ;
		}
		
	

	}

}
