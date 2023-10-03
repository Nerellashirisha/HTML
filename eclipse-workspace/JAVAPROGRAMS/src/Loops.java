
public class Loops 
{

	public static void main(String[] args)
	{
		int i=0;
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}
		System.out.println("false condition is:"+i);
		
		//even and odd number
		int a=0;
		while(a<=10)
		{
			System.out.println("even number are:"+a);
			a=a+2;
		}
		System.out.println("false condition is:"+a);
		
		//USING FOR LOOP
		
		a=1;
		for(a=1;a<=10;a=a+2)
		{
			System.out.println(a);
		}
		
		
		int s,e=10,count=0;
		for(s=1;s<=e/2;s++)
		{
			if(e%s==0)
			{
				System.out.println(s);
				count++;
			}
				
		}
		System.out.println("total count is:"+count);
	}

}
