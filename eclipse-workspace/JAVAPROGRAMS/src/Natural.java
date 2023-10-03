
public class Natural {

	public static void main(String[] args) 
	{
		// FORWARD SUM 
		
		int start,end=10,var=0;
		for(start=1;start<=end;start++)
		{
			var=var+start;
		}
		System.out.println("forward sum is:"+var);
		
		//BACKWARD SUM
		
		int a=1,count=0;
		for(start=10;start>=a;start--)
		{
			count=count+start;
		}
		System.out.println("backward sum is:"+count);
		
		//FACTORIAL NUMBER
		int x,b=5,fact=1;
		for(x=1;x<=b;x++)
	{
			fact=fact*x;
		}
		System.out.println("factorial of a number is:"+fact);
		
		// finding factors
		
		int s,e=10;
		for(s=1;s<=end;s++)
		{
			if(e%s==0)
			{
				System.out.println("factors are:"+s);
			}
		}
		
	
	}
}
