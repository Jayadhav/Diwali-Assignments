package Practice_Questions;

import java.util.Scanner;

public class IncreasingNumReversePyramid {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number for reverse pyramid ");
		int num =sc.nextInt();
		
		for(int i=0 ; i<=num ; i++)
		{
			for(int j=1 ; j<=num-i ; j++)
			{
				System.out.print(j);
			}
			for (int k=1 ; k<=i ; k++)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
