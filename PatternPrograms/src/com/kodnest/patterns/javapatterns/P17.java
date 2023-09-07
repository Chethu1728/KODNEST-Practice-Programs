package com.kodnest.patterns.javapatterns;

public class P17 {
	public static void pattern(int n)
	{
		for(int i=0;i<=n;i++)
	{
		for(int j=0;j<=n;j++)
		{
			if(i==n/2 || j==n || j==0 || i==0 || i==n) {
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
