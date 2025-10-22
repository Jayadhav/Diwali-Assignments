package Practice_Questions;

import java.util.Scanner;

public class NumberChangingPyramid {

	public static void main(String[] args) 
	{
		Scanner cs = new Scanner(System.in);
		System.out.println("enter the rows : ");
		int num = cs.nextInt();
		
		int count = 1;
		
		for(int i=1 ; i<=num ; i++)
		{
			for(int j=1 ; j<=i ; j++)
			{
				System.out.print(count+ " ");
				count++;
			}
			for(int k=1 ; k<=num-i ; k++)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}

}
