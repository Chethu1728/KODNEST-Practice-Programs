
public class Main1 {
	void digit(int num)
	{
		int digit=0;
		while(num!=0)
		{			
			num=num/10;
			digit++;
		}
		System.out.println(digit);
	}

}
