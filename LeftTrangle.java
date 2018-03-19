package org.patern.Stars;

import java.util.Scanner;

public class LeftTrangle 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers of lines :- ");
		int n= sc.nextInt();
		sc.close();
		
		printPattern(n);
	}
	
	private static void printPattern(int n)
	{
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < i; j++)
				System.out.print(" ");
			for(int j = 0; j < n-i; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
