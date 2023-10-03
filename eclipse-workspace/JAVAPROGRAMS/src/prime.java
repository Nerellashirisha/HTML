
public class prime 
{

	public static void main(String[] args)
	{
		int num=10,a,count=0;
		for(a=1;a<=10;a++)
		{
			if(num%a==0)
			{
				System.out.println("factor of 10 is:"+a);
			count++;
			}
		}
		System.out.println("count of factors is:"+count);
		if(count==2)
		{
			System.out.println("given number is prime ");
		}
		else
		{
			System.out.println("given number is not a prime");
		}
		//backward direction
		int n1=11,end=2,n2=n1,var=0;
		for(n2=n1;n2>=end;n2--)
		{
			if(n1%n2==0)
			{
				var++;
			}
		}
		System.out.println("factor of 11 is:"+var);
		if(var==1)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not a prime");
		}
		
		// last digit prime number
		
		int number=174;
		int number2=174%10;
		if(number2==2)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not perime");
	
		}
		}
}
