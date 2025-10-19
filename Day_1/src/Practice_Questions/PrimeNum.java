package Practice_Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNum {

	   public static void main(String[] args) 
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number n: ");
	        int n = sc.nextInt();

	        List<Integer> primes = generatePrimes(n);
	        System.out.println("Prime numbers up to " + n + " are: " + primes);
	    }

	    
	   
	   
	    public static List<Integer> generatePrimes(int n) 
	    {
	        List<Integer> primeList = new ArrayList<>();

	        for (int i = 2; i <= n; i++) {
	            if (isPrime(i)) {
	                primeList.add(i);
	            }
	        }
	        return primeList;
	    }
	    
	    
	    
	    

	    public static boolean isPrime(int num) 
	    {
	        if (num < 2)
	            return false;

	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0)
	                return false;
	        }
	        return true;
	    }
	}