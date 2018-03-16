package org.patern.Stars;

import java.util.Scanner;
/*
		*
		**
		***
		****
		***
		**
		*

 */
public class PerpendicularHalfTrangle 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = 0;
		while(n%2 == 0)
		{
			System.out.println("Enter the number of odd lines :- ");
			n = sc.nextInt();
		}
		sc.close();
		int star = 1;
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < star; j++)
				System.out.print("*");
			
			if(i < n/2)
				star++;
			else
				star--;
			
			System.out.println();
		}
	}

}
