package com.kodnest.patterns.javapatterns;

public class P22 {
	public static void pattern(int n) {
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(i==0 || i==n || j==0 || i==n/2) {
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
