package com.kodnest.patterns.javapatterns;

public class P20 {
	public static void pattern(int n) {
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(  i==0 || i==n/2 || j==0 || j==n) {
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
