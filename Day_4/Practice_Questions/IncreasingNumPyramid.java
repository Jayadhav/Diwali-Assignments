package Practice_Questions;

import java.util.Scanner;

public class IncreasingNumPyramid {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the number : ");
		int num = sc.nextInt();
		
		for(int i=0 ; i<=num ;i++)
		{
			for(int j=1 ; j<=i ; j++)
			{
				System.out.print(j);
			}
			for(int z=1 ; z<=num-i ; z++)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
		
		

	}

}
