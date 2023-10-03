
public class Extraction1 
{

	public static void main(String[] args) 
	{
		int num=56473,count=0,rem;
		for (;num>0;num/=10)
		{
			count++;
		}
	
	System.out.println(count);
	
	
	//printing even /odd in extraction model
	num=678532;
	int remain;
	for(;num>0;num/=10)
	{
		remain=num%10;
		if(remain%2==0)
		{
			System.out.println("even number:"+remain);
			
		}
		else
		{
			System.out.println("odd number:"+remain);
		}
	}
	
	// printing random numbers
	
	int var=0;
	num=678532;
	int remainder;
	for(;num>0;num/=10)
	{
		var++;
		remainder=num%10;
		if(var==3|| var==5)
		{
			System.out.println(remainder);
		}
		}
	
	
	// printing multiplication in extraction model using while loop
	
//int number=4372,rem1,temp=0,mul1=1,mul2=1;
//while(number>0)
//{
	//temp++;
	//rem1=number%10;
	//if(temp==1||temp==4)
	//{
	//	mul1=rem1*mul1;
	//}
	//else
	//{
	//	mul2=mul2*rem1;
		
	//}
	//number/=10;
	
//}
//System.out.println(mul1+mul2);
		
	//finding position

		//number=765432;
		//int rem2,factor=0;
		//for(;number>0;number/=10)
		//{
		//	factor++;
			//rem2=number%10;
			//if(factor==3 || factor==6)
			//{
			//	System.out.println(rem2);
			//}
		//}
		
		
		//printing sum in extraction model
		
		
		int n=567483,rem3;
		int var1=0;int sum1=0,sum2=0;
		for(;n>0;n/=10)//567483//56748//5674//567//56//5
		{
			var1++;//1//2//3//4//5
			rem3=n%10;//3//8//4//7
			if(var==1||var==3||var==5)//1==1//3==3//4==4
			{
				sum1=sum1+rem3;//3//3+4=7//7+6=13
			}
			else//2==2//4==4//6==6
			{
				sum2=sum2+rem3;//8//8+7=15//15+5=20
			}
			
		}
		System.out.println("total sum is:"+sum1+sum2);//13+20//33
		
		
		// printing multiplication in extraction model using for loop
		
		int number=4372,rem1,temp=0,mul1=1,mul2=1;
		for(;number>0;number/=10)
		{
			temp++;
			rem1=number%10;
			if(temp==1||temp==4)
			{
				mul1=rem1*mul1;
			}
			else
			{
				mul2=mul2*rem1;
				
			}
			number/=10;
			
		}
		System.out.println(mul1+mul2);

	}
}
	
	
	

