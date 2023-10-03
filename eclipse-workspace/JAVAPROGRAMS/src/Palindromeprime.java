
public class Palindromeprime {

	public static void main(String[] args) {
		int a=1,b,rem,var=0,temp=a,count=0;
		for(;a<=200;a++)//1//2//---9//10
		{
			count=0;
			var=0;
		
		for(b=a;b>0;b/=10)//1//2//10//1/10==0
		{
			rem=b%10;//1//2--9//0//10//1
			var=var*10+rem;//1//2--9////01
		}
			for(int start=2;start<=a/2;start++)		//1<=0	//2<=1//10<=5
			{
				if(a%start==0)//1%1==0//
				{
					count++;//1
					break;
				}
			}
		
		
		//a=temp;
		if(a==var && count==0)//2==2&&0==0
		{
			System.out.println(a);//1//2//3//4//5//6//7///
		}
	}
	}
}

