
public class Task3
{

	public static void main(String[] args)
	{
		int num=11,rem,count=0,var=0,temp=num;
		for(;num>0;num/=10)
		{
			rem=num%10;//1//1
			var=var*10+rem;//10//11
			
		}
		num=temp;
		//System.out.println(var);
		//System.out.println("count is:"+count);
		if(num==var)
		{
			for(int start=1;start<=num/2;start++)
			{
				if(num%start==0)//11%1//11%2//
				{
				count++;//1
				}
				
			}
			if(count>0)
			{
			System.out.println("not palindrome prime");
					
				}
				
				else
				{
					System.out.println(" palindrome prime");
				}
			}
		}
	}


	
	

