package org.patern.Stars;

import java.util.Scanner;

/*
          *
         ***
        *****
       *******
      *********
 */
public class HalfDiamond 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of lines :- ");
		int n = sc.nextInt();
		sc.close();
		int star = 1, space = n*2;
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < space ; j++)
				System.out.print(" ");
			for(int j = 0; j < star; j++)
				System.out.print("*");
			System.out.println();
			space--;
			star+=2;
		}
	}

}
