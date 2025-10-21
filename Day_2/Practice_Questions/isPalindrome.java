package Practice_Questions;

import java.util.Scanner;

public class isPalindrome {

	public static void main(String[] args) 
	{
		System.out.println("ENter the number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int rev = 0;
		int temp = num ;
		
		while (num!=0)
		{
			int rem = num%10;
			rev = rev * 10 + rem;
			num = num /10;
		}
		
		if(temp == rev)
		{
			System.out.println(temp + " is a palindrome ");
		}
		else
		{
			System.out.println(temp +" is not a palindrome ");
		}
		
	    
	

	}

}
