package Practice_Questions;

import java.util.Scanner;

public class isAmstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int temp = num;  // store original number
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;           // get last digit
            sum = sum + (digit * digit * digit); // cube of digit
            num = num / 10;                 // remove last digit
        }

        if (sum == temp)
            System.out.println(temp + " is an Armstrong number ✅");
        else
            System.out.println(temp + " is not an Armstrong number ❌");

        sc.close();
    }
}
