package Practice_Questions;

import java.util.Scanner;

public class AdditionTwoNum {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first numner : ");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second Number : ");
		int num2 = sc.nextInt();
		int ans = num1 + num2;
		System.out.println(" addition of two numbers is : "+ans);
		sc.close();
		

	}

}
