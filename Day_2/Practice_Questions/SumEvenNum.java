package Practice_Questions;

import java.util.Scanner;

public class SumEvenNum {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the number : ");
		int num = sc.nextInt();
		
		int sum = num * (num+1);
		System.out.println("sum of first n "+num + "Even number = " + sum);


	

	}

}
