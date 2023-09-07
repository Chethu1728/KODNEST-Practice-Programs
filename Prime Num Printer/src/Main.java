import java.util.Scanner;

public class Main {
	public static void printPrimes(int n)

	{
		int count=0;
		for(int i=2;count<n;i++)
		{
			int m=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					m++;
				}
			}
			if(m==2)
			{
			System.out.print(i+" ");
			count++;
			}
		}
	}

	public static void main(String[] args) { 
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		printPrimes(n);
		
		} 

}
