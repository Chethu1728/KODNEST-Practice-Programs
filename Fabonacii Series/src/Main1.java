import java.util.Scanner;

public class Main1 {
	public static void printFibonacciSeries(int n)
	{
	int n1=0,n2=1,next=0;
	for(int i = 2;i<=n;i++)
	{
		
		next=n1+n2;
		n1 = n2;
		n2=next;
		
	}
	System.out.print(n1+" ");
	
}
	public static void main(String[] args)

	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		printFibonacciSeries(n);
		scan.close();
	}
}