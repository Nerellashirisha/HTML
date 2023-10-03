
public class Primerange 
{

	public static void main(String[] args)
	{
		// PRIME RANGE PROGRAM
		
		int x,y,count=0;
		for(x=1;x<=100;x++)
		{
			count=0;//0
		for(y=2;y<=x/2;y++)
		{
			if(x%y==0)//2%2==0
			{
				count++;//1
				break;
			}
		}
		if(count==0)
		{
			System.out.println(x);
		}
		
		}
		
		//PALINDROME RANGE PROGRAM
		
		int a=1,b,rem,var=0,temp=a;
		for(;a<=200;a++)//1<=200//2<=200//3<=200//4----------9>0//10>0//11>0
		{
			var=0;
			for(b=a;b>0;b/=10)//1>0  1/10==>0//2>0//2/10==>0//3>0  3/10==>0//4>0 4/10==>0//10>0// 10/10  /1/10==0
			{//11>0
				
				
				rem=b%10;//1//2//3//4//5//6//7//8//9/10%10==0//1%10==1==01//11%10==1////1%10==1
				var=var*10+rem;//1//2//3//4//5//6//7//8//9//1//1//1==>11
			}
			b=temp;//11=
			
			if(a==var)//11==11//22==22
			{
				System.out.println(a);//1//2//3//4//5//6//7//8//9//11//22//33//44//55//66//77//88//99//101//111
			} 						//121//131//141//151//161//171//181//191
		}
	}
}

