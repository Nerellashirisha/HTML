
public class Primenumbers 
{

	public static void main(String[] args) 
	{
		int n=7597,count=0,rem=0,var=0;
		
	
			for(;n>0;n/=10)
			{
				count=0;
				rem=n%10;//7//9
				int temp=rem;//7//9
				int start=2;//2//2
			for(;start<=temp/2;start++)//2<=3//3<=3//2<=4//3<=4
			{

			if(temp%start==0)//7%2==0//9%2==0//9%3==0
			{
				count++;//1
				//break;
			}
			
			//n=temp;
		//System.out.println(count);
			}
		if(count==0)//0
			System.out.println(rem);//7
}
	}
	}
