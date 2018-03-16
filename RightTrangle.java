package org.patern.Stars;

import java.util.Scanner;

/*
		    *
		   **
   		  ***
  		 ****
 		*****

 */
public class RightTrangle 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of lines :- ");
		int n = sc.nextInt();
		sc.close();
		for(int i = 0; i < n; i++)
		{
			for(int j = i; j < n-1 ; j++)
				System.out.print(" ");
			for(int j = 0; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
	}

}
