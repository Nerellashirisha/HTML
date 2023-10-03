
public class Extractionexample
{

	public static void main(String[] args) 
	{
		//SUM AND MULTIPLICATION of ALTERNATE DIGITS
		
		int num=32367919,rem,count=0,sum=0,mul=1;
		for(;num>0;num/=10)
		{
			count++;//1//2//3//4//5//6//7//8
			rem=num%10;//9//1//9//7//6//3//2//3
			if(count==1||count==3||count==5||count==7)//1==1//3==3//5==5
			{
				sum=sum+rem;//9//9+9=18//18+6=24//24+2=26
			}
			else //2==2//4==4//6==6//8==8
			{
				mul=mul*rem;//1*1=1//1*7=7//7*3=21//21*3=63
			}
		}
		System.out.println("sum is:"+sum);//26
		System.out.println("multiple is:"+mul);//63

		}	
}

