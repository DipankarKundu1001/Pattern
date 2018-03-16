package org.patern.Stars;

import java.util.Scanner;

/*
		1
		01
		101
		0101	
		10101

 */
public class ZeroOneTrangle 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of lines :- ");
		int n = sc.nextInt();
		sc.close();
		
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j <= i ; j++)
			{
				if((i+j)%2 == 0)
					System.out.print("1");
				else
					System.out.print("0");
			}
			System.out.println();
		}
	}
}
