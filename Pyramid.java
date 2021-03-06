package org.patern.Stars;

import java.util.Scanner;

/*
		    *
		   ***
		  *****
		 *******
		*********

 */
public class Pyramid 
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
		for(int i = 1; i <= n; i++)
		{
			for(int j = 0; j < n-i; j++)
				System.out.print(" ");
			for(int j = 0; j < 2*i-1; j++)
				System.out.print("*");
			System.out.println();
		}
	}

}
