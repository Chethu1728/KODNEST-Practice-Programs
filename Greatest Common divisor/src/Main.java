import java.util.Scanner;

public class Main {

public static void findGCD(int a, int b)

{
	for(;;)
	{
	int res=a%b;
	a=b;
	b=res;
	if(res==0)
	{
		System.out.println(a);
		break;
	}
	}
	
}

public static void main(String[] args)

{
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	int b=scan.nextInt();
	findGCD(a, b);

}

}
