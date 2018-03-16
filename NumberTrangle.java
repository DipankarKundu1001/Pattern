package org.patern.Stars;

import java.util.Scanner;

/*
	1
	22
	333
	4444
	55555

 */
public class NumberTrangle
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers of lines :- ");
		int n = sc.nextInt();
		sc.close();
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j <= i; j++)
			{
				System.out.print(i+1);
			}
			System.out.println();
		}
	}

}
