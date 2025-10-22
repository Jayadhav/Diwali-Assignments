package Practice_Questions;

import java.util.Scanner;

public class Pattern01 {

	public static void main(String[] args) 
	{
		System.out.println(" Enter the number of rows : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i =0 ;i<=num ; i++)
		{
			for (int j =0 ;j<i ; j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
	}

}


