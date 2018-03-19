package org.patern.Stars;

/*
  	*****
  	*	*
  	*	*
  	*	*
  	*****
 */

import java.util.Scanner;
public class HoloSquare 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of lines :- ");
		int n = sc.nextInt();
		sc.close();
		
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				if(i==0 || j==0 || i==n-1 || j==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
