package com.kodnest.patterns.javapatterns;

import java.util.Scanner;

public class Pattern26 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if((i==0&&j<=n/2)||(j==0&&i<=n/2)||i==n/2||j==n/2 || (j==n&&i>=n/2) || (i==n&&j>=n/2)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
