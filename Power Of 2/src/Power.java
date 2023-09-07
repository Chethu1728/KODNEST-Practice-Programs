
public class Power {
	void solve(int num,int n)
	{
		int res=1;
		for(int i=1;i<=n;i++)
		{
			 res=res*num;
			 if(i==n)
			 {
				 System.out.println(res);
			 }
		}
		

}
}
