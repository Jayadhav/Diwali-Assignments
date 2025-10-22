package Practice_Questions;

import java.util.Scanner;

public class ReverseRightHandpyramid {

	public static void main(String[] args) 
	{
		System.out.println("enter the rows : ");
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=1 ; i<=num ; i++)
		{
			for(int j=1 ; j<=num-i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	
		
		

	}

}
