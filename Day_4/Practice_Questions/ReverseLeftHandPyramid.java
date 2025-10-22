package Practice_Questions;

import java.util.Scanner;

public class ReverseLeftHandPyramid {

	public static void main(String[] args) 
	{
		System.out.println("ENter the rows : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=1 ; i<=num ; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(" ");
			}
			for(int k=0 ;k<=num-i ; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
