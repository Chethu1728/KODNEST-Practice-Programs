package com.kodnest.patterns.javapatterns;

public class P19 {
	public static void pattern(int n) {
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(j==n/2 || j==n || j==0 || i==n/2 || i==0 || i==n) {
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
