
public class prime2 {

	public static void main(String[] args)
	{
		//using break  in loops 
		
		int b,n=17;
		int count=0;
		for(b=2;b<=n/2;b++)
		{
			if(n%2==0)
			{
			count++;
			break;
		     }
		}
		if(count==0)
		{	
			System.out.println("prime");
		}
		else 
		{
			System.out.println("not prime");
		}
		
		//break at some random numebr
		
	int a,c=20;
	for(a=2;b<=c;a++)
	{
		if(b<10)
		{
			System.out.println(b);
			break;
		}
	}
	//INFINITE LOOP EXAMPLE
	
	//for(;true;)
	//{
		//System.out.println("hello");
	//}
	
	// using break
	
	for(a=1;a<11;a++)
	{
		if(a==7)//7==7//terminated
		{
			break;
		}
		System.out.println(a);
	}
	
	// using continue
	
	for(a=1;a<11;a++)
	{
		if(a==7)
		{
			continue;//skipped
		}
		System.out.println(a);
	}
	
	
	}
	
	}
	

