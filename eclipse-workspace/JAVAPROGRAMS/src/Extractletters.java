
public class Extractletters 
{

	public static void main(String[] args)
	{
		int a=1,rem,var1=0,temp=a,count=0;
		for(;a<=100;a++)//1//2
		{
			count=0;
			var1=0;
			for(int b=a;b>0;b/=10)//1
			{
				count++;
			}
				for(int b=a;b>0;b/=10)
				{
				rem=b%10;//1
				var1=var1*10+rem;
				//count++;//1
			}
			//a=temp;
			System.out.println(var1);
			
		}
	}
}