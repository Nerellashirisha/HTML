
public class Automaticrange 
{

	public static void main(String[] args)
	{
		
//AUTOMATIC RANGE
		
		//int n,rem=0;
		//for(n=10;n<=500;n++)
		//{
			//int n1=n*n;
			//rem=0;
			
				//for(;n1>0;n1/=100)
				//{
				//rem=n1%100;
				
					//if(rem==n)
					//{
						//System.out.println(n);
					//}
				//}
			
		//}
		
//technology number range
		
		int num=2025,count=0,rem=0,num1,num2,result;
		for(;num<=4025;num++)
		{
			num1=num%100;
			num2=num/100;
			result=0;
			result=num1+num2;
			//int r=result*result;
			for(;result>0;result/=100)
			{
				//result=num1+num2;
				
				int r=result*result;
				
			
					if(num==r)
					{		
						System.out.println(num);
					}
		//else
		//{
			//System.out.println("not a technology number");
			}
		}
	}
}
