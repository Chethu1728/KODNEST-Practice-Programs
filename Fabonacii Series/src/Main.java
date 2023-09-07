import java.util.Scanner;

public class Main {
	public static void printFibonacciSeries(int n)
	{
	int n1=0,n2=1,next=0;
	for(int i = 1;i<=n;i++)
	{
		System.out.print(n1+" ");
		next=n1+n2;
		n1 = n2;
		n2=next;
	}
}
	public static void main(String[] args)

	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		printFibonacciSeries(n);
		scan.close();
	}
}