package Practice_Questions;

import java.util.Scanner;

public class PascalTriangle 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int num = sc.nextInt();

        int[][] triangle = new int[num][num];

        for (int i = 0; i < num; i++) {
           
            triangle[i][0] = 1;
            triangle[i][i] = 1;

           
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
            }
        }

        
        for (int i = 0; i < num; i++) {
            
            for (int s = 0; s < num - i - 1; s++) {
                System.out.print("  ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + "   ");
            }

            System.out.println();
        }
    }
}
