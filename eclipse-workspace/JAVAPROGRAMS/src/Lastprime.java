
public class Lastprime 
{

	public static void main(String[] args)
	{
		int a=174,count=0,start=1;
		int b=174%10;//4
		while(start<=b)//1<=4//2<=4//3<=4//4<=4
		{
			if(b%start==0)//4%1==0//4%2==0//4%3==0==>false//4%4==0
			{
				count++;//1//2//3
			}
			start++;//2//3//4//5
			
		}
		System.out.println("total count is:"+count);
		if(count==2)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not a prime");
		}
	}

}
