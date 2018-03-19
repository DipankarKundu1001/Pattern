package org.patern.Stars;

import java.util.Scanner;
/*
		    *
		   * *
		  *   *
		 *     *
		*********
 */
public class HollowPyramidUp 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of lines :- ");
		int n = sc.nextInt();
		sc.close();
		
		printPattern(n);
	}
	
	private static void printPattern(int n)
	{
		for(int i = 1; i < n; i++)
		{
			for(int j = 0; j < n-i; j++)
				System.out.print(" ");
			for(int j = 0; j < 2*i-1; j++)
			{
				if(j == 0 || j == 2*i-2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		for(int i = 0; i < 2*n-1; i++)
			System.out.print("*");
	}

}
