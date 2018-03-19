package org.patern.Stars;

import java.util.Scanner;
/*
		
		    * 
		   * * 
		  *   * 
		 *     * 
		*       * 
		 *     *
		  *   *
		   * *
		    *
 */
public class HollowDiamond 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers of lines :- ");
		int n = sc.nextInt();
		sc.close();
		
		printPattern(n);
	}
	
	private static void printPattern(int n)
	{
		// printing upper triangle
		for(int i = 1; i <= n; i++)
		{
			//print space
			for(int j = 1; j <= n-i; j++)
				System.out.print(" ");
			
			for(int j = 0; j <= (2*i-1); j++)
			{
				if(j==0 || j == (2*i-2))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		//printing lower triangle
		n--;
		for(int i = n; i >= 1; i--)
		{
			//print space
			for(int j = n-i; j >= 1; j--)
				System.out.print(" ");
			for(int j = (2*i-1); j >=0; j--)
			{
				if(j==0 || j == (2*i-2))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
