
public class Evilrange {

	public static void main(String[] args) {

		int n=1,sum=0,rem;
		//int n1=n*n;
		for(;n<=45;n++)//1<=100//2<=100//3<=100//4<=100----9<=10
		{
			int n1=n*n;//1//4//9//16------81
			sum=0;
			
			for(;n1>0;n1/=10)//1>0//1/10==0//4>0//9>0////16>0==6//16/10==>1>0----81
			{
				rem=n1%10;//1//4//9//6//1//8--1
				sum=sum+rem;//1//4//9//6+1=7//8+1==>9
			
			}
				if(n==sum)//1==1//9==9//9==9
				{
					System.out.println(n);//1//9
				}	
				else
				{
					System.out.println(n);
				}
		}
		}
	}

