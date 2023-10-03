
public class Tasks
{

	public static void main(String[] args)
	{
		int num=6,rem,count=0,var=0,temp=num;
		for(;num>0;num/=10)
		{
			rem=num%10;//1//1
			var=var*10+rem;//10//11
			for(int start=1;start<=num/2;start++)
			{
				if(num%start==0)//11%1//11%2//
				{
				count++;//1
				}
			}
			//rem=num%10;//1//1
			//var=var*10+rem;//10//11
			
		}
		num=temp;
		System.out.println(var);
		System.out.println("count is:"+count);
		if(num==var && count<=2)
		{
			System.out.println(" palindrome prime");
		}
		else
		{
			System.out.println(" not a palindrome prime");
		}
		//int n=121,temp=n,count=0,rem;
		//for()
	}

}
