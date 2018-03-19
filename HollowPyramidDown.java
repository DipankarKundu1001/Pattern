package org.patern.Stars;

import java.util.Scanner;
/*
		*********
		 *     *
		  *   *
		   * *
		    *

 */
public class HollowPyramidDown 
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
		for(int i = 0; i < 2*n-1; i++)
			System.out.print("*");
		System.out.println();
		for(int i = n-1; i >= 1; i--)
		{
			for(int j = n-i; j > 0; j--)
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
		
	}
}
