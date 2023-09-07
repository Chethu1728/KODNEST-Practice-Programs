package RaiseToThePowerOfDigits;

public class Power {
	void solve(int num)
	{
		int digi=0;
		int res=1;
		int num1=num;
		while(num1!=0)
		{
			num=num/10;
			digi++;
		}
		for(int i=1;i<=digi;i++)
		{
			num=num*res;
			if(i==digi) {
				System.out.println(num);
			}
		}
		
		
	}

}
