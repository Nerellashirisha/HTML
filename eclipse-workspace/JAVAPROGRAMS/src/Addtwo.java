
public class Addtwo 
{

	public static void main(String[] args)
	{
		int a=46,var=1,start=1,count=0;
		int b=46/10;
		int c=46%10;
		int d=c+b;
		System.out.println("addition of two digit number is:"+d);
		while(start<=d)
		{
			var=var*start;
			if(d%start==0)
			{
				count++;
			}
			start++;
		}
		
		System.out.println("factorial of given number is:"+var);
		System.out.println("total count is:"+count);
	}
}
//int a,b=20,c=30;
//for(a=10;a<b;a++)
//{
	//if(a>b && a>c)
	//{
	//	System.out.println("a is greater");
	//}
//	else if(b>a && b>c)
	//{
		//System.out.println("b is greater");
	//}
	//else
	//{
		//System.out.println("c is greater");
	//}
//}

